package com.plcoding.echojournal.core.presentation.designsystem.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = Primary30,
    primaryContainer = Primary50,
    onPrimaryContainer = MoodPrimary25,
    onPrimary = Primary100,
    inversePrimary = Secondary80,
    secondary = Secondary30,
    secondaryContainer = Secondary50,
    background = NeutralVariant99,
    surface = Primary100,
    surfaceVariant = Gray100,
    onSurface = NeutralVariant10,
    onSurfaceVariant = NeutralVariant30,
    outline = NeutralVariant50,
    outlineVariant = NeutralVariant80,
    errorContainer = Error95,
    onErrorContainer = Error20,
    onError = Error100
)

//Add dark theme support
@Composable
fun EchoJournalTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}