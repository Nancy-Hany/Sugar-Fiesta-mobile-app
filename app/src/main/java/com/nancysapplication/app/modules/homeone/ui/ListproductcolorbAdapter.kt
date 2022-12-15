package com.nancysapplication.app.modules.homeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nancysapplication.app.R
import com.nancysapplication.app.databinding.RowListproductcolorb1Binding
import com.nancysapplication.app.modules.homeone.`data`.model.Listproductcolorb1RowModel
import kotlin.Int
import kotlin.collections.List

class ListproductcolorbAdapter(
  var list: List<Listproductcolorb1RowModel>
) : RecyclerView.Adapter<ListproductcolorbAdapter.RowListproductcolorb1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListproductcolorb1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listproductcolorb1,parent,false)
    return RowListproductcolorb1VH(view)
  }

  override fun onBindViewHolder(holder: RowListproductcolorb1VH, position: Int) {
    val listproductcolorb1RowModel = Listproductcolorb1RowModel()
    // TODO uncomment following line after integration with data source
    // val listproductcolorb1RowModel = list[position]
    holder.binding.listproductcolorb1RowModel = listproductcolorb1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listproductcolorb1RowModel>) {
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
      item: Listproductcolorb1RowModel
    ) {
    }
  }

  inner class RowListproductcolorb1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListproductcolorb1Binding = RowListproductcolorb1Binding.bind(itemView)
    init {
      binding.btn20Off.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listproductcolorb1RowModel())
      }
      binding.btnChefPick.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listproductcolorb1RowModel())
      }
    }
  }
}
