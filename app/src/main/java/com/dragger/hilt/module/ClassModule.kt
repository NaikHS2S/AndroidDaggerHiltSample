package com.dragger.hilt.module

import com.dragger.hilt.data.DataClassImpl
import com.dragger.hilt.data.DataClassImpl2
import com.dragger.hilt.data.DataInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class MySecondClass

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class MyFirstClass

@Module
@InstallIn(SingletonComponent::class)
interface ClassModule {

    @Binds
    @MyFirstClass
    fun provideMyFirstClass(dataClassImpl: DataClassImpl): DataInterface

    @Binds
    @MySecondClass
    fun provideMySecondClass(dataClassImpl2: DataClassImpl2): DataInterface
}