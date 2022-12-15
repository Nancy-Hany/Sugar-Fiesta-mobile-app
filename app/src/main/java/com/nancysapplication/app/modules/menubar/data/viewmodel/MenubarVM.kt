package com.nancysapplication.app.modules.menubar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.menubar.`data`.model.MenubarModel
import org.koin.core.KoinComponent

class MenubarVM : ViewModel(), KoinComponent {
  val menubarModel: MutableLiveData<MenubarModel> = MutableLiveData(MenubarModel())

  var navArguments: Bundle? = null
}
