package com.nancysapplication.app.modules.loginone.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanalsolo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_also_lo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonOneValue: String? = null
)
