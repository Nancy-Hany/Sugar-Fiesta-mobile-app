package com.nancysapplication.app.modules.main.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityMainBinding
import com.nancysapplication.app.modules.main.`data`.viewmodel.MainVM
import com.nancysapplication.app.modules.selected.ui.SelectedActivity
import kotlin.String
import kotlin.Unit

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
  private val viewModel: MainVM by viewModels<MainVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumncinnabonwithp.setOnClickListener {
      val destIntent = SelectedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MAIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MainActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
