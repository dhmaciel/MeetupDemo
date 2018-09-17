package com.dhmaciel.meetupdemo


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_password.*

class PasswordFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Retrieving the arguments
        val args = arguments?.getString("login_args")
        text_view_bundle.text = args

        // SafeArgs sending parameters
        button_login.setOnClickListener {
            val action = PasswordFragmentDirections.actionPasswordFragmentToContentFragment(text_view_bundle.text.toString(),
                    edit_text_password.text.toString())

            Navigation.findNavController(activity!!, R.id.fragment_nav_host).navigate(action)
        }

        button_clear.setOnClickListener {
            edit_text_password.setText("")
        }
    }
}
