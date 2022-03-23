package com.artemissoftware.hephaestusui.ui.delivery.composables

import android.text.Html
import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish

@Composable
fun HtmlTextFormater(
    htmlText: String,
    modifier: Modifier = Modifier
) {

    AndroidView(
        modifier = modifier,
        factory = { context ->
            TextView(context).apply {
                text = Html.fromHtml(htmlText)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    HtmlTextFormater(Dish.getMock().priceHtml)
}