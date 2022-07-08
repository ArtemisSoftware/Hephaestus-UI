package com.artemissoftware.hephaestusui.ui.multiselect.composables

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.nestedgraph.composables.HyperlinkText
import kotlinx.coroutines.launch

@Composable
fun SelectableItem(
    modifier: Modifier = Modifier,
    selected: Boolean,
    title: String,
    titleSize: TextUnit = MaterialTheme.typography.h6.fontSize,
    titleWeight: FontWeight = FontWeight.Medium,
    subtitle: String? = null,
    borderWidth: Dp = 1.dp,
    borderShape: Shape = RoundedCornerShape(size = 10.dp),
    icon: ImageVector = Icons.Default.CheckCircle,
    onClick: () -> Unit
) {

    val titleColor: Color = if (selected) MaterialTheme.colors.primary else MaterialTheme.colors.onSurface.copy(alpha = 0.2f)

    val subtitleColor: Color = if (selected) MaterialTheme.colors.onSurface else MaterialTheme.colors.onSurface.copy(alpha = 0.2f)

    val borderColor: Color = if (selected) MaterialTheme.colors.primary else MaterialTheme.colors.onSurface.copy(alpha = 0.2f)

    val iconColor: Color = if (selected) MaterialTheme.colors.primary else MaterialTheme.colors.onSurface.copy(alpha = 0.2f)


//    val scaleA = remember { Animatable(initialValue = 1f) }
//    val scaleB = remember { Animatable(initialValue = 1f) }

    val clickEnabled = remember { mutableStateOf(true) }

    LaunchedEffect(key1 = selected) {
//        if (selected) {
//            clickEnabled.value = false
//
//            val jobA = launch {
//                scaleA.animateTo(
//                    targetValue = 0.3f,
//                    animationSpec = tween(
//                        durationMillis = 50
//                    )
//                )
//                scaleA.animateTo(
//                    targetValue = 1f,
//                    animationSpec = spring(
//                        dampingRatio = Spring.DampingRatioLowBouncy,
//                        stiffness = Spring.StiffnessLow
//                    )
//                )
//            }
//            val jobB = launch {
//                scaleB.animateTo(
//                    targetValue = 0.9f,
//                    animationSpec = tween(
//                        durationMillis = 50
//                    )
//                )
//                scaleB.animateTo(
//                    targetValue = 1f,
//                    animationSpec = spring(
//                        dampingRatio = Spring.DampingRatioLowBouncy,
//                        stiffness = Spring.StiffnessLow
//                    )
//                )
//            }
//
//            jobA.join()
//            jobB.join()
//            clickEnabled.value = true
//        }
    }

    Column(
        modifier = modifier
//            .scale(scale = scaleB.value)
            .border(
                width = borderWidth,
                color = borderColor,
                shape = borderShape
            )
            .clip(borderShape)
            .clickable(enabled = clickEnabled.value) {
                onClick()
            }
    ) {
        Row(
            modifier = Modifier.padding(start = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(8f),
                text = title,
                style = TextStyle(
                    color = titleColor,
                    fontSize = titleSize,
                    fontWeight = titleWeight
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            IconButton(
                modifier = Modifier
//                    .weight(2f)
                    /*.scale(scale = scaleA.value)*/,
                onClick = {
                    if (clickEnabled.value) {
                        onClick()
                    }
                }
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = "Selectable Item Icon",
                    tint = iconColor
                )
            }
        }
        if (subtitle != null) {
            Text(
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .padding(bottom = 12.dp),
                text = subtitle,
                style = TextStyle(
                    color = subtitleColor
                ),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {

    Column {
        SelectableItem(selected = true, title = "title", onClick = {})
        Spacer(modifier = Modifier.height(20.dp))
        SelectableItem(selected = false, title = "title", subtitle="subtitlesubtitlesubtitlesubtitlesubtitle", onClick = {})
    }


}