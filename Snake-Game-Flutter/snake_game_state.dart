import 'dart:async';
import 'dart:math';
import 'package:shared_preferences/shared_preferences.dart';

enum Direction { up, down, left, right }

class SnakeGameState {
  final Function updateUI;

  SnakeGameState(this.updateUI) {
    makeBorder();
    loadHighScore();
  }

  int row = 20, column = 20;
  List<int> borderList = [];
  List<int> snakePosition = [];
  int snakeHead = 0;
  int score = 0;
  int highScore = 0;
  bool isPlaying = false;
  late Direction direction;
  late int foodPosition;
  Timer? gameTimer;

  Future<void> loadHighScore() async {
    final prefs = await SharedPreferences.getInstance();
    highScore = prefs.getInt('highScore') ?? 0;
    updateUI();
  }

  Future<void> saveHighScore() async {
    final prefs = await SharedPreferences.getInstance();
    if (score > highScore) {
      await prefs.setInt('highScore', score);
      highScore = score;
      updateUI();
    }
  }

  void startGame() {
    if (isPlaying) return;

    isPlaying = true;
    score = 0;
    snakePosition = [45, 44, 43];
    snakeHead = snakePosition.first;
    direction = Direction.right;
    generateFood();

    gameTimer = Timer.periodic(const Duration(milliseconds: 300), (timer) {
      if (!isPlaying) {
        timer.cancel();
        return;
      }
      updateSnake();
      if (checkCollision()) {
        timer.cancel();
        isPlaying = false;
        saveHighScore();
      }
      updateUI();
    });
  }

  bool checkCollision() {
    return borderList.contains(snakeHead) || snakePosition.sublist(1).contains(snakeHead);
  }

  void generateFood() {
    do {
      foodPosition = Random().nextInt(row * column);
    } while (borderList.contains(foodPosition) || snakePosition.contains(foodPosition));
  }

  void updateSnake() {
    switch (direction) {
      case Direction.up:
        snakePosition.insert(0, snakeHead - column);
        break;
      case Direction.down:
        snakePosition.insert(0, snakeHead + column);
        break;
      case Direction.right:
        snakePosition.insert(0, snakeHead + 1);
        break;
      case Direction.left:
        snakePosition.insert(0, snakeHead - 1);
        break;
    }

    if (snakeHead == foodPosition) {
      score++;
      generateFood();
    } else {
      snakePosition.removeLast();
    }

    snakeHead = snakePosition.first;
  }
  
  void makeBorder() {
  borderList.clear(); // Clear previous border values if any

  // Add top border
  for (int i = 0; i < column; i++) {
    borderList.add(i);
  }

  // Add left and right borders
  for (int i = 0; i < row * column; i += column) {
    borderList.add(i); // Left border
    borderList.add(i + (column - 1)); // Right border
  }

  // Add bottom border
  for (int i = (row * column) - column; i < row * column; i++) {
    borderList.add(i);
  }
}

  void changeDirection(Direction up) {}

}
