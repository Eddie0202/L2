package com.example.lab2.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.databinding.CardLayoutBinding

class ViewHolder private constructor(
    private val binding: CardLayoutBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): ViewHolder {
            val binding = CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }
    }

    fun bind(Data: data) {
        binding.itemTitle.text = Data.name
        binding.itemDetail.text = Data.singer
    }
}