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

public class MuDiDiFragment extends Fragment {

    public MuDiDiFragment() {

    }

    public static MuDiDiFragment newInstance() {
        MuDiDiFragment mainFragment = new MuDiDiFragment();
        mainFragment.setArguments(null);
        return mainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_mudidi,null);
        return view;
    }
}
