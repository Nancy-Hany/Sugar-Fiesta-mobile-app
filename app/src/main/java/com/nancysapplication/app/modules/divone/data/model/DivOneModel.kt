package com.nancysapplication.app.modules.divone.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DivOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_now3)

)
