package com.nancysapplication.app.modules.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.nancysapplication.app.databinding.SlideritemHome1Binding
import com.nancysapplication.app.modules.home.`data`.model.ImageSliderSlidershapeModel
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
    if (binding is SlideritemHome1Binding) {
      binding.imageSliderSlidershapeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHome1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
