package com.wheatherapp.view.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.wheatherapp.openweathermap.R
import com.wheatherapp.view.interfaces.BackPressListner
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by dharmesh on 25/07/21.
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    override fun onBackPressed() {

        val fragment =
            this.supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as? NavHostFragment
        val currentFragment = fragment?.childFragmentManager?.fragments?.get(0) as? BackPressListner

        currentFragment?.onBackPressed()?.takeIf { !it }?.let { super.onBackPressed() }

    }





}
