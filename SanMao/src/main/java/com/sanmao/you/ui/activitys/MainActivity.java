package com.sanmao.you.ui.activitys;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.sanmao.you.R;
import com.sanmao.you.ui.fragments.MineFragment;
import com.sanmao.you.ui.fragments.MuDiDiFragment;
import com.sanmao.you.ui.fragments.ToolFragment;
import com.sanmao.you.ui.fragments.TuiJianFragment;
import com.sanmao.you.util.LogUtil;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private TextView tv_tuijian;
    private TextView tv_mudidi;
    private TextView tv_gongju;
    private TextView tv_wode;
    private View ly_content;
    private List<Fragment> mList;
    private int fragmentIndex = -1;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        tv_tuijian = (TextView) findViewById(R.id.tv_tuijian);
        tv_mudidi = (TextView) findViewById(R.id.tv_mudidi);
        tv_gongju = (TextView) findViewById(R.id.tv_gongju);
        tv_wode = (TextView) findViewById(R.id.tv_wode);
        ly_content = findViewById(R.id.ly_content);
        tv_tuijian.setSelected(true);
    }

    @Override
    public void initData() {

        addFragment();
    }

    private void addFragment() {
        mList = new ArrayList<>();
        mList.clear();
        mList.add(TuiJianFragment.newInstance());
        mList.add(MuDiDiFragment.newInstance());
        mList.add(ToolFragment.newInstance());
        mList.add(MineFragment.newInstance());
        for (int i = 0; i < mList.size(); i++) {
            Fragment fragment = mList.get(i);
            if (i == 0) {
                getSupportFragmentManager().beginTransaction().add(R.id.ly_content, fragment).show(fragment).commit();
            } else {
                getSupportFragmentManager().beginTransaction().add(R.id.ly_content, fragment).hide(fragment).commit();

            }

        }
    }

    public void btn(View view) {
        int index = -1;
        switch (view.getId()) {
            case R.id.tv_tuijian:
                index = 0;
                break;
            case R.id.tv_mudidi:
                index = 1;
                break;
            case R.id.tv_gongju:
                index = 2;
                break;
            case R.id.tv_wode:
                index = 3;
                break;


        }
        showFragment(index);
        setSecletState(index);

    }

    public void setSecletState(int index) {
        if (index < 0) return;
        switch (index) {
            case 0:
                tv_tuijian.setSelected(true);
                tv_mudidi.setSelected(false);
                tv_gongju.setSelected(false);
                tv_wode.setSelected(false);
                break;

            case 1:
                tv_tuijian.setSelected(false);
                tv_mudidi.setSelected(true);
                tv_gongju.setSelected(false);
                tv_wode.setSelected(false);

                break;
            case 2:
                tv_tuijian.setSelected(false);
                tv_mudidi.setSelected(false);
                tv_gongju.setSelected(true);
                tv_wode.setSelected(false);
                break;
            case 3:
                tv_tuijian.setSelected(false);
                tv_mudidi.setSelected(false);
                tv_gongju.setSelected(false);
                tv_wode.setSelected(true);
                break;
        }


    }


    private void showFragment(int index) {
        LogUtil.show("showFragment="+index);
        if (index < 0) return;
        if (fragmentIndex == index) {
            return;
        }
        for (int i = 0; i < mList.size(); i++) {
            Fragment fragment = mList.get(i);
            if (i == index) {
                getSupportFragmentManager().beginTransaction().show(fragment).commit();
                fragmentIndex = index;
            } else {
                getSupportFragmentManager().beginTransaction().hide(fragment).commit();

            }

        }
    }
}
