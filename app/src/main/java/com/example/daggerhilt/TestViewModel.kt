package com.example.daggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
//this annotation will create the viewModelFactory itself

//@inject used to inject dependencies as in constructor
class TestViewModel @Inject constructor(
    @Named("string1") testString: String
) : ViewModel() {

    init {
        Log.e("VieWModel", "Hello, How are you doing?")
    }
}