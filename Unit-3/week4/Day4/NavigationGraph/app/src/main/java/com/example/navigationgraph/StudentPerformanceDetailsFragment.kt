package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import kotlinx.android.synthetic.main.fragment_student_performance_details.*

class StudentPerformanceDetailsFragment : Fragment(R.layout.fragment_student_personal_details) {


    private lateinit var name :String
    private var age = 0;
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDataFromBundle()

    }

    private fun getDataFromBundle(){
        arguments?.run{
            name = getString("name")!!
            age = getInt("key")
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnPreview.setOnClickListener {
            val precentage = etStudentPercentage.text.toString()
            val grade = etStudentGrade.text.toString()
        }
    }
}