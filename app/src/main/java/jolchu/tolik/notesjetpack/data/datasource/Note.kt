package jolchu.tolik.notesjetpack.data.datasource

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_entity")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id : Int? = null,
    val title : String,
    val description : String,
    val isFinished: Boolean
)