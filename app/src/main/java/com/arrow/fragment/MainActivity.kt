package com.arrow.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arrow.fragment.Constants.PARAM_1
import com.arrow.fragment.Constants.PARAM_2

class MainActivity : AppCompatActivity() {

    private lateinit var blankFragment: BlankFragment
    private val blankFragmentTag: String = "Blank Fragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // instantiate blank fragment
        blankFragment = BlankFragment.newInstance(PARAM_1, PARAM_2)

        // add "BlankFragment" to container (Main Activity)
        // provide tag name to handle configuration changes
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container, blankFragment, blankFragmentTag)
                    .commit()
        }
    }
}