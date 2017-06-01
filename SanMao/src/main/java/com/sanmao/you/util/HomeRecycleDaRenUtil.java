package com.sanmao.you.util;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sanmao.you.ui.adapters.HomeRecycleAdapter3;
import com.sanmao.you.ui.adapters.HomeRecycleDaRenAdapter;
import com.sanmao.you.ui.beans.ScenicBean;
import com.sanmao.you.ui.beans.UseBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/5/15.
 */

public class HomeRecycleDaRenUtil {

    private RecyclerView recyclerView;
    private HomeRecycleDaRenAdapter adapter;
    private List<UseBean> mList;

    private Context mContext;

    public HomeRecycleDaRenUtil(Context mContext, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.recyclerView = recyclerView;
        mList = new ArrayList<>();
        adapter = new HomeRecycleDaRenAdapter(mContext, mList);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(adapter);
    }

    public void loadData() {
        UseBean bean1 = new UseBean();
        bean1.setName("Vic在路上");
        bean1.setAge("90后.獅子座.澳洲");
        bean1.setSign("曾經以為在路上認識新朋友是一種幸運，原來真正的幸運石認識我自己");
        bean1.setPhoto("http://img4.imgtn.bdimg.com/it/u=2405421462,1632905134&fm=23&gp=0.jpg");

        UseBean bean2 = new UseBean();
        bean2.setName("愛吃泡菜的彗星");
        bean2.setAge("90后.獅子座.韓國留學生");
        bean2.setSign("曾經以為在路上認識新朋友是一種幸運，原來真正的幸運石認識我自己");
        bean2.setPhoto("http://img4.imgtn.bdimg.com/it/u=734499414,1004111560&fm=11&gp=0.jpg");


        UseBean bean3 = new UseBean();
        bean3.setName("Iliana");
        bean3.setAge("90后.獅子座.發過留學生");
        bean3.setSign("曾經以為在路上認識新朋友是一種幸運，原來真正的幸運石認識我自己");
        bean3.setPhoto("http://img5.imgtn.bdimg.com/it/u=2056231335,4212597522&fm=23&gp=0.jpg");

        mList.clear();
        mList.add(bean1);
        mList.add(bean2);
        mList.add(bean3);
        adapter.notifyDataSetChanged();
    }
}
