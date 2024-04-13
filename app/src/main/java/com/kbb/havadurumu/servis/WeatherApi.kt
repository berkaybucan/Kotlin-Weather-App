package com.kbb.havadurumu.servis

import com.kbb.havadurumu.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("data/2.5/weather?&units=metric&APPID=02fbd8bd284f003595f761b95300bf34")
        fun getData(
        @Query("q")cityName:String)
        : Single<WeatherModel>
}