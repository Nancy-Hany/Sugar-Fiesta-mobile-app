package com.nancysapplication.app.modules.divfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.divfour.`data`.model.DivFourModel
import org.koin.core.KoinComponent

class DivFourVM : ViewModel(), KoinComponent {
  val divFourModel: MutableLiveData<DivFourModel> = MutableLiveData(DivFourModel())

  var navArguments: Bundle? = null
}
