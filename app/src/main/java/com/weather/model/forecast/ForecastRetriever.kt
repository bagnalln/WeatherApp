package com.weather.model.forecast

import com.weather.model.Constants.TEST_POINT
import okhttp3.OkHttpClient
import okhttp3.Request


class ForecastRetriever {
    private val client = OkHttpClient()

    fun retrieveHourlyForecast(x: Int, y: Int) {
        val request = Request.Builder()
            .url("https://api.weather.gov/points${TEST_POINT[0]},${TEST_POINT[1]}")
            .get()
            .build()

        val response = client.newCall(request).execute()
    }
}