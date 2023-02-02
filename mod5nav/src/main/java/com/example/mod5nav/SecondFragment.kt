package com.example.mod5nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar


class SecondFragment : Fragment() {
    val args : SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    /** @param view :sert à rien
     * @return bah que d'alle
     *
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button2 = view.findViewById<Button>(R.id.button2)
        Snackbar.make(view,args.user.prenom,500).show()
        button2.setOnClickListener {
            Navigation.findNavController(view).popBackStack()
        }
    }
}