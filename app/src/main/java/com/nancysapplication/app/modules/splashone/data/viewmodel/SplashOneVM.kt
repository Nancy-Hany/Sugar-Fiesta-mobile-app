package com.nancysapplication.app.modules.splashone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.splashone.`data`.model.SplashOneModel
import org.koin.core.KoinComponent

class SplashOneVM : ViewModel(), KoinComponent {
  val splashOneModel: MutableLiveData<SplashOneModel> = MutableLiveData(SplashOneModel())

  var navArguments: Bundle? = null
}
