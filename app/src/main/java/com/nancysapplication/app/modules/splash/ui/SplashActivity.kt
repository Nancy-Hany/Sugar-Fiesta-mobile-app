package com.nancysapplication.app.modules.splash.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.appcomponents.di.MyApp
import com.nancysapplication.app.databinding.ActivitySplashBinding
import com.nancysapplication.app.extensions.alert
import com.nancysapplication.app.extensions.neutralButton
import com.nancysapplication.app.modules.onboarding.ui.OnboardingActivity
import com.nancysapplication.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
  private val viewModel: SplashVM by viewModels<SplashVM>()

  private val REQUEST_CODE_ONBOARDING_ACTIVITY: Int = 944

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashVM = viewModel
    val destIntent = OnboardingActivity.getIntent(this, null)
    startActivityForResult(destIntent, REQUEST_CODE_ONBOARDING_ACTIVITY)
  }

  override fun setUpClicks(): Unit {
    binding.frameStackstar.setOnClickListener {
      val destIntent = OnboardingActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ONBOARDING_ACTIVITY)
    }
    binding.imageMerittthomasA.setOnClickListener {
      this@SplashActivity.alert(MyApp.getInstance().getString(R.string.lbl_aaaaaaaaa),
      MyApp.getInstance().getString(R.string.msg_heeeeeey_beeee_careful_of_the_cu)) {
        neutralButton {
        }
      }
    }
    binding.imageDianapolekhina.setOnClickListener {
      val destIntent = OnboardingActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ONBOARDING_ACTIVITY)
    }
    binding.imageBackgroundrect.setOnClickListener {
      val destIntent = OnboardingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPLASH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
