package com.example.cx49085.recourse.util;

import com.bumptech.glide.request.RequestOptions;
import com.example.cx49085.recourse.R;

/**
 * Created by cx49085 on 2018/4/5.
 */

public class ImageUtil {
    public static RequestOptions getRequestOptions()
    {
        return new RequestOptions().error(R.drawable.ic_nav1_unselected).placeholder(R.drawable.ic_nav2_unselected);
    }


}
