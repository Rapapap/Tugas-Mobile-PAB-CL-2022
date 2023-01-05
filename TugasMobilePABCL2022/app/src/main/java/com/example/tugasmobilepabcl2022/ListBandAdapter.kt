package com.example.tugasmobilepabcl2022

import android.app.DownloadManager.Request
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.TugasMobilePABCL2022.databinding.ItemRowBandBinding

class ListBandAdapter (private val list : ArrayList<Band>) :
    RecyclerView.Adapter<ListBandAdapter.ListViewHolder>() {
    inner class ListViewHolder (private val binding : ItemRowBandBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(band: Band){
        with(binding){
            tvBandName.text = band.name
            tvBandDetail.text = band.detail
            Glide.with(itemView.context)
                .load(band.photo)
                .apply(RequestOptions().override(260, 260))
                .into(ivBand)
        }
    }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowBandBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]

        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}