package com.ruelas.doglist

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor:Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader(
            "Accept:", "application/json"
        )
            .addHeader("ApiKey", "123")
            .build()

        return chain.proceed(request)
    }
}