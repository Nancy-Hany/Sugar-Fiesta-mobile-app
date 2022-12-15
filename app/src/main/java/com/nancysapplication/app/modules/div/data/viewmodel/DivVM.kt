package com.nancysapplication.app.modules.div.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.div.`data`.model.DivModel
import org.koin.core.KoinComponent

class DivVM : ViewModel(), KoinComponent {
  val divModel: MutableLiveData<DivModel> = MutableLiveData(DivModel())

  var navArguments: Bundle? = null
}
