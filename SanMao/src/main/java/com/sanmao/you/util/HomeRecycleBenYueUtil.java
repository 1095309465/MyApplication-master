package com.sanmao.you.util;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sanmao.you.ui.adapters.HomeRecycleAdapter;
import com.sanmao.you.ui.adapters.HomeRecycleAdapter3;
import com.sanmao.you.ui.beans.ScenicBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/5/15.
 */

public class HomeRecycleBenYueUtil {
    private RecyclerView recyclerView;
    private HomeRecycleAdapter3 adapter;
    private List<ScenicBean> mList;

    private Context mContext;

    public HomeRecycleBenYueUtil(Context mContext, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.recyclerView = recyclerView;
        mList = new ArrayList<>();
        adapter = new HomeRecycleAdapter3(mContext, mList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void loadData() {
        ScenicBean bean1 = new ScenicBean();
        bean1.setUrl("https://ss0.baidu.com/7Po3dSag_xI4khGko9WTAnF6hhy/image/h%3D200/sign=9bde0cd5d288d43fefa996f24d1fd2aa/728da9773912b31bd78c66898218367adbb4e1aa.jpg");
        bean1.setName("法国");
        ScenicBean bean2 = new ScenicBean();
        bean2.setUrl("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2938320373,3130448469&fm=23&gp=0.jpg");
        bean2.setName("巴黎");

        ScenicBean bean3 = new ScenicBean();
        bean3.setUrl("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=532161469,2784008208&fm=23&gp=0.jpg");
        bean3.setName("歐洲");
        mList.clear();
        mList.add(bean1);
        mList.add(bean2);
        mList.add(bean3);
        adapter.notifyDataSetChanged();
    }
}
