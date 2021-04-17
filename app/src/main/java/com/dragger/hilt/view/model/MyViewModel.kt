package com.dragger.hilt.view.model

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.dragger.hilt.data.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
        val handle: SavedStateHandle,
        val userData: UserData
) : ViewModel() {
    init {
        Log.d(MyViewModel::class.simpleName, "This is a view model.")
    }

}