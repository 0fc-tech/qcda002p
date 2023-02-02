package com.example.mod5racontehistoire.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mod5racontehistoire.R
import com.example.mod5racontehistoire.data.Histoire
import com.example.mod5racontehistoire.databinding.FragmentFormBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FormFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FormFragment : Fragment() {
    lateinit var ffb : FragmentFormBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        ffb = FragmentFormBinding.inflate(inflater, container, false)
        return ffb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ffb.buttonGoToDisplay.setOnClickListener { view ->
            val place = ffb.editTextPlace.text.toString()
            val name = ffb.editTextName.text.toString()
            FormFragmentDirections.actionFormToFragment(Histoire(name,place))
                .also { direction ->
                    Navigation.findNavController(view).navigate(direction)
                }

        }
    }

}