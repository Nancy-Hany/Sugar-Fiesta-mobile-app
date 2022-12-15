package com.nancysapplication.app.modules.divone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.divone.`data`.model.DivOneModel
import org.koin.core.KoinComponent

class DivOneVM : ViewModel(), KoinComponent {
  val divOneModel: MutableLiveData<DivOneModel> = MutableLiveData(DivOneModel())

  var navArguments: Bundle? = null
}
