package com.Coading.overload.document_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class roundshapeImageview extends ImageView {
    private Path path;
    protected float radius = 18.0f;
    protected RectF rect;

    public roundshapeImageview(Context context) {
        super(context);
        init();
    }

    public roundshapeImageview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public roundshapeImageview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.path = new Path();
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.rect = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        Path path2 = this.path;
        RectF rectF = this.rect;
        float f = this.radius;
        path2.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.path);
        super.onDraw(canvas);
    }
}
