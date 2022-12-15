package com.nancysapplication.app.modules.divfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.divfive.`data`.model.DivFiveModel
import org.koin.core.KoinComponent

class DivFiveVM : ViewModel(), KoinComponent {
  val divFiveModel: MutableLiveData<DivFiveModel> = MutableLiveData(DivFiveModel())

  var navArguments: Bundle? = null
}
