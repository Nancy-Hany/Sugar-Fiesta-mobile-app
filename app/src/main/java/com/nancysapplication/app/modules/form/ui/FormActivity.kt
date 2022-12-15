package com.nancysapplication.app.modules.form.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityFormBinding
import com.nancysapplication.app.modules.form.`data`.viewmodel.FormVM
import kotlin.String
import kotlin.Unit

class FormActivity : BaseActivity<ActivityFormBinding>(R.layout.activity_form) {
  private val viewModel: FormVM by viewModels<FormVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.formVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FORM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FormActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
