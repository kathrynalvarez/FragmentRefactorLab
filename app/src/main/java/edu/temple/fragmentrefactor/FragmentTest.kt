package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FragmentTest : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_test, container,false).apply {
        // Inflate the layout for this fragment
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        val nameEditText = findViewById<TextView>(R.id.nameEditText)
        val changeButton = findViewById<Button>(R.id.changeButton)

        changeButton.apply {
            setOnClickListener {
                val name = nameEditText.text

                displayTextView.text = if (name.isNotEmpty()) {
                    "Hello $name!"
                } else {
                    "Enter name"
                }
            }
        }
    }
}