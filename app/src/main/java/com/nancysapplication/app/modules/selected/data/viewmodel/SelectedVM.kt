package com.nancysapplication.app.modules.selected.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.selected.`data`.model.SelectedModel
import org.koin.core.KoinComponent

class SelectedVM : ViewModel(), KoinComponent {
  val selectedModel: MutableLiveData<SelectedModel> = MutableLiveData(SelectedModel())

  var navArguments: Bundle? = null
}
