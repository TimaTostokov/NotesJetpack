package jolchu.tolik.notesjetpack.ui

import jolchu.tolik.notesjetpack.data.datasource.Note
import jolchu.tolik.notesjetpack.util.DISPLAY_TYPE

data class UiState(
    val displayType: DISPLAY_TYPE = DISPLAY_TYPE.ALL,
    val currentList: List<Note> = emptyList()
)