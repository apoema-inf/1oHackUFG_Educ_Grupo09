package br.ufg.group9.pevb.repository

import br.ufg.group9.pevb.model.Internship
import br.ufg.group9.pevb.remote.Endpoint
import retrofit2.Retrofit
import retrofit2.create

class RemoteRepository(private val retrofit: Retrofit) {

    suspend fun getListInternship(): List<Internship> {
        return retrofit.create(Endpoint::class.java).getInternship()
    }
}