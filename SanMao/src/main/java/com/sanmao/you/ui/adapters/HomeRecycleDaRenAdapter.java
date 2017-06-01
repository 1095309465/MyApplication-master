package com.sanmao.you.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.sanmao.you.R;
import com.sanmao.you.ui.beans.ScenicBean;
import com.sanmao.you.ui.beans.UseBean;
import com.sanmao.you.util.ImageLoaderUtils;

import java.util.List;

/**
 * Created by DELL on 2017/5/15.
 */

public class HomeRecycleDaRenAdapter extends RecyclerView.Adapter<HomeRecycleDaRenAdapter.Holder> {
    private List<UseBean> mList;
    private Context mContext;

    public HomeRecycleDaRenAdapter(Context mContext, List<UseBean> mList) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public HomeRecycleDaRenAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_home_daren, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(HomeRecycleDaRenAdapter.Holder holder, int position) {
        UseBean scenicBean = mList.get(position);
        ImageLoaderUtils.load(holder.img, scenicBean.getPhoto());
        holder.tvName.setText(scenicBean.getName());
        holder.tvAge.setText(scenicBean.getAge());
        holder.tvSign.setText(scenicBean.getSign());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        SimpleDraweeView img;
        TextView tvName;
        TextView tvAge;
        TextView tvSign;

        public Holder(View itemView) {
            super(itemView);
            img = (SimpleDraweeView) itemView.findViewById(R.id.img);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvAge = (TextView) itemView.findViewById(R.id.tv_age);
            tvSign = (TextView) itemView.findViewById(R.id.tv_sign);
        }
    }
}
