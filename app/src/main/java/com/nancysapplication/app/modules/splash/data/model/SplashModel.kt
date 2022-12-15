package com.nancysapplication.app.modules.splash.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHealthyAndDel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_healthy_and_del)

)
