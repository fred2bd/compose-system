package com.sol.composesystem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Screen5(data: String) {
    Column(
        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = data,
            modifier = Modifier.padding(10.dp),
            color = Color.White,
            fontStyle = FontStyle.Italic, textAlign = TextAlign.Center

        )
        Spacer(modifier = Modifier.weight(.5f))

        Text(text = "Bottom text")
        Text(text = "Bottom text", modifier = Modifier.padding(top = 10.dp))
        Spacer(modifier = Modifier.weight(.08f))

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreen5() {
    Screen5(data = "text data.........................................................................................................................................................")
}