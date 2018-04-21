package com.example.cx49085.recourse.util;

/**
 * Created by cx49085 on 2018/4/7.
 */


import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;
/**
 * Created by yukuoyuan on 2017/9/29.
 */
public class GlideBlurformation extends BitmapTransformation {
    private Context context;
    private int blurRadius;
    public GlideBlurformation(Context context,int blurRadius) {
        this.context = context;
        this.blurRadius = blurRadius;
    }
    @Override
    protected Bitmap transform(@NonNull BitmapPool pool, @NonNull Bitmap toTransform, int outWidth, int outHeight) {
        return BlurBitmapUtil.instance().blurBitmap(context, toTransform, blurRadius,outWidth,outHeight);
    }
    @Override
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}