package jolchu.tolik.notesjetpack.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import jolchu.tolik.notesjetpack.ui.theme.NotesJetpackTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesJetpackTheme {
                MyScreen()
            }
        }
    }

}