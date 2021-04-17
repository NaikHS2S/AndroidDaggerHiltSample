package com.dragger.hilt.view.model

import androidx.lifecycle.ViewModel
import com.dragger.hilt.data.DataInterface
import com.dragger.hilt.module.MyFirstClass
import com.dragger.hilt.module.MySecondClass

import javax.inject.Inject

class YourViewModel @Inject constructor(@MyFirstClass private val firstClass: DataInterface, @MySecondClass private val secondClass: DataInterface
) : ViewModel()