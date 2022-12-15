package com.nancysapplication.app.modules.home2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nancysapplication.app.R
import com.nancysapplication.app.databinding.RowLgcheffpickBinding
import com.nancysapplication.app.modules.home2.`data`.model.LgcheffpickRowModel
import kotlin.Int
import kotlin.collections.List

class LgCheffPickAdapter(
  var list: List<LgcheffpickRowModel>
) : RecyclerView.Adapter<LgCheffPickAdapter.RowLgcheffpickVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLgcheffpickVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lgcheffpick,parent,false)
    return RowLgcheffpickVH(view)
  }

  override fun onBindViewHolder(holder: RowLgcheffpickVH, position: Int) {
    val lgcheffpickRowModel = LgcheffpickRowModel()
    // TODO uncomment following line after integration with data source
    // val lgcheffpickRowModel = list[position]
    holder.binding.lgcheffpickRowModel = lgcheffpickRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LgcheffpickRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: LgcheffpickRowModel
    ) {
    }
  }

  inner class RowLgcheffpickVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLgcheffpickBinding = RowLgcheffpickBinding.bind(itemView)
    init {
      binding.btn20OffOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, LgcheffpickRowModel())
      }
      binding.btnChefPickTwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, LgcheffpickRowModel())
      }
    }
  }
}
