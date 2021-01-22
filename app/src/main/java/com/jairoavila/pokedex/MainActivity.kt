package com.jairoavila.pokedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.dynamicfeatures.fragment.DynamicNavHostFragment
import androidx.navigation.findNavController
import com.jairoavila.pokedex.databinding.ActivityMainBinding
import com.jairoavila.pokedex.navigation.NavigationFlow
import com.jairoavila.pokedex.navigation.Navigator
import com.jairoavila.pokedex.navigation.ToFlowNavigatable
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), ToFlowNavigatable {

    private lateinit var binding: ActivityMainBinding
    private val navigator by lazy { Navigator() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as DynamicNavHostFragment
        navigator.navController = navHostFragment.navController

    }

    override fun navigateToFlow(flow: NavigationFlow) {
        navigator.navigateToFlow(flow)
    }
}
