package com.nancysapplication.app.modules.divthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.divthree.`data`.model.DivThreeModel
import org.koin.core.KoinComponent

class DivThreeVM : ViewModel(), KoinComponent {
  val divThreeModel: MutableLiveData<DivThreeModel> = MutableLiveData(DivThreeModel())

  var navArguments: Bundle? = null
}
