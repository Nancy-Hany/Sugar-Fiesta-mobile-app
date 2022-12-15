package com.nancysapplication.app.modules.form.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FormModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.msg_unlock_10_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupforspe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_for_spe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBysigningup: String? = MyApp.getInstance().resources.getString(R.string.msg_by_signing_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)
