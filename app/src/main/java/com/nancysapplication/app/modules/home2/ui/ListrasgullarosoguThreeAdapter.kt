package com.nancysapplication.app.modules.home2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nancysapplication.app.R
import com.nancysapplication.app.databinding.RowListrasgullarosoguThreeBinding
import com.nancysapplication.app.modules.home2.`data`.model.ListrasgullarosoguThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListrasgullarosoguThreeAdapter(
  var list: List<ListrasgullarosoguThreeRowModel>
) : RecyclerView.Adapter<ListrasgullarosoguThreeAdapter.RowListrasgullarosoguThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrasgullarosoguThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrasgullarosogu_three,parent,false)
    return RowListrasgullarosoguThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListrasgullarosoguThreeVH, position: Int) {
    val listrasgullarosoguThreeRowModel = ListrasgullarosoguThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listrasgullarosoguThreeRowModel = list[position]
    holder.binding.listrasgullarosoguThreeRowModel = listrasgullarosoguThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrasgullarosoguThreeRowModel>) {
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
      item: ListrasgullarosoguThreeRowModel
    ) {
    }
  }

  inner class RowListrasgullarosoguThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrasgullarosoguThreeBinding =
        RowListrasgullarosoguThreeBinding.bind(itemView)
    init {
      binding.btnChefPickThree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrasgullarosoguThreeRowModel())
      }
    }
  }
}
