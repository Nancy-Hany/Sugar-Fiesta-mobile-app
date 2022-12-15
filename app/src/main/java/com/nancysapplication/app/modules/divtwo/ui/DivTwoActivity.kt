package com.nancysapplication.app.modules.divtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityDivTwoBinding
import com.nancysapplication.app.modules.divtwo.`data`.viewmodel.DivTwoVM
import kotlin.String
import kotlin.Unit

class DivTwoActivity : BaseActivity<ActivityDivTwoBinding>(R.layout.activity_div_two) {
  private val viewModel: DivTwoVM by viewModels<DivTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.divTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DIV_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DivTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
