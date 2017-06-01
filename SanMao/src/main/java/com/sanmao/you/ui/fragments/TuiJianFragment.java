package com.sanmao.you.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.sanmao.you.R;
import com.sanmao.you.util.HomeRecycleBenYueUtil;
import com.sanmao.you.util.HomeRecycleDaRenUtil;
import com.sanmao.you.util.HomeRecycleReMenUtil;
import com.sanmao.you.util.HomeRecycleZuiXinUtil;
import com.sanmao.you.util.HomeRecycleZuiXinUtil2;
import com.sanmao.you.util.HomeViewPagerUtil;

/**
 * Created by DELL on 2017/5/15.
 */

public class TuiJianFragment extends Fragment {
    private ViewPager viewPager;
    private LinearLayout lin_dot;
    private HomeViewPagerUtil viewPagerUtil;
    private HomeRecycleReMenUtil homeRecycleReMenUtil;
    private RecyclerView recycle_remen;
    private RecyclerView recycle_zuixin;
    private HomeRecycleZuiXinUtil homeRecycleZuiXinUtil;
    private RecyclerView recyclerViewH;
    private HomeRecycleZuiXinUtil2 homeRecycleZuiXinUtil2;

    private RecyclerView recycle_benyue;
    private HomeRecycleBenYueUtil homeRecycleBenYueUtil;
    private RecyclerView recycle_daren;
    private HomeRecycleDaRenUtil  homeRecycleDaRenUtil;


    public TuiJianFragment() {

    }

    public static TuiJianFragment newInstance() {
        TuiJianFragment mainFragment = new TuiJianFragment();
        mainFragment.setArguments(null);
        return mainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_tuijian, null);
        initView(view);
        initData();
        return view;
    }

    public void initView(View view) {
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        lin_dot = (LinearLayout) view.findViewById(R.id.lin_dot);
        recycle_remen = (RecyclerView) view.findViewById(R.id.recycle_remen);
        recycle_zuixin = (RecyclerView) view.findViewById(R.id.recycle_zuixin);
        recyclerViewH = (RecyclerView) view.findViewById(R.id.recycle_zuixin_h);
        recycle_benyue= (RecyclerView) view.findViewById(R.id.recycle_benyue);
        recycle_daren= (RecyclerView) view.findViewById(R.id.recycle_daren);
    }

    public void initData() {
        viewPagerUtil = new HomeViewPagerUtil(getActivity(), viewPager, lin_dot);
        viewPagerUtil.loadData();
        homeRecycleReMenUtil = new HomeRecycleReMenUtil(getActivity(), recycle_remen);
        homeRecycleReMenUtil.loadData();
        homeRecycleZuiXinUtil = new HomeRecycleZuiXinUtil(getActivity(), recycle_zuixin);
        homeRecycleZuiXinUtil.loadData();
        homeRecycleZuiXinUtil2 = new HomeRecycleZuiXinUtil2(getActivity(), recyclerViewH);
        homeRecycleZuiXinUtil2.loadData();

        homeRecycleBenYueUtil=new HomeRecycleBenYueUtil(getActivity(),recycle_benyue);
        homeRecycleBenYueUtil.loadData();

        homeRecycleDaRenUtil=new HomeRecycleDaRenUtil(getActivity(),recycle_daren);
        homeRecycleDaRenUtil.loadData();
    }

}
