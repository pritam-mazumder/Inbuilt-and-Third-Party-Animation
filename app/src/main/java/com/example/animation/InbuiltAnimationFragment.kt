package com.example.animation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.example.animation.databinding.FragmentInbuiltAnimationBinding

class InbuiltAnimationFragment : Fragment() {

    private lateinit var binding: FragmentInbuiltAnimationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentInbuiltAnimationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fadeIn.setOnClickListener {
            val fi = AnimationUtils.loadAnimation(context, R.anim.fadein)
            binding.t.startAnimation(fi)
        }

        binding.fadeOut.setOnClickListener {
            val fo = AnimationUtils.loadAnimation(context, R.anim.fadeout)
            binding.t.startAnimation(fo)
        }

        binding.zoomIn.setOnClickListener {
            val zi = AnimationUtils.loadAnimation(context, R.anim.zoomin)
            binding.t.startAnimation(zi)
        }

        binding.zoomOut.setOnClickListener {
            val zo = AnimationUtils.loadAnimation(context, R.anim.zoomout)
            binding.t.startAnimation(zo)
        }

        binding.slideDown.setOnClickListener {
            val sd = AnimationUtils.loadAnimation(context, R.anim.slidedown)
            binding.t.startAnimation(sd)
        }

        binding.slideUp.setOnClickListener {
            val su = AnimationUtils.loadAnimation(context, R.anim.slideup)
            binding.t.startAnimation(su)
        }

        binding.bounce.setOnClickListener {
            val b = AnimationUtils.loadAnimation(context, R.anim.bounce)
            binding.t.startAnimation(b)
        }

        binding.rotate.setOnClickListener {
            val r = AnimationUtils.loadAnimation(context, R.anim.rotate)
            binding.t.startAnimation(r)
        }
    }
}