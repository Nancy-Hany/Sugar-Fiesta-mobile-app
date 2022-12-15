package com.nancysapplication.app.modules.divfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityDivFiveBinding
import com.nancysapplication.app.modules.divfive.`data`.viewmodel.DivFiveVM
import kotlin.String
import kotlin.Unit

class DivFiveActivity : BaseActivity<ActivityDivFiveBinding>(R.layout.activity_div_five) {
  private val viewModel: DivFiveVM by viewModels<DivFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.divFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DIV_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DivFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
