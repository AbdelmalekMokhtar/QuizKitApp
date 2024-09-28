package com.example.quizkit.ui.Screen.history

import androidx.lifecycle.ViewModel
import com.example.quizkit.data.network.local.room.HistoryEntity
import com.example.quizkit.repository.QuizRepository
import kotlinx.coroutines.flow.Flow


class HistoryViewModel(
    private val repository: QuizRepository
): ViewModel(){

    fun getHistory(): Flow<List<HistoryEntity>> {
        return repository.getHistory()
    }

}