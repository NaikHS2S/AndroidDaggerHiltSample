package com.dragger.hilt.view.model

import androidx.lifecycle.SavedStateHandle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class UserViewModelModule {
    @Provides
    @ViewModelScoped
    fun provideRepo(handle: SavedStateHandle) =
            UserDetailsRepository(handle.getString("user-id"))
}

private fun SavedStateHandle.getString(s: String): String {
 return ""
}
