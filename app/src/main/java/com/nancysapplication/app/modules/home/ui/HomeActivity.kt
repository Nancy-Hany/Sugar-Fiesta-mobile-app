package com.nancysapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityHomeBinding
import com.nancysapplication.app.modules.game.ui.GameActivity
import com.nancysapplication.app.modules.home.`data`.model.ImageSliderSlidershapeModel
import com.nancysapplication.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val imageSliderSlidershapeItems: ArrayList<ImageSliderSlidershapeModel> = arrayListOf()


  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidershapeAdapter = SlidershapeAdapter(imageSliderSlidershapeItems,true)
    binding.imageSliderSlidershape.adapter = slidershapeAdapter
    binding.imageSliderSlidershape.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicator.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicator.updateIndicatorCounts(binding.imageSliderSlidershape.indicatorCount)
    binding.homeVM = viewModel
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
    binding.frameStackballOne.setOnClickListener {
      val destIntent = GameActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
