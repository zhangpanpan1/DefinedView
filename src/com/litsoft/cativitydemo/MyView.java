package com.litsoft.cativitydemo;

 
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
	private Paint mPaint;
	private Context mContext;
	private static final String mString = "Welcome to Mr Wei's blog";

	public MyView(Context context) {
		super(context);
		mPaint = new Paint();
	}

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mPaint = new Paint();

		TypedArray a = context
				.obtainStyledAttributes(attrs, R.styleable.MyView);

		int textColor = a.getColor(R.styleable.MyView_textColor, 0XFFFFFFFF);
		float textSize = a.getDimension(R.styleable.MyView_textSize, 36);

		mPaint.setTextSize(textSize);
		mPaint.setColor(textColor);

		a.recycle();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		// 设置填充
		mPaint.setStyle(Style.FILL);
		
		mPaint.setColor(Color.BLUE);
		// 画一个矩形,前俩个是矩形左上角坐标，后面俩个是右下角坐标
		canvas.drawRect(new Rect(10, 10, 100, 100), mPaint);

		
		
		mPaint.setColor(Color.RED);
		// 绘制文字
		canvas.drawText(mString, 10, 110, mPaint);
	}
}
