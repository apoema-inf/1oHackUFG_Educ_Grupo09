package br.ufg.group9.pevb.di

import br.ufg.group9.pevb.repository.RemoteRepository
import br.ufg.group9.pevb.util.Constants.Companion.API
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val netModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(API)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}

val repositoryModule = module {
    single { RemoteRepository(get()) }
}