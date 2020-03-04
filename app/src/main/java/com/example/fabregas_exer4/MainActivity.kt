package com.example.fabregas_exer4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.fabregas_exer4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val slumBook : SlumBook = SlumBook("Name","Nickname","Age")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //binding
        binding.button.setOnClickListener{
            done(it)
        }
        binding.slumBook = slumBook
    }

    private fun done(view: View){

        binding.apply {
            //finding variables
            slumBook?.name = nameEntry.text.toString()
            slumBook?.nickname = nicknameEntry.text.toString()
            slumBook?.age = ageEntry.text.toString()
            message.text = getString(R.string.message)

            //align the text

            name.textAlignment = View.TEXT_ALIGNMENT_CENTER
            nickname.textAlignment = View.TEXT_ALIGNMENT_CENTER
            age.textAlignment = View.TEXT_ALIGNMENT_CENTER
            message.textAlignment = View.TEXT_ALIGNMENT_CENTER

            name.setTextSize(TypedValue.COMPLEX_UNIT_SP,20.0f)
            nickname.setTextSize(TypedValue.COMPLEX_UNIT_SP,20.0f)
            age.setTextSize(TypedValue.COMPLEX_UNIT_SP,20.0f)
            message.setTextSize(TypedValue.COMPLEX_UNIT_SP,20.0f)



            //removing
            HelloText.visibility = View.GONE
            button.visibility = View.GONE
            phone.visibility = View.GONE
            email.visibility = View.GONE
            course.visibility = View.GONE
            dream.visibility = View.GONE
            crush.visibility = View.GONE
            biirthday.visibility = View.GONE

            nameEntry.visibility = View.GONE
            nicknameEntry.visibility = View.GONE
            ageEntry.visibility = View.GONE
            phoneEntry.visibility = View.GONE
            emailEntry.visibility = View.GONE
            courseEntry.visibility = View.GONE
            dreamEntry.visibility = View.GONE
            crushEntry.visibility = View.GONE
            nameEntry9.visibility = View.GONE
            birthdayEntry.visibility = View.GONE

            //reset
            invalidateAll()
        }
    }
}
