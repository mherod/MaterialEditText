package com.rengwuxian.materialedittext;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/**
 * Created by matthewherod on 29/03/2017.
 */

class ResUtil {

	static boolean isLight(int color) {

		return Math.sqrt(
				Color.red(color) * Color.red(color) * .241 +
						Color.green(color) * Color.green(color)
								* .691 +
						Color.blue(color) * Color.blue(color) *
								.068) > 130;
	}

	static int dp2px(Context context, float dp) {

		final DisplayMetrics dm = getResources(context).getDisplayMetrics();
		float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, dm);
		return Math.round(px);
	}

	private static Resources getResources(@Nullable final Context context) {

		return context != null ? context.getResources() : Resources.getSystem();
	}

	@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
	static boolean isRtl(@Nullable Resources resources) {

		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
			return false;
		}

		if (resources == null) {
			resources = Resources.getSystem();
		}

		Configuration config = resources.getConfiguration();

		return config.getLayoutDirection() == View.LAYOUT_DIRECTION_RTL;
	}
}
