package com.nancysapplication.app.modules.game.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityGameBinding
import com.nancysapplication.app.modules.game.`data`.viewmodel.GameVM
import kotlin.String
import kotlin.Unit

class GameActivity : BaseActivity<ActivityGameBinding>(R.layout.activity_game) {
  private val viewModel: GameVM by viewModels<GameVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gameVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "GAME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GameActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
