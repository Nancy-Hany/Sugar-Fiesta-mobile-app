package com.nancysapplication.app.modules.homeone.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listproductcolorb1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProductName: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hyderabadi_biry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_299)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_399)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.msg_amet_minim_moll)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewScore: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfReviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMainCourse: String? = MyApp.getInstance().resources.getString(R.string.lbl_main_course)

)
