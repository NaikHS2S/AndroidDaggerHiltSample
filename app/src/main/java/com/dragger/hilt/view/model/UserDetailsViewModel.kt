package com.dragger.hilt.view.model

import androidx.lifecycle.ViewModel
import com.dragger.hilt.data.UserDetailFetcher
import com.dragger.hilt.data.UserContactFetcher
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserDetailsViewModel @Inject constructor(
        val detailFetcher: UserDetailFetcher,
        val userContactFetcher: UserContactFetcher
) : ViewModel() {
    init {

    }
}