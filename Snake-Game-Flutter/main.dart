import 'package:flutter/material.dart';
import 'package:snake_game/snake_game_page.dart';
// Ensure this file contains the SnakeGamePage

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: const SnakeGamePage(),
    );
  }
}
