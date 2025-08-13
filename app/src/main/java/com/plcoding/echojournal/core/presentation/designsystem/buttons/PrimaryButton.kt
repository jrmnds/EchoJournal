package com.plcoding.echojournal.core.presentation.designsystem.buttons


import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.plcoding.echojournal.core.presentation.designsystem.theme.EchoJournalTheme
import com.plcoding.echojournal.core.presentation.designsystem.theme.buttonGradient

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: (@Composable () -> Unit)? = null
){
    Button(
        onClick = onClick,
        enabled = enabled,
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContentColor = MaterialTheme.colorScheme.outline
        ),
        modifier = modifier
            .background(
                brush =  if(enabled) {
                    MaterialTheme.colorScheme.buttonGradient
                } else {
                    SolidColor(MaterialTheme.colorScheme.surfaceVariant)
                },
                shape = CircleShape
            )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            leadingIcon?.let { icon ->
                icon()
                Spacer(Modifier.width(ButtonDefaults.IconSpacing))
            }
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                color = LocalContentColor.current
            )
        }
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    EchoJournalTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            PrimaryButton(text = "Enabled Button", onClick = {})
            PrimaryButton(text = "Disabled Button", onClick = {}, enabled = false)
            PrimaryButton(
                text = "Enabled with Icon",
                onClick = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = null
                    )
                }
            )
            PrimaryButton(
                text = "Disabled with Icon",
                onClick = {},
                enabled = false,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = null,
                    )
                }
            )
        }
    }
}
