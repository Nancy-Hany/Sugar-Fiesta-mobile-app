package com.nancysapplication.app.modules.menubar.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.nancysapplication.app.databinding.SlideritemMenubar1Binding
import com.nancysapplication.app.modules.menubar.`data`.model.ImageSliderSlidershapeModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidershapeAdapter(
  val dataList: ArrayList<ImageSliderSlidershapeModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidershapeModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemMenubar1Binding) {
      binding.imageSliderSlidershapeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemMenubar1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
