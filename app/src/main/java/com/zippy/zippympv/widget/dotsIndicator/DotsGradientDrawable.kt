package com.pedpo.pedporent.widget.dotsIndicator

import android.graphics.drawable.GradientDrawable

class DotsGradientDrawable : GradientDrawable() {
  var currentColor: Int = 0
    private set

  override fun setColor(argb: Int) {
    super.setColor(argb)
    currentColor = argb
  }
}