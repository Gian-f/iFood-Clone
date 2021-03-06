package com.br.myfood

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.br.myfood.databinding.BannerItemBinding
import com.squareup.picasso.Picasso

class BannerView (viewGroup: ViewGroup) : ATViewHolder<Banner, BannerItemBinding> (
        BannerItemBinding::inflate, viewGroup) {

    override fun bind(item : Banner) {
        Picasso.get()
            .load(item.bannerUrl)
            .into(binding.imgBanner)
    }
}