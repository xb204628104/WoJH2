package com.aazykj.wojh.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aazykj.wojh.R;
import com.aazykj.wojh.adapter.MyAdapter;
import com.aazykj.wojh.adapter.Myadapter1;
import com.aazykj.wojh.fragment.MyFaBuFragment;
import com.aazykj.wojh.fragment.MyFragment;
import com.aazykj.wojh.fragment.MyShouYeFragment;
import com.aazykj.wojh.fragment.MyTongXuniFragment;
import com.aazykj.wojh.fragment.MyXiaoXiFragment;
import com.aazykj.wojh.utils.W;

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
    private long fristTime=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainone);
        ButterKnife.bind(this);
        list = new ArrayList<Fragment>();
        list.add(new MyShouYeFragment());
        list.add(new MyXiaoXiFragment());
        list.add(new MyFaBuFragment());
        list.add(new MyTongXuniFragment());
        list.add(new MyFragment());
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),list);
        vp.setAdapter(myAdapter);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        tvOneShouye.setTextColor(Color.parseColor("#1BA9D2"));
                        ivOneShouye.setImageResource(R.mipmap.shouye_lan);
                        tvOneFabu.setTextColor(Color.GRAY);
                        ivOneFabu.setImageResource(R.mipmap.fabu);
                        tvOneGeren.setTextColor(Color.GRAY);
                        ivOneGeren.setImageResource(R.mipmap.gerenzhongxin);
                        tvOneXiaoxi.setTextColor(Color.GRAY);
                        ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi);
                        tvOneHaoyou.setTextColor(Color.GRAY);
                        ivOneHaoyou.setImageResource(R.mipmap.haoyou);
                        break;
                    case 1:
                        tvOneXiaoxi.setTextColor(Color.parseColor("#1BA9D2"));
                        ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi_lan);
                        tvOneGeren.setTextColor(Color.GRAY);
                        ivOneGeren.setImageResource(R.mipmap.gerenzhongxin);
                        tvOneHaoyou.setTextColor(Color.GRAY);
                        ivOneHaoyou.setImageResource(R.mipmap.haoyou);
                        tvOneFabu.setTextColor(Color.GRAY);
                        ivOneFabu.setImageResource(R.mipmap.fabu);
                        tvOneShouye.setTextColor(Color.GRAY);
                        ivOneShouye.setImageResource(R.mipmap.shouye);
                        break;
                    case 2:
                        tvOneFabu.setTextColor(Color.parseColor("#1BA9D2"));
                        ivOneFabu.setImageResource(R.mipmap.fabu_lan);
                        tvOneXiaoxi.setTextColor(Color.GRAY);
                        ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi);
                        tvOneShouye.setTextColor(Color.GRAY);
                        ivOneShouye.setImageResource(R.mipmap.shouye);
                        tvOneHaoyou.setTextColor(Color.GRAY);
                        ivOneHaoyou.setImageResource(R.mipmap.haoyou);
                        tvOneGeren.setTextColor(Color.GRAY);
                        ivOneGeren.setImageResource(R.mipmap.gerenzhongxin);
                        break;
                    case 3:
                        tvOneHaoyou.setTextColor(Color.parseColor("#1BA9D2"));
                        ivOneHaoyou.setImageResource(R.mipmap.haoyou_lan);
                        tvOneShouye.setTextColor(Color.GRAY);
                        ivOneShouye.setImageResource(R.mipmap.shouye);
                        tvOneGeren.setTextColor(Color.GRAY);
                        ivOneGeren.setImageResource(R.mipmap.gerenzhongxin);
                        tvOneXiaoxi.setTextColor(Color.GRAY);
                        ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi);
                        tvOneFabu.setTextColor(Color.GRAY);
                        ivOneFabu.setImageResource(R.mipmap.fabu);
                        break;
                    case 4:
                        tvOneGeren.setTextColor(Color.parseColor("#1BA9D2"));
                        ivOneGeren.setImageResource(R.mipmap.gerenzhongxin_lan);
                        tvOneFabu.setTextColor(Color.GRAY);
                        ivOneFabu.setImageResource(R.mipmap.fabu);
                        tvOneXiaoxi.setTextColor(Color.GRAY);
                        ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi);
                        tvOneShouye.setTextColor(Color.GRAY);
                        ivOneShouye.setImageResource(R.mipmap.shouye);
                        tvOneHaoyou.setTextColor(Color.GRAY);
                        ivOneHaoyou.setImageResource(R.mipmap.haoyou);
                        break;
                }

            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                long secondTime = System.currentTimeMillis();
                if (secondTime-fristTime>2000){
                    W.t("再按一次退出程序");
                    fristTime=secondTime;
                    return true;
                }else {
                    moveTaskToBack(true);
                    //System.exit(0);
                }
                break;
        }
        return super.onKeyUp(keyCode, event);
    }

    @OnClick({R.id.ll_one_shouye, R.id.ll_one_xiaoxi, R.id.ll_one_fabu, R.id.ll_one_haoyou, R.id.ll_one_geren})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_one_shouye:
                vp.setCurrentItem(0);
                tvOneShouye.setTextColor(Color.parseColor("#1BA9D2"));
                ivOneShouye.setImageResource(R.mipmap.shouye_lan);
                tvOneFabu.setTextColor(Color.GRAY);
                ivOneFabu.setImageResource(R.mipmap.fabu);
                tvOneGeren.setTextColor(Color.GRAY);
                ivOneGeren.setImageResource(R.mipmap.gerenzhongxin);
                tvOneXiaoxi.setTextColor(Color.GRAY);
                ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi);
                tvOneHaoyou.setTextColor(Color.GRAY);
                ivOneHaoyou.setImageResource(R.mipmap.haoyou);
                break;
            case R.id.ll_one_xiaoxi:
                vp.setCurrentItem(1);
                tvOneXiaoxi.setTextColor(Color.parseColor("#1BA9D2"));
                ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi_lan);
                tvOneGeren.setTextColor(Color.GRAY);
                ivOneGeren.setImageResource(R.mipmap.gerenzhongxin);
                tvOneHaoyou.setTextColor(Color.GRAY);
                ivOneHaoyou.setImageResource(R.mipmap.haoyou);
                tvOneFabu.setTextColor(Color.GRAY);
                ivOneFabu.setImageResource(R.mipmap.fabu);
                tvOneShouye.setTextColor(Color.GRAY);
                ivOneShouye.setImageResource(R.mipmap.shouye);
                break;
            case R.id.ll_one_fabu:
                vp.setCurrentItem(2);
                tvOneFabu.setTextColor(Color.parseColor("#1BA9D2"));
                ivOneFabu.setImageResource(R.mipmap.fabu_lan);
                tvOneXiaoxi.setTextColor(Color.GRAY);
                ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi);
                tvOneShouye.setTextColor(Color.GRAY);
                ivOneShouye.setImageResource(R.mipmap.shouye);
                tvOneHaoyou.setTextColor(Color.GRAY);
                ivOneHaoyou.setImageResource(R.mipmap.haoyou);
                tvOneGeren.setTextColor(Color.GRAY);
                ivOneGeren.setImageResource(R.mipmap.gerenzhongxin);
                break;
            case R.id.ll_one_haoyou:
                vp.setCurrentItem(3);
                tvOneHaoyou.setTextColor(Color.parseColor("#1BA9D2"));
                ivOneHaoyou.setImageResource(R.mipmap.haoyou_lan);
                tvOneShouye.setTextColor(Color.GRAY);
                ivOneShouye.setImageResource(R.mipmap.shouye);
                tvOneGeren.setTextColor(Color.GRAY);
                ivOneGeren.setImageResource(R.mipmap.gerenzhongxin);
                tvOneXiaoxi.setTextColor(Color.GRAY);
                ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi);
                tvOneFabu.setTextColor(Color.GRAY);
                ivOneFabu.setImageResource(R.mipmap.fabu);
                break;
            case R.id.ll_one_geren:
                vp.setCurrentItem(4);
                tvOneGeren.setTextColor(Color.parseColor("#1BA9D2"));
                ivOneGeren.setImageResource(R.mipmap.gerenzhongxin_lan);
                tvOneFabu.setTextColor(Color.GRAY);
                ivOneFabu.setImageResource(R.mipmap.fabu);
                tvOneXiaoxi.setTextColor(Color.GRAY);
                ivOneXiaoxi.setImageResource(R.mipmap.xiaoxi);
                tvOneShouye.setTextColor(Color.GRAY);
                ivOneShouye.setImageResource(R.mipmap.shouye);
                tvOneHaoyou.setTextColor(Color.GRAY);
                ivOneHaoyou.setImageResource(R.mipmap.haoyou);
                break;
        }
    }
}
