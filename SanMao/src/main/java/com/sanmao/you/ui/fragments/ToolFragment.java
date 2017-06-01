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

public class ToolFragment extends Fragment {


    public ToolFragment() {

    }

    public static ToolFragment newInstance() {
        ToolFragment mainFragment = new ToolFragment();
        mainFragment.setArguments(null);
        return mainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_tool,null);
        return view;
    }
}
