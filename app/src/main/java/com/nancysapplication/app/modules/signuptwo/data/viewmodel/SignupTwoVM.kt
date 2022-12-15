package com.nancysapplication.app.modules.signuptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.signuptwo.`data`.model.SignupTwoModel
import org.koin.core.KoinComponent

class SignupTwoVM : ViewModel(), KoinComponent {
  val signupTwoModel: MutableLiveData<SignupTwoModel> = MutableLiveData(SignupTwoModel())

  var navArguments: Bundle? = null
}
