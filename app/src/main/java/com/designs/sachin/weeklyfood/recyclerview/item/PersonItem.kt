package com.designs.sachin.weeklyfood.recyclerview.item

import android.content.Context
import com.designs.sachin.weeklyfood.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import com.designs.sachin.weeklyfood.model.User
import kotlinx.android.synthetic.main.fragment_my_account.*
import kotlinx.android.synthetic.main.item_person.*


class PersonItem(val person: User,
                 val userId: String,
                 private val context: Context)
    : Item() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
    }

    override fun getLayout() = R.layout.item_person
}