package com.example.administrator.cfte;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Point extends View {

    private int r = 9;
    private boolean isSelected = false;
    private Paint mPaint;

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(0);
        mPaint.setAntiAlias(true);
        mPaint.setColor(getResources().getColor(R.color.colorWhite));
    }


    public Point(Context context) {
        super(context);
        initPaint();
    }

    public Point(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Point(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected) {
            mPaint.setColor(getResources().getColor(R.color.colorConnectDetail));
        } else {
            mPaint.setColor(getResources().getColor(R.color.colorTextColorDemo));
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, r, mPaint);
    }

    @Override
    public void setSelected(boolean selected) {
        isSelected = selected;
        invalidate();
    }
}
