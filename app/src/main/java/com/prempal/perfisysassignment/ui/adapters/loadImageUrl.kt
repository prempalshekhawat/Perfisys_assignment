package com.prempal.perfisysassignment.ui.adapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun loadImageUrl(imageView: ImageView, imageUrl: String?) {
    imageUrl?.let {
        Picasso.get().load(it).into(imageView)
    }

//    quoteImagePb?.visibility = View.VISIBLE
//    Picasso.get().load(imageUrl).into(imageView, object : Callback {
//        override fun onSuccess() {
//            quoteImagePb?.visibility = View.GONE
//        }
//
//        override fun onError(e: Exception?) {
//            quoteImagePb?.visibility = View.GONE
//        }
//    })
}