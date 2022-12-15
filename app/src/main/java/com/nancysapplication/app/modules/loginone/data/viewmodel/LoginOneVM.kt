package com.nancysapplication.app.modules.loginone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.loginone.`data`.model.LoginOneModel
import org.koin.core.KoinComponent

class LoginOneVM : ViewModel(), KoinComponent {
  val loginOneModel: MutableLiveData<LoginOneModel> = MutableLiveData(LoginOneModel())

  var navArguments: Bundle? = null
}
