package com.dhmaciel.meetupdemo


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate with Bundle
        button_next.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("login_args", edt_text_login.text.toString())
            Navigation.findNavController(activity!!,R.id.fragment_nav_host)
                    .navigate(R.id.action_loginFragment_to_passwordFragment, bundle)
        }
        // Simple navigate
        //button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_passwordFragment))

        // Clear editText
        button_clear.setOnClickListener{
            edt_text_login.setText("")
        }
    }
}
