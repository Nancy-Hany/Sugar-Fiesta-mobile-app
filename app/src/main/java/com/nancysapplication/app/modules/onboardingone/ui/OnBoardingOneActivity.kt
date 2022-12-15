package com.nancysapplication.app.modules.onboardingone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityOnBoardingOneBinding
import com.nancysapplication.app.modules.onboardingone.`data`.viewmodel.OnBoardingOneVM
import kotlin.String
import kotlin.Unit

class OnBoardingOneActivity :
    BaseActivity<ActivityOnBoardingOneBinding>(R.layout.activity_on_boarding_one) {
  private val viewModel: OnBoardingOneVM by viewModels<OnBoardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onBoardingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ON_BOARDING_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnBoardingOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
