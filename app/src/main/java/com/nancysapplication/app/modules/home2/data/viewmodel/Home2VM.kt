package com.nancysapplication.app.modules.home2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.home2.`data`.model.Home2Model
import com.nancysapplication.app.modules.home2.`data`.model.LgcheffpickRowModel
import com.nancysapplication.app.modules.home2.`data`.model.ListproductcolorbRowModel
import com.nancysapplication.app.modules.home2.`data`.model.ListrasgullarosoguThreeRowModel
import com.nancysapplication.app.modules.home2.`data`.model.SpinnerGroupNinetyNineModel
import com.nancysapplication.app.modules.home2.`data`.model.SpinnerGroupNinetySevenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Home2VM : ViewModel(), KoinComponent {
  val home2Model: MutableLiveData<Home2Model> = MutableLiveData(Home2Model())

  var navArguments: Bundle? = null

  val spinnerGroupNinetySevenList: MutableLiveData<MutableList<SpinnerGroupNinetySevenModel>> =
      MutableLiveData()

  val spinnerGroupNinetyNineList: MutableLiveData<MutableList<SpinnerGroupNinetyNineModel>> =
      MutableLiveData()

  val listproductcolorbList: MutableLiveData<MutableList<ListproductcolorbRowModel>> =
      MutableLiveData(mutableListOf())

  val lgCheffPickList: MutableLiveData<MutableList<LgcheffpickRowModel>> =
      MutableLiveData(mutableListOf())

  val listrasgullarosoguThreeList: MutableLiveData<MutableList<ListrasgullarosoguThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
