package com.ogulcan.android.mvp.app.ui.list

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ogulcan.android.mvp.app.R
import com.ogulcan.android.mvp.app.models.Post
import com.ogulcan.android.mvp.app.models.dto.IndicadorDto

/**
 * Created by ogulcan on 07/02/2018.
 */
class ListAdapter(private val context: Context, private val list: MutableList<IndicadorDto>,
                  fragment: Fragment): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private val listener: ListAdapter.onItemClickListener

    init {
        this.listener = fragment as ListAdapter.onItemClickListener
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder?, position: Int) {
        var post = list[position]

        // holder!!.bind(post)
        holder!!.title!!.setText(post.nombre)
        holder.body!!.setText(post.valor.toString())

        holder.layout!!.setOnClickListener {
            listener.itemDetail(post.nombre!!)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ListAdapter.ListViewHolder(itemView)
    }

    fun removeAt(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }

    class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var layout = itemView.findViewById<ConstraintLayout>(R.id.item_layout)
        val title = itemView.findViewById<TextView>(R.id.item_title)
        val body = itemView.findViewById<TextView>(R.id.item_body)

        fun bind(item: IndicadorDto) {
            // title = item.post
            // body etc.
        }
    }

    interface onItemClickListener {
        fun itemRemoveClick(post: IndicadorDto)
        fun itemDetail(postId : String)
    }
}