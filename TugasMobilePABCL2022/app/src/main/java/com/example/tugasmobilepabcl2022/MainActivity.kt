package com.example.tugasmobilepabcl2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.TugasMobilePABCL2022.R
import com.example.TugasMobilePABCL2022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding : ActivityMainBinding by viewBinding()
    private val list : ArrayList<Band> = arrayListOf()
    private lateinit var listBandAdapter: ListBandAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvBand.setHasFixedSize(true)
        list.addAll(BandData.lisData)

        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        binding.apply {
            rvBand.layoutManager = LinearLayoutManager(this@MainActivity)
            listBandAdapter = ListBandAdapter(list)
            rvBand.adapter = listBandAdapter
        }
    }
}