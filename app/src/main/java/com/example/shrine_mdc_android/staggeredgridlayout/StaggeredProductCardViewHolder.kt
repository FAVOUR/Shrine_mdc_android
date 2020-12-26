package com.example.shrine_mdc_android.staggeredgridlayout

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.toolbox.NetworkImageView
import com.example.shrine_mdc_android.R

class StaggeredProductCardViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    var produceImage: NetworkImageView =itemView.findViewById(R.id.product_image)
    var productTitle: TextView =itemView.findViewById(R.id.product_title)
    var productPrice: TextView =itemView.findViewById(R.id.product_price)

}