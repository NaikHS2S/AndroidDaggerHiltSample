package com.dragger.hilt.data

import com.dragger.hilt.view.model.UserDetailsRepository
import javax.inject.Inject

class UserDetailFetcher @Inject constructor(val userDetailsRepo: UserDetailsRepository)