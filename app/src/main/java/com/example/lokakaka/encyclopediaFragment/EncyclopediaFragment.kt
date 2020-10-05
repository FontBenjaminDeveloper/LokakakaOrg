package com.example.lokakaka.encyclopediaFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.lokakaka.R


class EncyclopediaFragment: Fragment() {

    private lateinit var smugglingButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_encyclopedia, container, false)

    companion object {
        fun newInstance(): EncyclopediaFragment = EncyclopediaFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        smugglingButton = getView()?.findViewById(R.id.buttonSmuggling)!!
        smugglingButton.setOnClickListener( {
            val ft: FragmentTransaction = fragmentManager!!.beginTransaction()
            ft.replace(this.id, SmugglingFragment(), "SmugglingFragment")
            ft.commit()
        })
    }

}