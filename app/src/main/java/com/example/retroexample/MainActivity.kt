package com.example.retroexample

import ApiService
import RetrofitInstance
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import com.example.retroexample.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//import com.example.retroexample.RetrofitInstance


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {

            GlobalScope.launch(Dispatchers.IO) {

                val response = RetrofitInstance.apiService.fetchData()
                Log.d("Error", "2")
                if (response.isSuccessful) {
                    val dataItems = response.body()?.data
                    if (dataItems != null) {
                        for (dataItem in dataItems) {
                            Toast.makeText(this@MainActivity, "$dataItem", Toast.LENGTH_LONG).show()
                            binding.tv.text = dataItem.name
                        }
                    } else {
                        Toast.makeText(this@MainActivity, "NO", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this@MainActivity, "SomeError", Toast.LENGTH_SHORT).show()
                }


            }
        }



    }
}