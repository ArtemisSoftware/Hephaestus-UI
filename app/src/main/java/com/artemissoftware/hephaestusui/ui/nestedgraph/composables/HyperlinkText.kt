package com.artemissoftware.hephaestusui.ui.nestedgraph.composables

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun HyperlinkText(
    modifier: Modifier = Modifier,
    fullText: String,
    linkTextColor: Color = Color.Blue,
    linkTextFontWeight: FontWeight = FontWeight.Medium,
    linkTextDecoration: TextDecoration = TextDecoration.Underline,
    hyperText: HashMap<String, String> = HashMap(),
    fontSize: TextUnit = TextUnit.Unspecified
) {

    val annotatedString = buildAnnotatedString {
        append(fullText)


        hyperText.forEach { (key, value) ->

            val startIndex = fullText.indexOf(key)
            val endIndex = startIndex + key.length

            addStyle(
                style = SpanStyle(
                    color = linkTextColor,
                    fontSize = fontSize,
                    fontWeight = linkTextFontWeight,
                    textDecoration = linkTextDecoration
                ),
                start = startIndex,
                end = endIndex
            )
            addStringAnnotation(
                tag = "URL",
                annotation = value,
                start = startIndex,
                end = endIndex
            )

        }

        addStyle(
            style = SpanStyle(
                fontSize = fontSize
            ),
            start = 0,
            end = fullText.length
        )
    }


    val uriHandler = LocalUriHandler.current


    ClickableText(
        modifier = modifier,
        text = annotatedString,
        onClick = {
            annotatedString
                .getStringAnnotations("URL", it, it)
                .firstOrNull()?.let { stringAnnotation ->
                    uriHandler.openUri(stringAnnotation.item)
                }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    HyperlinkText(
        fullText = "Artemis godess of the hunt",
        hyperText = hashMapOf("godess" to "https://github.com/ArtemisSoftware", "hunt" to "https://github.com/ArtemisSoftware")

    )
}