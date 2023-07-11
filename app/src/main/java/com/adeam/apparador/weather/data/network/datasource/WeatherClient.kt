package com.adeam.apparador.weather.data.network.datasource

import com.adeam.apparador.weather.data.network.ApiConstants.CURRENT_ENDPOINT
import com.adeam.apparador.weather.data.network.ApiParameters.KEY
import com.adeam.apparador.weather.data.network.ApiParameters.LANGUAGE
import com.adeam.apparador.weather.data.network.ApiParameters.LOCATION
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherClient {

    @GET(CURRENT_ENDPOINT)
    suspend fun getWeather(
        @Query(KEY) key: String,
        @Query(LOCATION) location: String,
        @Query(LANGUAGE) language: String)
}