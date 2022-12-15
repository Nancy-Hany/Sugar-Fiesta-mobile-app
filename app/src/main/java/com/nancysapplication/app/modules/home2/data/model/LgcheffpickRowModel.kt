package com.nancysapplication.app.modules.home2.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LgcheffpickRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProductNameFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_basbousa_with_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_299)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_399)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZoneFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_amet_minim_moll)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewScoreFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfReviewsFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMainCourseTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_main_course)

)
