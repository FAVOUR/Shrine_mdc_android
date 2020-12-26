package com.example.shrine_mdc_android.staggeredgridlayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shrine_mdc_android.R
import com.example.shrine_mdc_android.network.ImageRequester
import com.example.shrine_mdc_android.network.ProductEntry

class StaggeredProductCardRecyclerViewAdapter(private val productList :List<ProductEntry>?): RecyclerView.Adapter<StaggeredProductCardViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return position % 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StaggeredProductCardViewHolder {
       var layoutId = R.layout.shr_staggered_product_card_first

        if (viewType == 1) {
            layoutId = R.layout.shr_staggered_product_card_second
        } else if (viewType == 2) {
            layoutId = R.layout.shr_staggered_product_card_third
        }

        val layoutView = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return StaggeredProductCardViewHolder(layoutView)
    }

    override fun getItemCount(): Int {
        return productList?.size ?: 0
    }

    override fun onBindViewHolder(holder: StaggeredProductCardViewHolder, position: Int) {

        if (productList != null && position < productList.size) {
            val product = productList[position]
            holder.productTitle.text = product.title
            holder.productPrice.text = product.price
            ImageRequester.setImageFromUrl(holder.produceImage, product.url)
        }

    }


}