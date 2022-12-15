package com.nancysapplication.app.modules.homeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nancysapplication.app.R
import com.nancysapplication.app.databinding.RowListrasgullarosoguThree1Binding
import com.nancysapplication.app.modules.homeone.`data`.model.ListrasgullarosoguThree1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrasgullarosoguThreeAdapter(
  var list: List<ListrasgullarosoguThree1RowModel>
) : RecyclerView.Adapter<ListrasgullarosoguThreeAdapter.RowListrasgullarosoguThree1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrasgullarosoguThree1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrasgullarosogu_three1,parent,false)
    return RowListrasgullarosoguThree1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrasgullarosoguThree1VH, position: Int) {
    val listrasgullarosoguThree1RowModel = ListrasgullarosoguThree1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrasgullarosoguThree1RowModel = list[position]
    holder.binding.listrasgullarosoguThree1RowModel = listrasgullarosoguThree1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrasgullarosoguThree1RowModel>) {
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
      item: ListrasgullarosoguThree1RowModel
    ) {
    }
  }

  inner class RowListrasgullarosoguThree1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrasgullarosoguThree1Binding =
        RowListrasgullarosoguThree1Binding.bind(itemView)
    init {
      binding.btnChefPickThree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrasgullarosoguThree1RowModel())
      }
    }
  }
}
