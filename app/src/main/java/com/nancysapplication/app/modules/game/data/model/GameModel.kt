package com.nancysapplication.app.modules.game.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GameModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_christmas_memor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_with_all_the_ca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouwona10v: String? = MyApp.getInstance().resources.getString(R.string.msg_you_won_a_10_v)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonValue: String? = null
)
