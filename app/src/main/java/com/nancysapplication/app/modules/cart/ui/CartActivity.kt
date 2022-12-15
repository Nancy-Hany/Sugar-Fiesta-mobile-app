package com.nancysapplication.app.modules.cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityCartBinding
import com.nancysapplication.app.modules.cart.`data`.viewmodel.CartVM
import com.nancysapplication.app.modules.selected.ui.SelectedActivity
import kotlin.String
import kotlin.Unit

class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearTop.setOnClickListener {
      val destIntent = SelectedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameCart.setOnClickListener {
      val destIntent = SelectedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
