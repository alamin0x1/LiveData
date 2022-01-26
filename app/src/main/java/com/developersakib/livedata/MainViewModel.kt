package com.developersakib.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _text = MutableLiveData<String>()
    private var _btnText = MutableLiveData<String>()

    val text: LiveData<String>
        get() = _text
    val btnText: LiveData<String>
        get() = _btnText

    init {
        _text.value = "Subscribe our channel \n Developer Al-Amin"
        _btnText.value = "Subscribe"
    }


    fun updateText() {

        _text.value = "Welcome to our Community \n Developer Al-Amin"
        _btnText.value = "Subscribed"
    }
}