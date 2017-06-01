package com.sanmao.you.commom;

import android.app.Application;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.sanmao.you.util.LogUtil;
import com.sanmao.you.util.ToastUtil;

/**
 * Created by DELL on 2017/5/15.
 */

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtil.init(getApplicationContext());
        Fresco.initialize(this);
        LogUtil.init("qsj",true);
    }
}
