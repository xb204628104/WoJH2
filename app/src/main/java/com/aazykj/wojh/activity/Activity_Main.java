package com.aazykj.wojh.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aazykj.wojh.R;
import com.aazykj.wojh.adapter.MyAdapter;
import com.aazykj.wojh.adapter.Myadapter1;
import com.aazykj.wojh.fragment.MyShouYeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/5/16.
 */

public class Activity_Main extends FragmentActivity {
    @Bind(R.id.iv_one_shouye)
    ImageView ivOneShouye;
    @Bind(R.id.tv_one_shouye)
    TextView tvOneShouye;
    @Bind(R.id.ll_one_shouye)
    LinearLayout llOneShouye;
    @Bind(R.id.iv_one_xiaoxi)
    ImageView ivOneXiaoxi;
    @Bind(R.id.tv_one_xiaoxi)
    TextView tvOneXiaoxi;
    @Bind(R.id.ll_one_xiaoxi)
    LinearLayout llOneXiaoxi;
    @Bind(R.id.iv_one_fabu)
    ImageView ivOneFabu;
    @Bind(R.id.tv_one_fabu)
    TextView tvOneFabu;
    @Bind(R.id.ll_one_fabu)
    LinearLayout llOneFabu;
    @Bind(R.id.iv_one_haoyou)
    ImageView ivOneHaoyou;
    @Bind(R.id.tv_one_haoyou)
    TextView tvOneHaoyou;
    @Bind(R.id.ll_one_haoyou)
    LinearLayout llOneHaoyou;
    @Bind(R.id.iv_one_geren)
    ImageView ivOneGeren;
    @Bind(R.id.tv_one_geren)
    TextView tvOneGeren;
    @Bind(R.id.ll_one_geren)
    LinearLayout llOneGeren;
    @Bind(R.id.vp)
    ViewPager vp;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainone);
        ButterKnife.bind(this);
        list = new ArrayList<Fragment>();
        list.add(new MyShouYeFragment());
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),list);
        vp.setAdapter(myAdapter);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    @OnClick({R.id.ll_one_shouye, R.id.ll_one_xiaoxi, R.id.ll_one_fabu, R.id.ll_one_haoyou, R.id.ll_one_geren})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_one_shouye:
                break;
            case R.id.ll_one_xiaoxi:
                break;
            case R.id.ll_one_fabu:
                break;
            case R.id.ll_one_haoyou:
                break;
            case R.id.ll_one_geren:
                break;
        }
    }
}
