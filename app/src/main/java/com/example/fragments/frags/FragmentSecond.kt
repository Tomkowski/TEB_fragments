package com.example.fragments.frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager

import com.example.fragments.R
import com.robinhood.ticker.TickerUtils
import com.robinhood.ticker.TickerView
import kotlinx.android.synthetic.main.fragment_second.*


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentFirst.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSecond : Fragment() {
    private var inc = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_second, container, false)
        val button = root.findViewById<Button>(R.id.button_inc)
        val tickerView = root.findViewById<TickerView>(R.id.fragment_text_view)

        tickerView.setCharacterLists(TickerUtils.provideNumberList());

        button.setOnClickListener {
            inc += 1
            tickerView.text = "$inc"

        }
        return root
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = FragmentSecond()
    }
}
