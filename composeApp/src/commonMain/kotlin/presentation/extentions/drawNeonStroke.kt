package presentation.extentions


import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.NativePaint
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
//import org.jetbrains.skia.FilterBlurMode
//import org.jetbrains.skia.MaskFilter

//import org.jetbrains.skia.FilterBlurMode
//import org.jetbrains.skia.MaskFilter

//expect fun platformShadow(paint: NativePaint)
fun ContentDrawScope.platformShadow(radius: Dp) {
    this.drawIntoCanvas {
        val paint =
            Paint().apply {
                style = PaintingStyle.Stroke
                strokeWidth = 20f
            }

        val frameworkPaint =
            paint.asFrameworkPaint()

        val color = Color.Magenta

        this.drawIntoCanvas {
            frameworkPaint.color = color.copy(alpha = 0f).toArgb()
//            frameworkPaint.setShadowLayer(
//                radius.toPx(), 0f, 0f, color.copy(alpha = .5f).toArgb()
//            )
//            frameworkPaint.maskFilter = MaskFilter.makeBlur(FilterBlurMode.SOLID, 28f)

            it.drawRoundRect(
                left = 0f,
                right = size.width,
                bottom = size.height,
                top = 0f,
                radiusY = radius.toPx(),
                radiusX = radius.toPx(),
                paint = paint
            )
            drawRoundRect(
                color = Color.Magenta,
                size = size,
                cornerRadius = CornerRadius(radius.toPx(), radius.toPx()),
                style = Stroke(width = 1.dp.toPx())
            )
        }
    }
}