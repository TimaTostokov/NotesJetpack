package jolchu.tolik.notesjetpack.data.repository

import jolchu.tolik.notesjetpack.data.datasource.Note
import jolchu.tolik.notesjetpack.data.datasource.NoteDAO
import javax.inject.Inject

class NoteRepository @Inject constructor(
    private val dao: NoteDAO
) {
    suspend fun insert(note: Note) = dao.insertNote(note)

    suspend fun delete(note: Note) = dao.deleteNote(note)

    suspend fun update(note: Note) = dao.updateNote(note)

    fun getAll() = dao.getAll()

    fun getFiltered(isFinished: Boolean) = dao.getFiltered(isFinished)
}