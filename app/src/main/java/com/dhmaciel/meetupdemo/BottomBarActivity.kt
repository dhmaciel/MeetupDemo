package com.dhmaciel.meetupdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_bottom_bar.*
import androidx.navigation.ui.setupWithNavController

class BottomBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_bar)

        navigation_bottom_bar.setupWithNavController(Navigation.findNavController(this, R.id.fragment_nav_host_bottom))
    }
}
