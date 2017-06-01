package com.sanmao.you.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sanmao.you.R;

/**
 * Created by DELL on 2017/5/15.
 */

public class MineFragment extends Fragment {


    public MineFragment() {

    }

    public static MineFragment newInstance() {
        MineFragment mainFragment = new MineFragment();
        mainFragment.setArguments(null);
        return mainFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_mine,null);
        return view;
    }

}
