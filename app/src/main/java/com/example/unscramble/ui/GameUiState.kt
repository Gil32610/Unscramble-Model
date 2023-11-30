package com.example.unscramble.ui

data class GameUiState(
    val currentScrambleWord: String = "",
    val isGuessedWrong: Boolean = false,
    val score: Int =0,
    val currentWordCount: Int = 1,
    val isGameOver: Boolean = false
)
