package com.nancysapplication.app.modules.menubar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.appcomponents.views.TimePickerFragment
import com.nancysapplication.app.databinding.ActivityMenubarBinding
import com.nancysapplication.app.modules.menubar.`data`.model.ImageSliderSlidershapeModel
import com.nancysapplication.app.modules.menubar.`data`.viewmodel.MenubarVM
import java.util.Date
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class MenubarActivity : BaseActivity<ActivityMenubarBinding>(R.layout.activity_menubar) {
  private val imageSliderSlidershapeItems: ArrayList<ImageSliderSlidershapeModel> = arrayListOf()


  private val viewModel: MenubarVM by viewModels<MenubarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidershapeAdapter = SlidershapeAdapter(imageSliderSlidershapeItems,true)
    binding.imageSliderSlidershape.adapter = slidershapeAdapter
    binding.imageSliderSlidershape.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicator.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicator.updateIndicatorCounts(binding.imageSliderSlidershape.indicatorCount)
    binding.menubarVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidershape.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidershape.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.linearRowclock.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowclock(selectedTime)
      }
    }
  }

  private fun onTimeSelectedLinearRowclock(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "MENUBAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenubarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
