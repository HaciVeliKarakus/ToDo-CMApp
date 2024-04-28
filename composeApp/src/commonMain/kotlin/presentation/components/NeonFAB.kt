package presentation.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import presentation.extentions.animatedBorder


@Composable
fun NeonFAB(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = onClick,
        shape = RoundedCornerShape(size = 12.dp),
//        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.animatedBorder(
            listOf(Color.Red, Color.Green, Color.Magenta, Color.Blue),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(12.dp)
        )
    ) {
        Icon(
            imageVector = Icons.Default.Edit,
            contentDescription = "Edit Icon"
        )
    }
}