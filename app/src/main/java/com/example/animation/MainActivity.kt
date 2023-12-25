package com.example.animation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.inbuiltAnimationFrag.setOnClickListener {
            loadFrag(InbuiltAnimationFragment(), 1)
        }

        binding.thirdPartyAnimationFrag.setOnClickListener {
            loadFrag(ThirdPartyAnimationFragment(), 1)
        }
    }

    private fun loadFrag(fragments: Fragment, flag: Int) {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        if (flag == 0) ft.add(R.id.container, fragments)
        else ft.replace(R.id.container, fragments)

        ft.commit()
    }
}