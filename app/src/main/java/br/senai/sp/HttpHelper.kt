package br.senai.sp

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

object HttpHelper {

    private val HEADER = MediaType.parse("application/json; charset=utf-8")

    var client = OkHttpClient()

    //Fazer um POST com Json
    fun post(url : String, json:String): String{
        val body = RequestBody.create(HEADER, json)
        val request = Request.Builder().url(url).post(body).build()

        return "OK"
    }

}