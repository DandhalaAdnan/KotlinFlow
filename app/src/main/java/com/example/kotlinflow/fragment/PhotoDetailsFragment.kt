package com.example.kotlinflow.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinflow.databinding.FragmentPhotoDetailsBinding


class PhotoDetailsFragment : Fragment() {
    private lateinit var binding: FragmentPhotoDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentPhotoDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

}