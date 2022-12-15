package com.nancysapplication.app.modules.menubar.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenubarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMagnifyingglass: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_eastern)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_pastries)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_cakes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_jars)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleSix: String? = MyApp.getInstance().resources.getString(R.string.msg_enjoy_a_unique)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_trending)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMiddleEastern: String? =
      MyApp.getInstance().resources.getString(R.string.msg_middle_eastern)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCakes: String? = MyApp.getInstance().resources.getString(R.string.lbl_cakes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPastries: String? = MyApp.getInstance().resources.getString(R.string.lbl_pastries2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_nancy_hany)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_nancyhany8_gmai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactus: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutus: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
