import 'package:flutter/material.dart';
import 'package:snake_game/game_board.dart';
import 'package:snake_game/score_board.dart';
import 'package:snake_game/snake_game_state.dart';
import 'package:snake_game/welcome_screen.dart';

class SnakeGamePage extends StatefulWidget {
  const SnakeGamePage({super.key});

  @override
  State<SnakeGamePage> createState() => _SnakeGamePageState();
}

class _SnakeGamePageState extends State<SnakeGamePage> {
  late SnakeGameState gameState;

  @override
  void initState() {
    super.initState();
    gameState = SnakeGameState(updateUI);
  }

  void updateUI() => setState(() {});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      body: Column(
        children: [
          Expanded(
            child: gameState.isPlaying
                ? GameBoard(gameState: gameState)
                : WelcomeScreen(gameState: gameState),
          ),
          ScoreBoard(score: gameState.score, highScore: gameState.highScore),
          // GameControls(gameState: gameState),
        ],
      ),
    );
  }
}
