package com.nancysapplication.app.modules.div.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityDivBinding
import com.nancysapplication.app.modules.div.`data`.viewmodel.DivVM
import kotlin.String
import kotlin.Unit

class DivActivity : BaseActivity<ActivityDivBinding>(R.layout.activity_div) {
  private val viewModel: DivVM by viewModels<DivVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.divVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DIV_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DivActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
