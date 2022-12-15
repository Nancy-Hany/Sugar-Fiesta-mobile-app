package com.nancysapplication.app.modules.signuptwo.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignupTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_registering)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanalsosi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_also_si)
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
