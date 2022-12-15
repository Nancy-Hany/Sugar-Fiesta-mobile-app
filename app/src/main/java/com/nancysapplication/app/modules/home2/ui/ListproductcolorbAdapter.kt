package com.nancysapplication.app.modules.home2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nancysapplication.app.R
import com.nancysapplication.app.databinding.RowListproductcolorbBinding
import com.nancysapplication.app.modules.home2.`data`.model.ListproductcolorbRowModel
import kotlin.Int
import kotlin.collections.List

class ListproductcolorbAdapter(
  var list: List<ListproductcolorbRowModel>
) : RecyclerView.Adapter<ListproductcolorbAdapter.RowListproductcolorbVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListproductcolorbVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listproductcolorb,parent,false)
    return RowListproductcolorbVH(view)
  }

  override fun onBindViewHolder(holder: RowListproductcolorbVH, position: Int) {
    val listproductcolorbRowModel = ListproductcolorbRowModel()
    // TODO uncomment following line after integration with data source
    // val listproductcolorbRowModel = list[position]
    holder.binding.listproductcolorbRowModel = listproductcolorbRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListproductcolorbRowModel>) {
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
      item: ListproductcolorbRowModel
    ) {
    }
  }

  inner class RowListproductcolorbVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListproductcolorbBinding = RowListproductcolorbBinding.bind(itemView)
    init {
      binding.btn20Off.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListproductcolorbRowModel())
      }
      binding.btnChefPick.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListproductcolorbRowModel())
      }
    }
  }
}
