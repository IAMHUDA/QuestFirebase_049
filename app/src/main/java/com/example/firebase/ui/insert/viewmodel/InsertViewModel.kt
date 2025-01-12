package com.example.firebase.ui.insert.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.firebase.repository.RepositoryMhs

class InsertViewModel(
    private val repositoryMhs: RepositoryMhs
): ViewModel() {
    var uiEvent: InsertUiState by mutableStateOf(InsertUiState())
        private set
}