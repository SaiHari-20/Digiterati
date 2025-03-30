

import 'package:flutter/material.dart';
import 'package:snake_game/snake_game_state.dart';

class WelcomeScreen extends StatelessWidget {
  final SnakeGameState gameState;

  const WelcomeScreen({super.key, required this.gameState});

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: const BoxDecoration(
        image: DecorationImage(
          image: AssetImage("assets/background.jpg"),
          fit: BoxFit.cover,
        ),
      ),
      child: Center(
        child: ElevatedButton(
          onPressed: gameState.startGame,
          style: ElevatedButton.styleFrom(backgroundColor: Colors.teal),
          child: const Text("START GAME", style: TextStyle(color: Colors.white, fontSize: 20)),
        ),
      ),
    );
  }
}
