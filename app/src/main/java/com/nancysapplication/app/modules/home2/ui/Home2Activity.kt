package com.nancysapplication.app.modules.home2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityHome2Binding
import com.nancysapplication.app.modules.home2.`data`.model.LgcheffpickRowModel
import com.nancysapplication.app.modules.home2.`data`.model.ListproductcolorbRowModel
import com.nancysapplication.app.modules.home2.`data`.model.ListrasgullarosoguThreeRowModel
import com.nancysapplication.app.modules.home2.`data`.model.SpinnerGroupNinetyNineModel
import com.nancysapplication.app.modules.home2.`data`.model.SpinnerGroupNinetySevenModel
import com.nancysapplication.app.modules.home2.`data`.viewmodel.Home2VM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Home2Activity : BaseActivity<ActivityHome2Binding>(R.layout.activity_home2) {
  private val viewModel: Home2VM by viewModels<Home2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupNinetySevenList.value = mutableListOf(
    SpinnerGroupNinetySevenModel("Item1"),
    SpinnerGroupNinetySevenModel("Item2"),
    SpinnerGroupNinetySevenModel("Item3"),
    SpinnerGroupNinetySevenModel("Item4"),
    SpinnerGroupNinetySevenModel("Item5")
    )
    val spinnerGroupNinetySevenAdapter =
    SpinnerGroupNinetySevenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupNinetySevenList.value?:
    mutableListOf())
    binding.spinnerGroupNinetySeven.adapter = spinnerGroupNinetySevenAdapter
    viewModel.spinnerGroupNinetyNineList.value = mutableListOf(
    SpinnerGroupNinetyNineModel("Item1"),
    SpinnerGroupNinetyNineModel("Item2"),
    SpinnerGroupNinetyNineModel("Item3"),
    SpinnerGroupNinetyNineModel("Item4"),
    SpinnerGroupNinetyNineModel("Item5")
    )
    val spinnerGroupNinetyNineAdapter =
    SpinnerGroupNinetyNineAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupNinetyNineList.value?:
    mutableListOf())
    binding.spinnerGroupNinetyNine.adapter = spinnerGroupNinetyNineAdapter
    val listproductcolorbAdapter =
    ListproductcolorbAdapter(viewModel.listproductcolorbList.value?:mutableListOf())
    binding.recyclerListproductcolorb.adapter = listproductcolorbAdapter
    listproductcolorbAdapter.setOnItemClickListener(
    object : ListproductcolorbAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListproductcolorbRowModel) {
        onClickRecyclerListproductcolorb(view, position, item)
      }
    }
    )
    viewModel.listproductcolorbList.observe(this) {
      listproductcolorbAdapter.updateData(it)
    }
    val lgCheffPickAdapter =
    LgCheffPickAdapter(viewModel.lgCheffPickList.value?:mutableListOf())
    binding.recyclerLgCheffPick.adapter = lgCheffPickAdapter
    lgCheffPickAdapter.setOnItemClickListener(
    object : LgCheffPickAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LgcheffpickRowModel) {
        onClickRecyclerLgCheffPick(view, position, item)
      }
    }
    )
    viewModel.lgCheffPickList.observe(this) {
      lgCheffPickAdapter.updateData(it)
    }
    val listrasgullarosoguThreeAdapter =
    ListrasgullarosoguThreeAdapter(viewModel.listrasgullarosoguThreeList.value?:mutableListOf())
    binding.recyclerListrasgullarosoguThree.adapter = listrasgullarosoguThreeAdapter
    listrasgullarosoguThreeAdapter.setOnItemClickListener(
    object : ListrasgullarosoguThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrasgullarosoguThreeRowModel) {
        onClickRecyclerListrasgullarosoguThree(view, position, item)
      }
    }
    )
    viewModel.listrasgullarosoguThreeList.observe(this) {
      listrasgullarosoguThreeAdapter.updateData(it)
    }
    binding.home2VM = viewModel
    setUpSearchViewSearchFieldListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListproductcolorb(
    view: View,
    position: Int,
    item: ListproductcolorbRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerLgCheffPick(
    view: View,
    position: Int,
    item: LgcheffpickRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrasgullarosoguThree(
    view: View,
    position: Int,
    item: ListrasgullarosoguThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchFieldListener(): Unit {
    binding.searchViewSearchField.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME2ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Home2Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
