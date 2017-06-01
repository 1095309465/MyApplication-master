package com.sanmao.you.util;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sanmao.you.ui.adapters.HomeRecycleAdapter;
import com.sanmao.you.ui.beans.ScenicBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/5/15.
 */

public class HomeRecycleZuiXinUtil {
    private RecyclerView recyclerView;
    private HomeRecycleAdapter adapter;
    private List<ScenicBean> mList;

    private Context mContext;

    public HomeRecycleZuiXinUtil(Context mContext, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.recyclerView = recyclerView;
        mList = new ArrayList<>();
        adapter = new HomeRecycleAdapter(mContext, mList);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(adapter);
    }

    public void loadData() {
        ScenicBean bean1 = new ScenicBean();
        bean1.setUrl("https://ss1.baidu.com/9vo3dSag_xI4khGko9WTAnF6hhy/image/h%3D200/sign=dcb3435455da81cb51e684cd6267d0a4/2f738bd4b31c8701d0561946237f9e2f0608ffaa.jpg");
        bean1.setName("巴西");
        mList.clear();
        mList.add(bean1);
        adapter.notifyDataSetChanged();
    }
}
