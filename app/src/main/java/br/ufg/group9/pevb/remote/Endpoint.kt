package br.ufg.group9.pevb.remote

import br.ufg.group9.pevb.model.Internship
import retrofit2.http.GET

interface Endpoint {
    @GET("/estagio")
    suspend fun getInternship(): List<Internship>
}