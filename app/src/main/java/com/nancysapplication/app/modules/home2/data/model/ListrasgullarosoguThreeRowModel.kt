package com.nancysapplication.app.modules.home2.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrasgullarosoguThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProductNameSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hyderabadi_biry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_299)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPriceSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_399)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZoneSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_amet_minim_moll)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewScoreSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfReviewsSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMainCourseThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_main_course)

)
