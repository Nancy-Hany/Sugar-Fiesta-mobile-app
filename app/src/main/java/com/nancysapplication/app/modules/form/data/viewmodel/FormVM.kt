package com.nancysapplication.app.modules.form.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.form.`data`.model.FormModel
import org.koin.core.KoinComponent

class FormVM : ViewModel(), KoinComponent {
  val formModel: MutableLiveData<FormModel> = MutableLiveData(FormModel())

  var navArguments: Bundle? = null
}
