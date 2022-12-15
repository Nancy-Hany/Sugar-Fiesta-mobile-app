package com.nancysapplication.app.modules.signupone.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignupOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUpOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_are_complet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonThreeValue: String? = null
)
