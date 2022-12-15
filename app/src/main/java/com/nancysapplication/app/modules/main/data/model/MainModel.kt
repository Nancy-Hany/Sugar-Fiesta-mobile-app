package com.nancysapplication.app.modules.main.`data`.model

import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyIrina: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_irina)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWehavesmth: String? = MyApp.getInstance().resources.getString(R.string.msg_we_have_smth_yu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCinnabonwithP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cinnabon_with_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLavanda: String? = MyApp.getInstance().resources.getString(R.string.lbl_lavanda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGorgonzolaand: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gorgonzola_and)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTeaRose: String? = MyApp.getInstance().resources.getString(R.string.lbl_tea_rose)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentNumbe: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCartisempty: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart_is_empty)

)
