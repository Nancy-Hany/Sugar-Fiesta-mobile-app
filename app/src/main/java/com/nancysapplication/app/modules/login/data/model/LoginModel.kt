package com.nancysapplication.app.modules.login.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeback: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseSignIn: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_please_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinueas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomebackOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinueasOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPasswordOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null
)
