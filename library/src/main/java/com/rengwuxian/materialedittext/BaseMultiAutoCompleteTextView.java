package com.rengwuxian.materialedittext;

import android.content.Context;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.util.AttributeSet;

/**
 * Created by matthewherod on 29/03/2017.
 */

abstract class BaseMultiAutoCompleteTextView extends AppCompatMultiAutoCompleteTextView {

	public BaseMultiAutoCompleteTextView(final Context context, final AttributeSet attrs, final
	int defStyleAttr) {

		super(context, attrs, defStyleAttr);
	}

	public BaseMultiAutoCompleteTextView(final Context context) {

		super(context);
	}

	public BaseMultiAutoCompleteTextView(final Context context, final AttributeSet attrs) {

		super(context, attrs);
	}
}
