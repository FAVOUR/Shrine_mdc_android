package com.example.shrine_mdc_android.staggeredgridlayout

import android.view.View
import com.android.volley.toolbox.NetworkImageView
import com.example.shrine_mdc_android.R

class StaggeredProductCardViewHolder(itemView: View) {

    var produceImage: NetworkImageView =itemView.findViewById(R.id.product_image)
    var productTitle: NetworkImageView =itemView.findViewById(R.id.product_title)
    var productPrice: NetworkImageView =itemView.findViewById(R.id.product_price)

}