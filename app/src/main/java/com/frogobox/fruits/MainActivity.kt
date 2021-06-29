package com.frogobox.fruits

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.frogobox.fruits.fruitandvegetable.R
import com.frogobox.fruits.fruitandvegetable.databinding.ActivityMainBinding
import com.frogobox.recycler.core.IFrogoViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        setupUI()

    }

    private fun setupUI() {

        val callback = object : IFrogoViewAdapter<Fruit>{
            override fun onItemClicked(data: Fruit) {}
            override fun onItemLongClicked(data: Fruit) {}
            override fun setupInitComponent(view: View, data: Fruit) {

                val btn = view.findViewById<ImageView>(R.id.btn_play)
                val iv = view.findViewById<ImageView>(R.id.iv_fruit)
                val root = view.findViewById<LinearLayout>(R.id.root)
                val name = view.findViewById<TextView>(R.id.name)
                val kind = view.findViewById<TextView>(R.id.kind)
                val media = MediaPlayer.create(this@MainActivity, data.music)

                val colorBackground1 = ContextCompat.getColor(this@MainActivity, R.color.colorBackground1)
                val colorBackground2 = ContextCompat.getColor(this@MainActivity, R.color.colorBackground2)
                val colorBackground3 = ContextCompat.getColor(this@MainActivity, R.color.colorBackground3)
                val colorBackground4 = ContextCompat.getColor(this@MainActivity, R.color.colorBackground4)

                val pl_cherry = MediaPlayer.create(this@MainActivity, R.raw.cherry)

                val colorImage1 = ContextCompat.getColor(this@MainActivity, R.color.colorImage1)
                val colorImage2 = ContextCompat.getColor(this@MainActivity, R.color.colorImage2)
                val colorImage3 = ContextCompat.getColor(this@MainActivity, R.color.colorImage3)
                val colorImage4 = ContextCompat.getColor(this@MainActivity, R.color.colorImage4)

                when (data.type) {
                    "1" -> {
                        root.setBackgroundColor(colorBackground1)
                        iv.setBackgroundColor(colorImage1)
                    }
                    "2" -> {
                        root.setBackgroundColor(colorBackground2)
                        iv.setBackgroundColor(colorImage2)
                    }
                    "3" -> {
                        root.setBackgroundColor(colorBackground3)
                        iv.setBackgroundColor(colorImage3)
                    }
                    "4" -> {
                        root.setBackgroundColor(colorBackground4)
                        iv.setBackgroundColor(colorImage4)
                    }
                }

                iv.setImageResource(data.image)
                name.text = data.name
                kind.text = data.kind

                btn.setOnClickListener{
                    media.start()
                }

            }
        }

        binding.rv.injector<Fruit>()
            .addData(fruits())
            .addCustomView(R.layout.list_item)
            .createLayoutLinearVertical(false)
            .addCallback(callback)
            .build()
    }

    private fun fruits() : MutableList<Fruit> {
        val data = mutableListOf<Fruit>()
        data.add(Fruit("1", "Apple", "Fruit",R.drawable.apple, R.raw.apple))
        data.add(Fruit("2", "Banana", "Fruit",R.drawable.banana, R.raw.banana))
        data.add(Fruit("3", "Cherry", "Fruit",R.drawable.cherri, R.raw.cherry))
        data.add(Fruit("4", "Grape", "Fruit",R.drawable.grape, R.raw.grape))
        data.add(Fruit("1", "Lemon", "Fruit",R.drawable.lemon, R.raw.lemon))
        data.add(Fruit("2", "Orange", "Fruit",R.drawable.orange, R.raw.orange))
        data.add(Fruit("3", "Pear", "Fruit",R.drawable.pear, R.raw.pear))
        data.add(Fruit("4", "Strawberry", "Fruit",R.drawable.strawberry, R.raw.strawberry))
        return data
    }

}