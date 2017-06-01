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

public class HomeRecycleReMenUtil {
    private RecyclerView recyclerView;
    private HomeRecycleAdapter adapter;
    private List<ScenicBean> mList;

    private Context mContext;

    public HomeRecycleReMenUtil(Context mContext, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.recyclerView = recyclerView;
        mList = new ArrayList<>();
        adapter = new HomeRecycleAdapter(mContext, mList);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(adapter);
    }

    public void loadData() {
        ScenicBean bean1 = new ScenicBean();
        bean1.setUrl("https://ss0.baidu.com/7Po3dSag_xI4khGko9WTAnF6hhy/image/h%3D200/sign=9bde0cd5d288d43fefa996f24d1fd2aa/728da9773912b31bd78c66898218367adbb4e1aa.jpg");
        bean1.setName("法国");
        ScenicBean bean2 = new ScenicBean();
        bean2.setUrl("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2938320373,3130448469&fm=23&gp=0.jpg");
        bean2.setName("巴黎");
        mList.clear();
        mList.add(bean1);
        mList.add(bean2);
        adapter.notifyDataSetChanged();
    }
}
