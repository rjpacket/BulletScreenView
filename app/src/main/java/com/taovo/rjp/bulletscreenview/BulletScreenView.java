package com.taovo.rjp.bulletscreenview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2017/9/3.
 */

public class BulletScreenView extends FrameLayout {
    private Context mContext;

    public BulletScreenView(Context context) {
        super(context);
    }

    public BulletScreenView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BulletScreenView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void initView(Context context, AttributeSet attrs){
        mContext = context;

    }
}
