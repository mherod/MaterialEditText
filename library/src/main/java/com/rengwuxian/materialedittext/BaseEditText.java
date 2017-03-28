package com.rengwuxian.materialedittext;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

/**
 * Created by matthewherod on 29/03/2017.
 */

abstract class BaseEditText extends AppCompatEditText {

	public BaseEditText(final Context context) {

		super(context);
	}

	public BaseEditText(final Context context, final AttributeSet attrs) {

		super(context, attrs);
	}

	public BaseEditText(final Context context, final AttributeSet attrs, final int defStyleAttr) {

		super(context, attrs, defStyleAttr);
	}

	@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
	protected boolean isRTL() {

		return ResUtil.isRtl(getResources());
	}

}
