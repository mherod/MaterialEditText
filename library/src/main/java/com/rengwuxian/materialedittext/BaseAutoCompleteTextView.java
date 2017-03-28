package com.rengwuxian.materialedittext;

import android.content.Context;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.AttributeSet;

/**
 * Created by matthewherod on 29/03/2017.
 */

abstract class BaseAutoCompleteTextView extends AppCompatAutoCompleteTextView {

	public BaseAutoCompleteTextView(final Context context, final AttributeSet attrs, final int
			defStyleAttr) {

		super(context, attrs, defStyleAttr);
	}

	public BaseAutoCompleteTextView(final Context context) {

		super(context);
	}

	public BaseAutoCompleteTextView(final Context context, final AttributeSet attrs) {

		super(context, attrs);
	}

	protected int getPixel(int dp) {

		return ResUtil.dp2px(getContext(), dp);
	}

	protected boolean isRTL() {

		return ResUtil.isRtl(getResources());
	}
}
