package com.dhmaciel.meetupdemo


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_content.*


class ContentFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // SafeArgs receiving the parameters
        val login = ContentFragmentArgs.fromBundle(arguments).contentLoginArgs
        val password = ContentFragmentArgs.fromBundle(arguments).contentPassArgs

        edit_text_safe_args_login.text = login
        edit_text_safe_args_pass.text = password

        buttonToBottomBar.setOnClickListener{
            Navigation.findNavController(activity!!,R.id.fragment_nav_host)
                    .navigate(R.id.action_contentFragment_to_bottomBarActivity)

        }
    }
}
