package com.nancysapplication.app.modules.onboarding.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStayhealthywh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_stay_healthy_wh)

)
