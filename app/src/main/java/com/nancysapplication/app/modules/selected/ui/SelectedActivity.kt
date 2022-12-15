package com.nancysapplication.app.modules.selected.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivitySelectedBinding
import com.nancysapplication.app.modules.cart.ui.CartActivity
import com.nancysapplication.app.modules.selected.`data`.viewmodel.SelectedVM
import kotlin.String
import kotlin.Unit

class SelectedActivity : BaseActivity<ActivitySelectedBinding>(R.layout.activity_selected) {
  private val viewModel: SelectedVM by viewModels<SelectedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.selectedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBGCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SELECTED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SelectedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
