package com.example.cc.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button btn_viewpager;
    private CardPagerAdapter mCardAdapter;
    private ViewPager viewPager;
    private RelativeLayout rl_bg;
    private ShadowTransformer mCardShadowTransformer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_viewpager=findViewById(R.id.btn_viewpager);
        rl_bg=findViewById(R.id.rl_bg);
        viewPager=findViewById(R.id.viewPager);
        btn_viewpager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl_bg.setVisibility(View.VISIBLE);
                mCardAdapter = new CardPagerAdapter();
                mCardAdapter.addCardItem(new CardItem(0, 0));
                mCardAdapter.addCardItem(new CardItem(0, 0));
                mCardAdapter.addCardItem(new CardItem(0, 0));
                mCardAdapter.addCardItem(new CardItem(0, 0));
                mCardShadowTransformer = new ShadowTransformer(viewPager, mCardAdapter);
                mCardShadowTransformer.enableScaling(true);
                viewPager.setAdapter(mCardAdapter);
                viewPager.setPageTransformer(false, mCardShadowTransformer);
                viewPager.setOffscreenPageLimit(3);
            }
        });
    }
}
