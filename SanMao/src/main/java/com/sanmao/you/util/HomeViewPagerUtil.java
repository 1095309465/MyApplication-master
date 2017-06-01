package com.sanmao.you.util;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.sanmao.you.R;
import com.sanmao.you.ui.adapters.MainFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/5/15.
 */

public class HomeViewPagerUtil implements ViewPager.OnPageChangeListener {
    private ViewPager viewPager;
    private LinearLayout lin_dot;
    private MainFragmentPagerAdapter fragmentPagerAdapter;
    private Context mContext;
    private int index = -1;
    private Handler mHandler = new Handler();
    private List<String> urlList;
    private int delayTime = 3000;
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            int nowIndex = viewPager.getCurrentItem();
            nowIndex++;
            viewPager.setCurrentItem(nowIndex);
            mHandler.postDelayed(this, delayTime);

        }
    };

    public HomeViewPagerUtil(Context mContext, ViewPager viewPager,LinearLayout lin_dot) {
        this.mContext = mContext;
        this.viewPager = viewPager;
        this.lin_dot=lin_dot;
        urlList = new ArrayList<>();
        fragmentPagerAdapter = new MainFragmentPagerAdapter();
        viewPager.setAdapter(fragmentPagerAdapter);
        viewPager.addOnPageChangeListener(this);


    }

    public void loadData() {
        urlList.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3756842529,2344699374&fm=170&s=BD28679026A2291542ACD0AD03006081&w=640&h=359&img.JPEG");
        urlList.add("https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=995565944,3069295988&fm=170&s=DEDA15C140129BDC88F96D160300C0C2&w=640&h=413&img.JPEG");
        urlList.add("https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2034851099,1249900740&fm=170&s=D2A39A451E027E514AA444B903001003&w=640&h=359&img.JPEG");
        urlList.add("https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=3557660222,3952657004&fm=170&s=228B9D4D5ABBBA5B0EBD982F03006041&w=640&h=390&img.JPEG");

        refreshViewPager(urlList);
    }

    private void refreshViewPager(List<String> urlList) {
        if (urlList.size() <= 0) return;
        fragmentPagerAdapter.strList.clear();
        fragmentPagerAdapter.mList.clear();
        fragmentPagerAdapter.strList.addAll(urlList);
        lin_dot.removeAllViews();
        for (int i = 0; i < urlList.size(); i++) {
            View contentView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_main, null);
            fragmentPagerAdapter.mList.add(contentView);
            ImageView image = new ImageView(mContext);
            image.setScaleType(ImageView.ScaleType.CENTER);
            image.setPadding(0, 0, 10, 0);
            image.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            if (i == 0) {
                image.setImageResource(R.mipmap.home_dot2);
            } else {
                image.setImageResource(R.mipmap.home_dot1);
            }
            lin_dot.addView(image);
        }
        fragmentPagerAdapter.notifyDataSetChanged();
        stopScroll();
        startScroll();
    }


    public void startScroll() {
        if (urlList.size() <= 0) return;
        mHandler.postDelayed(mRunnable, delayTime);
    }

    public void stopScroll() {
        mHandler.removeCallbacks(mRunnable);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        int noxIndex = position % urlList.size();
        if (index == noxIndex) return;
        for (int i = 0; i < lin_dot.getChildCount(); i++) {
            ImageView img = (ImageView) lin_dot.getChildAt(i);
            if (noxIndex == i) {
                img.setImageResource(R.mipmap.home_dot2);
                index = noxIndex;
            } else {
                img.setImageResource(R.mipmap.home_dot1);
            }

        }


    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
