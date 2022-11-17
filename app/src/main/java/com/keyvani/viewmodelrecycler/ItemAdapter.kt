package com.keyvani.viewmodelrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.keyvani.viewmodelrecycler.databinding.ActivityItemBinding

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    private lateinit var binding: ActivityItemBinding
    private lateinit var context: Context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding =ActivityItemBinding.inflate(inflater,parent,false)
        context=parent.context
        return ViewHolder()

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class ViewHolder : RecyclerView.ViewHolder(binding.root){
        fun bind(item : ItemModel){
            binding.apply {
                tvMovieName.text=item.name
            }
        }

    }

    private val differCallback = object: DiffUtil.ItemCallback<ItemModel>(){
        override fun areItemsTheSame(oldItem: ItemModel, newItem: ItemModel): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: ItemModel, newItem: ItemModel): Boolean {
           return  oldItem==newItem
        }

    }
    val differ = AsyncListDiffer(this,differCallback)

}