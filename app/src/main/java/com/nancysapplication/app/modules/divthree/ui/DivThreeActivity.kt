package com.nancysapplication.app.modules.divthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityDivThreeBinding
import com.nancysapplication.app.modules.divthree.`data`.viewmodel.DivThreeVM
import kotlin.String
import kotlin.Unit

class DivThreeActivity : BaseActivity<ActivityDivThreeBinding>(R.layout.activity_div_three) {
  private val viewModel: DivThreeVM by viewModels<DivThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.divThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DIV_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DivThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
