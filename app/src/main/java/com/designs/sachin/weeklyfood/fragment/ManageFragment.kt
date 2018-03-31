package com.designs.sachin.weeklyfood.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.designs.sachin.weeklyfood.R

import com.xwray.groupie.kotlinandroidextensions.Item


class ManageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_manage, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    private fun updateRecyclerView(items: List<Item>) {
    }

}
