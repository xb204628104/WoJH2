package com.aazykj.wojh.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aazykj.wojh.R;
import com.aazykj.wojh.app.MyApplication;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by zykj on 2017/5/16.
 */

public class MyShouYeFragment extends Fragment {
    private Banner banner1;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.activity_main, null);
        //ButterKnife.bind(this, view);
        banner1= (Banner) view.findViewById(R.id.banner_ba);
        return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        List<Integer> list = new ArrayList<Integer>();
        list.add(R.mipmap.homeguanggao);
        list.add(R.mipmap.homeguanggao);
        list.add(R.mipmap.homeguanggao);
        banner1.setImageLoader(new MyIm());
        banner1.setImages(list);
        banner1.setBannerStyle(BannerConfig.NUM_INDICATOR);
        banner1.start();
    }
    public class MyIm extends ImageLoader{
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load("file://" + path)
                    .error(R.mipmap.homeguanggao)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .skipMemoryCache(false)
                    .into(imageView);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);

    }
}
