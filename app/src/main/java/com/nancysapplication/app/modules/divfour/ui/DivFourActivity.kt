package com.nancysapplication.app.modules.divfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityDivFourBinding
import com.nancysapplication.app.modules.divfour.`data`.viewmodel.DivFourVM
import kotlin.String
import kotlin.Unit

class DivFourActivity : BaseActivity<ActivityDivFourBinding>(R.layout.activity_div_four) {
  private val viewModel: DivFourVM by viewModels<DivFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.divFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DIV_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DivFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
