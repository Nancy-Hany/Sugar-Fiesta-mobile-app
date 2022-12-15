package com.nancysapplication.app.modules.homeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nancysapplication.app.modules.homeone.`data`.model.HomeOneModel
import com.nancysapplication.app.modules.homeone.`data`.model.Lgcheffpick1RowModel
import com.nancysapplication.app.modules.homeone.`data`.model.Listproductcolorb1RowModel
import com.nancysapplication.app.modules.homeone.`data`.model.ListrasgullarosoguThree1RowModel
import com.nancysapplication.app.modules.homeone.`data`.model.SpinnerGroup101Model
import com.nancysapplication.app.modules.homeone.`data`.model.SpinnerGroup103Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeOneVM : ViewModel(), KoinComponent {
  val homeOneModel: MutableLiveData<HomeOneModel> = MutableLiveData(HomeOneModel())

  var navArguments: Bundle? = null

  val spinnerGroup101List: MutableLiveData<MutableList<SpinnerGroup101Model>> = MutableLiveData()

  val spinnerGroup103List: MutableLiveData<MutableList<SpinnerGroup103Model>> = MutableLiveData()

  val listproductcolorbList: MutableLiveData<MutableList<Listproductcolorb1RowModel>> =
      MutableLiveData(mutableListOf())

  val lgCheffPickList: MutableLiveData<MutableList<Lgcheffpick1RowModel>> =
      MutableLiveData(mutableListOf())

  val listrasgullarosoguThreeList: MutableLiveData<MutableList<ListrasgullarosoguThree1RowModel>> =
      MutableLiveData(mutableListOf())
}
