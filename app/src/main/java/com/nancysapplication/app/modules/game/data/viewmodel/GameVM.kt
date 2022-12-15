package com.nancysapplication.app.modules.game.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.game.`data`.model.GameModel
import org.koin.core.KoinComponent

class GameVM : ViewModel(), KoinComponent {
  val gameModel: MutableLiveData<GameModel> = MutableLiveData(GameModel())

  var navArguments: Bundle? = null
}
