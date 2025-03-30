import 'package:flutter/material.dart';

class ScoreBoard extends StatelessWidget {
  final int score;
  final int highScore;

  const ScoreBoard({super.key, required this.score, required this.highScore});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(8),
      child: Text(
        "SCORE: $score | HIGH SCORE: $highScore",
        style: const TextStyle(fontSize: 20, fontWeight: FontWeight.bold, color: Colors.teal),
      ),
    );
  }
}
