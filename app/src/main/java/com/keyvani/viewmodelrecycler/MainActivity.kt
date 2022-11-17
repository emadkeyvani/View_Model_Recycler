package com.keyvani.viewmodelrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.keyvani.viewmodelrecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val itemAdapter by lazy { ItemAdapter() }
    private val viewModel : RecyclerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        itemAdapter.differ.submitList(viewModel.itemsList)
        binding.apply {
            rvMain.apply {
                adapter= itemAdapter
                layoutManager= LinearLayoutManager(this@MainActivity)

            }
        }

    }

}