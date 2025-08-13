package com.plcoding.echojournal.core.presentation.designsystem.buttons


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.echojournal.core.presentation.designsystem.theme.EchoJournalTheme

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
){
    Button(
        onClick = onClick,
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.onPrimaryContainer,
            contentColor = MaterialTheme.colorScheme.primary,
        ),
        modifier = modifier
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = LocalContentColor.current
        )
    }
}

@Preview
@Composable
fun SecondaryButtonPreview() {
    EchoJournalTheme {
        SecondaryButton(text = "Secondary Button", onClick = {})
    }
}
