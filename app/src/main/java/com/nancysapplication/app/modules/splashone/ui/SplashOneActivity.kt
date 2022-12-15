package com.nancysapplication.app.modules.splashone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivitySplashOneBinding
import com.nancysapplication.app.modules.splashone.`data`.viewmodel.SplashOneVM
import kotlin.String
import kotlin.Unit

class SplashOneActivity : BaseActivity<ActivitySplashOneBinding>(R.layout.activity_splash_one) {
  private val viewModel: SplashOneVM by viewModels<SplashOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPLASH_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
