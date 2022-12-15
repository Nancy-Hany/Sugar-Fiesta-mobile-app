package com.nancysapplication.app.modules.homeone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityHomeOneBinding
import com.nancysapplication.app.modules.homeone.`data`.model.Lgcheffpick1RowModel
import com.nancysapplication.app.modules.homeone.`data`.model.Listproductcolorb1RowModel
import com.nancysapplication.app.modules.homeone.`data`.model.ListrasgullarosoguThree1RowModel
import com.nancysapplication.app.modules.homeone.`data`.model.SpinnerGroup101Model
import com.nancysapplication.app.modules.homeone.`data`.model.SpinnerGroup103Model
import com.nancysapplication.app.modules.homeone.`data`.viewmodel.HomeOneVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeOneActivity : BaseActivity<ActivityHomeOneBinding>(R.layout.activity_home_one) {
  private val viewModel: HomeOneVM by viewModels<HomeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup101List.value = mutableListOf(
    SpinnerGroup101Model("Item1"),
    SpinnerGroup101Model("Item2"),
    SpinnerGroup101Model("Item3"),
    SpinnerGroup101Model("Item4"),
    SpinnerGroup101Model("Item5")
    )
    val spinnerGroup101Adapter =
    SpinnerGroup101Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup101List.value?:
    mutableListOf())
    binding.spinnerGroup101.adapter = spinnerGroup101Adapter
    viewModel.spinnerGroup103List.value = mutableListOf(
    SpinnerGroup103Model("Item1"),
    SpinnerGroup103Model("Item2"),
    SpinnerGroup103Model("Item3"),
    SpinnerGroup103Model("Item4"),
    SpinnerGroup103Model("Item5")
    )
    val spinnerGroup103Adapter =
    SpinnerGroup103Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup103List.value?:
    mutableListOf())
    binding.spinnerGroup103.adapter = spinnerGroup103Adapter
    val listproductcolorbAdapter =
    ListproductcolorbAdapter(viewModel.listproductcolorbList.value?:mutableListOf())
    binding.recyclerListproductcolorb.adapter = listproductcolorbAdapter
    listproductcolorbAdapter.setOnItemClickListener(
    object : ListproductcolorbAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listproductcolorb1RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Lgcheffpick1RowModel) {
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
      ListrasgullarosoguThree1RowModel) {
        onClickRecyclerListrasgullarosoguThree(view, position, item)
      }
    }
    )
    viewModel.listrasgullarosoguThreeList.observe(this) {
      listrasgullarosoguThreeAdapter.updateData(it)
    }
    binding.homeOneVM = viewModel
    setUpSearchViewSearchFieldListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListproductcolorb(
    view: View,
    position: Int,
    item: Listproductcolorb1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerLgCheffPick(
    view: View,
    position: Int,
    item: Lgcheffpick1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrasgullarosoguThree(
    view: View,
    position: Int,
    item: ListrasgullarosoguThree1RowModel
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
      const val TAG: String = "HOME_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
