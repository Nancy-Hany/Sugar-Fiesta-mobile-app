package com.nancysapplication.app.modules.divone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityDivOneBinding
import com.nancysapplication.app.modules.divone.`data`.viewmodel.DivOneVM
import kotlin.String
import kotlin.Unit

class DivOneActivity : BaseActivity<ActivityDivOneBinding>(R.layout.activity_div_one) {
  private val viewModel: DivOneVM by viewModels<DivOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.divOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DIV_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DivOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
