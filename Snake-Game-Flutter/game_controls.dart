import 'package:flutter/material.dart';
import 'package:snake_game/snake_game_state.dart';

class GameControls extends StatelessWidget {
  final SnakeGameState gameState;

  const GameControls({super.key, required this.gameState});

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.all(50),
      width: double.infinity,
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          IconButton(
            onPressed: () {
              if (gameState.direction != Direction.down) {
                gameState.changeDirection(Direction.up);
              }
            },
            icon: const Icon(Icons.arrow_circle_up, color: Colors.white),
            iconSize: 70,
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              IconButton(
                onPressed: () {
                  if (gameState.direction != Direction.right) {
                    gameState.changeDirection(Direction.left);
                  }
                },
                icon: const Icon(Icons.arrow_circle_left_outlined, color: Colors.teal),
                iconSize: 70,
              ),
              const SizedBox(width: 80),
              IconButton(
                onPressed: () {
                  if (gameState.direction != Direction.left) {
                    gameState.changeDirection(Direction.right);
                  }
                },
                icon: const Icon(Icons.arrow_circle_right_outlined, color: Colors.teal),
                iconSize: 70,
              ),
            ],
          ),
          IconButton(
            onPressed: () {
              if (gameState.direction != Direction.up) {
                gameState.changeDirection(Direction.down);
              }
            },
            icon: const Icon(Icons.arrow_circle_down_outlined, color: Colors.white),
            iconSize: 70,
          ),
        ],
      ),
    );
  }
}
