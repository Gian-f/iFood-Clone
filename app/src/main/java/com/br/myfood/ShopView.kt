package com.br.myfood

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.br.myfood.databinding.ShopItemBinding
import com.squareup.picasso.Picasso

class ShopView(viewGroup: ViewGroup) : ATViewHolder<Shop, ShopItemBinding>(
        ShopItemBinding::inflate, viewGroup) {

    override fun bind(item : Shop) {
        Picasso.get()
            .load(item.bannerUrl)
            .into(binding.imgShop)

        binding.txtShop.text = item.text

    }
}