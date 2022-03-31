package com.artemissoftware.hephaestusui.ui.onboarding.di

import android.content.Context
import com.artemissoftware.hephaestusui.ui.onboarding.repositories.DataStoreRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OnboardingModule {

    @Provides
    @Singleton
    fun provideDataStoreRepository(@ApplicationContext context: Context) = DataStoreRepository(context = context)
}