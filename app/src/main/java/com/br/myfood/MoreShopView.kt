package com.br.myfood

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.br.myfood.databinding.MoreShopBinding
import com.squareup.picasso.Picasso

class MoreShopView(viewGroup: ViewGroup) : ATViewHolder<MoreShop, MoreShopBinding>(
        MoreShopBinding::inflate, viewGroup) {

    override fun bind(item : MoreShop) {
        Picasso.get()
            .load(item.bannerUrl)
            .into(binding.imgShop)

        binding.txtShop.text = item.text
        binding.txtStar.text = item.rate.toString()
        binding.txtSubtitle.text = itemView.context.getString(R.string.shop_category, item.category, item.distance)
        binding.txtPrice.text = itemView.context.getString(R.string.shop_price, item.time, item.price)

    }
}