import 'package:flutter/material.dart';
import 'package:snake_game/snake_game_state.dart';


class GameBoard extends StatelessWidget {
  final SnakeGameState gameState;

  const GameBoard({super.key, required this.gameState});

  @override
  Widget build(BuildContext context) {
    return GridView.builder(
      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
        crossAxisCount: gameState.column,
      ),
      itemCount: gameState.row * gameState.column,
      itemBuilder: (context, index) {
        return Container(
          margin: const EdgeInsets.all(0.5),
          decoration: BoxDecoration(
            borderRadius: BorderRadius.circular(6),
            color: gameState.borderList.contains(index)
                ? Colors.black
                : gameState.snakePosition.contains(index)
                    ? (gameState.snakeHead == index ? Colors.teal : Colors.white)
                    : (index == gameState.foodPosition ? Colors.orange : Colors.grey),
          ),
        );
      },
    );
  }
}
