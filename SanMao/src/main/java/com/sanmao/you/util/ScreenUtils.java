package com.sanmao.you.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.DisplayMetrics;

/**
 * @类名:ScreenUtils * @类描述:屏幕工具类 * @修改人: * @修改时间: * @修改备注: * @版本:
 */
public class ScreenUtils {
    /**
     * * @方法说明:获取DisplayMetrics对象 * @方法名称:getDisPlayMetrics * @param context
     * * @return * @返回值:DisplayMetrics
     */
    public static DisplayMetrics getDisPlayMetrics(Context context) {
        DisplayMetrics metric = new DisplayMetrics();
        if (null != context) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(metric);
        }
        return metric;
    }

    /**
     * * @方法说明:获取屏幕的宽度（像素） * @方法名称:getScreenWidth * @param context * @return
     * * @返回值:int
     */
    public static int getScreenWidth(Context context) {
        int width = getDisPlayMetrics(context).widthPixels;
        return width;
    }

    /**
     * * @方法说明:获取屏幕的高（像素） * @方法名称:getScreenHeight * @param context * @return
     * * @返回值:int
     */
    public static int getScreenHeight(Context context) {
        int height = getDisPlayMetrics(context).heightPixels;
        return height;
    }

    /**
     * * @方法说明:屏幕密度(0.75 / 1.0 / 1.5) * @方法名称:getDensity * @param context
     * * @return * @返回 float
     */
    public static float getDensity(Context context) {
        float density = getDisPlayMetrics(context).density;
        return density;
    }

    /**
     * * @方法说明:屏幕密度DPI(120 / 160 / 240) * @方法名称:getDensityDpi * @param context
     * * @return * @返回 int
     */
    public static int getDensityDpi(Context context) {
        int densityDpi = getDisPlayMetrics(context).densityDpi;
        return densityDpi;
    }

    public static float dpToPx(Context context, float dp) {
        if (context == null) {
            return -1;
        }
        return dp * context.getResources().getDisplayMetrics().density;
    }

    public static int dpToPxInt(Context context, float dp) {
        return (int) (dpToPx(context, dp) + 0.5f);
    }

    public static Bitmap zoomBitmap(Bitmap bitmap, int w, int h) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        float scaleWidht = ((float) w / width);
        float scaleHeight = ((float) h / height);
        matrix.postScale(scaleWidht, scaleHeight);
        Bitmap newbmp = Bitmap.createBitmap(bitmap, 0, 0, width, height,
                matrix, true);
        return newbmp;
    }

    public static int getStatusBarHeight(Context mContext) {
        int result = 0;
        int resId = mContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resId > 0) {
            result = mContext.getResources().getDimensionPixelSize(resId);
        }
        return result;
    }


}
