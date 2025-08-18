package com.plcoding.echojournal.core.presentation.designsystem.chips


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.echojournal.core.presentation.designsystem.theme.Gray6

@Composable
fun HashTagChip(
    text: String,
    modifier: Modifier = Modifier,
    trailingIcon: (@Composable () -> Unit)? = null,
){
    Surface(
       shape = CircleShape,
        color = Gray6,
        modifier = modifier,
    ){
        Row(
            modifier = Modifier
                .semantics(mergeDescendants = true){}
                .padding(
                    vertical = 4.dp,
                    horizontal = 8.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "#",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(text = text)
            trailingIcon?.invoke()
        }
    }
}

@Preview
@Composable
private fun HashTagChipPreview(){
    MaterialTheme {
        HashTagChip(text = "hashtag")
    }
}

@Preview
@Composable
private fun HashTagChipWithIconPreview(){
    MaterialTheme {
        HashTagChip(text = "hashtag",
            trailingIcon = { Icon(imageVector = Icons.Default.Close, contentDescription = null) })
    }
}
