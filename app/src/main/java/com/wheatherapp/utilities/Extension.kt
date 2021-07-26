package com.wheatherapp.utilities

import android.widget.ImageView


/**
 * Created by dharmesh on 25/07/21.
 */

fun ImageView.changeColor(color: Int) =
    setColorFilter(
        color,
        android.graphics.PorterDuff.Mode.MULTIPLY)
