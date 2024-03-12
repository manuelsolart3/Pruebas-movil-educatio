package com.jhon.educatioapp.apiservice
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object {
        private const val BASE_URL = "https://bdeducatio.vercel.app/api/"

        // Creamos una función para crear una instancia de Retrofit.
        fun createApiService(): ApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(ApiService::class.java)
        }
    }
    //Respuesta de Rol
    data class CambiarRolResponse(
        val message: String,
        val rol: String
    )
    // Respuestas de registro y login
    data class LoginResponse(
        val message:ArrayList<String>,
        val token: String?
    )

    data class ResponseApi(
        val message: ArrayList<String>
    )
}