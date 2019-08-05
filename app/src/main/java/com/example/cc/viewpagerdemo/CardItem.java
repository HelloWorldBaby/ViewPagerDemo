package com.example.cc.viewpagerdemo;

/**
 * create by Administrator on 2019/5/24
 */
public class CardItem {
    private int mTextResource;
    private int mTitleResource;
    public CardItem(int title, int text) {
        mTitleResource = title;
        mTextResource = text;
    }
    public int getText() {
        return mTextResource;
    }
    public int getTitle() { return mTitleResource; } }

