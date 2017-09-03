package com.taovo.rjp.bulletscreenview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/9/3.
 */

public class BulletView extends LinearLayout {
    public BulletView(Context context) {
        super(context);
        initView(context);
    }

    public BulletView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public BulletView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    public void initView(Context context){
        LayoutInflater.from(context).inflate(R.layout.layout_bullet_view, this);
        ImageView ivHeadView = (ImageView) findViewById(R.id.iv_head_view);
        TextView tvTitle = (TextView) findViewById(R.id.tv_title);
        TextView tvZan = (TextView) findViewById(R.id.tv_zan);
    }
}
