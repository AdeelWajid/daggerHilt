package com.example.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


//We can declare multiple module in our application
//it is the container of dependencies that live specific time or as the application lives

@Module

//Tell the hilt which scope we are going to use (There are too many scopes in our application).
// We can say scope is the boundary of our module
@InstallIn(SingletonComponent::class)

object AppModule {

    //blueprint of how it construct dependency we want to inject

    @Singleton
    @Provides
    @Named("string1")
    fun provideTestString1() = "This is the sting which we are going to inject"
}