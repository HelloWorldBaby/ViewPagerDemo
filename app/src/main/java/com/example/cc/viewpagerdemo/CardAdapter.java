package com.example.cc.viewpagerdemo;

import android.support.v7.widget.CardView;

/**
 * create by Administrator on 2019/5/24
 */
public interface CardAdapter {
    int MAX_ELEVATION_FACTOR = 8;
    float getBaseElevation();
    CardView getCardViewAt(int position);
    int getCount();
}
