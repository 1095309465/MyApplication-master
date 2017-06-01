package com.sanmao.you.util;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sanmao.you.ui.adapters.HomeRecycleAdapter;
import com.sanmao.you.ui.adapters.HomeRecycleAdapter2;
import com.sanmao.you.ui.beans.ScenicBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/5/15.
 */

public class HomeRecycleZuiXinUtil2 {
    private RecyclerView recyclerView;
    private HomeRecycleAdapter2 adapter;
    private List<ScenicBean> mList;

    private Context mContext;

    public HomeRecycleZuiXinUtil2(Context mContext, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.recyclerView = recyclerView;
        mList = new ArrayList<>();
        adapter = new HomeRecycleAdapter2(mContext, mList);
        recyclerView.setLayoutManager(new GridLayoutManager(mContext, 2));
        recyclerView.setAdapter(adapter);
    }

    public void loadData() {
        ScenicBean bean1 = new ScenicBean();
        bean1.setUrl("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1543734726,3829613310&fm=23&gp=0.jpg");
        bean1.setName("美国");

        ScenicBean bean2 = new ScenicBean();
        bean2.setUrl("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2996030356,157755371&fm=23&gp=0.jpg");
        bean2.setName("纽约");

        mList.clear();
        mList.add(bean1);
        mList.add(bean2);
        adapter.notifyDataSetChanged();
    }
}
