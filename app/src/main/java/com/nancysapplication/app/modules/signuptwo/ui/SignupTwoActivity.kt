package com.nancysapplication.app.modules.signuptwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivitySignupTwoBinding
import com.nancysapplication.app.modules.signuptwo.`data`.viewmodel.SignupTwoVM
import kotlin.String
import kotlin.Unit

class SignupTwoActivity : BaseActivity<ActivitySignupTwoBinding>(R.layout.activity_signup_two) {
  private val viewModel: SignupTwoVM by viewModels<SignupTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGNUP_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
