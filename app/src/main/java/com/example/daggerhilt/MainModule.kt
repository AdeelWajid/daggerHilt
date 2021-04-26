package com.example.daggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


//We can declare multiple module in our application
//it is the container of dependencies that live specific time or as the application lives

@Module

//Tell the hilt which scope we are going to use (There are too many scopes in our application).
// We can say scope is the boundary of our module
//ActivityComponent limit it to our only activities
@InstallIn(ActivityComponent::class)

object MainModule {

    //blueprint of how it construct dependency we want to inject

    @ActivityScoped // only in activities for singleton
    @Provides
    fun provideTestString(
        @ApplicationContext context: Context,
        @Named("string1") testString1: String
    ) = "${context.getString(R.string.app_name)} - $testString1"
}