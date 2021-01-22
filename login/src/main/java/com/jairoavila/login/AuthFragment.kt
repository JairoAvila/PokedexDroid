package com.jairoavila.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.jairoavila.pokedex.navigation.NavigationFlow
import com.jairoavila.pokedex.navigation.ToFlowNavigatable

class AuthFragment : Fragment() {

    private var text: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text = view.findViewById(R.id.tv_auth) as TextView

        text?.setOnClickListener {
            (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.DashboardFlow)
        }
    }

}
