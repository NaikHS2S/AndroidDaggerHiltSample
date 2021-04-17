package com.dragger.hilt.data

import javax.inject.Inject
import javax.inject.Named

class UserData @Inject constructor() {
    @Named("userName")
    @Inject
    lateinit var name: String
}