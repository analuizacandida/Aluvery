import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row() {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreviwe() {
    Box {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
        .padding(all = 8.dp)
        .background(color = Color.Blue)
        .padding(all = 8.dp)
        .fillMaxWidth()
        .fillMaxHeight()
    ) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row (modifier = Modifier.padding(
            horizontal = 8.dp,
            vertical = 16.dp
        ).background(color = Color.Red)){
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }

        Box(
            Modifier
            .padding(all = 8.dp)
            .background(color = Color.Green)
        ) {
            Row (
                Modifier
                .padding(all = 8.dp)
                .background(color = Color.Cyan)
            ){
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }
            Column(
                Modifier
                .padding(all = 8.dp)
                .background(color = Color.Magenta)
            ) {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
        }
    }

}
