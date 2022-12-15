package com.nancysapplication.app.modules.divtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.divtwo.`data`.model.DivTwoModel
import org.koin.core.KoinComponent

class DivTwoVM : ViewModel(), KoinComponent {
  val divTwoModel: MutableLiveData<DivTwoModel> = MutableLiveData(DivTwoModel())

  var navArguments: Bundle? = null
}
