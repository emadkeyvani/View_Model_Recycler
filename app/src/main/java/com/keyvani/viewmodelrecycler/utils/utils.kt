package com.keyvani.viewmodelrecycler.utils

import com.keyvani.viewmodelrecycler.ItemModel

object utils {

    fun setData():MutableList<ItemModel>{
        val nameList : MutableList<ItemModel> = mutableListOf()
        nameList.add(ItemModel(1,"Row 1"))
        nameList.add(ItemModel(2,"Row 2"))
        nameList.add(ItemModel(3,"Row 3"))
        nameList.add(ItemModel(4,"Row 4"))
        nameList.add(ItemModel(5,"Row 5"))
        nameList.add(ItemModel(6,"Row 6"))
        nameList.add(ItemModel(7,"Row 7"))
        nameList.add(ItemModel(8,"Row 8"))
        nameList.add(ItemModel(9,"Row 9"))
        nameList.add(ItemModel(10,"Row 10"))
        nameList.add(ItemModel(11,"Row 11"))
        nameList.add(ItemModel(12,"Row 12"))
        nameList.add(ItemModel(13,"Row 13"))
        nameList.add(ItemModel(14,"Row 14"))
        nameList.add(ItemModel(15,"Row 15"))
        nameList.add(ItemModel(16,"Row 16"))
        nameList.add(ItemModel(17,"Row 17"))
        nameList.add(ItemModel(18,"Row 18"))
        nameList.add(ItemModel(19,"Row 19"))
        nameList.add(ItemModel(20,"Row 20"))

        return nameList

    }
}