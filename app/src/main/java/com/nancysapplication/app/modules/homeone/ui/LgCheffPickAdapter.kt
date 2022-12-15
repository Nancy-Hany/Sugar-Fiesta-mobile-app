package com.nancysapplication.app.modules.homeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nancysapplication.app.R
import com.nancysapplication.app.databinding.RowLgcheffpick1Binding
import com.nancysapplication.app.modules.homeone.`data`.model.Lgcheffpick1RowModel
import kotlin.Int
import kotlin.collections.List

class LgCheffPickAdapter(
  var list: List<Lgcheffpick1RowModel>
) : RecyclerView.Adapter<LgCheffPickAdapter.RowLgcheffpick1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLgcheffpick1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lgcheffpick1,parent,false)
    return RowLgcheffpick1VH(view)
  }

  override fun onBindViewHolder(holder: RowLgcheffpick1VH, position: Int) {
    val lgcheffpick1RowModel = Lgcheffpick1RowModel()
    // TODO uncomment following line after integration with data source
    // val lgcheffpick1RowModel = list[position]
    holder.binding.lgcheffpick1RowModel = lgcheffpick1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Lgcheffpick1RowModel>) {
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
      item: Lgcheffpick1RowModel
    ) {
    }
  }

  inner class RowLgcheffpick1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLgcheffpick1Binding = RowLgcheffpick1Binding.bind(itemView)
    init {
      binding.btn20OffOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Lgcheffpick1RowModel())
      }
      binding.btnChefPickTwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Lgcheffpick1RowModel())
      }
    }
  }
}
