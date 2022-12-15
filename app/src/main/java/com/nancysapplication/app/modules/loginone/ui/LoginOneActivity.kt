package com.nancysapplication.app.modules.loginone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityLoginOneBinding
import com.nancysapplication.app.modules.loginone.`data`.viewmodel.LoginOneVM
import com.nancysapplication.app.modules.signuptwo.ui.SignupTwoActivity
import kotlin.String
import kotlin.Unit

class LoginOneActivity : BaseActivity<ActivityLoginOneBinding>(R.layout.activity_login_one) {
  private val viewModel: LoginOneVM by viewModels<LoginOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtConfirmation.setOnClickListener {
      val destIntent = SignupTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
