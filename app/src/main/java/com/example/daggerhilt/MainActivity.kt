package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

//Where we want the inject dependencies
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    //It search on the behalf of dataType, in our case it is String it will carry the string type object or method from our appModule
    //But in the solution we can use @Named annotation in our appModule and in activity as well, to tell which we are going to use
     @Named("string1")
    lateinit var testString: String

     private val viewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, ""+testString, Toast.LENGTH_SHORT).show()

        viewModel
    }
}