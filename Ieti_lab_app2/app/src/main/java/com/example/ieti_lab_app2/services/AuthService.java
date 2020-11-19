package com.example.ieti_lab_app2.services;

import com.example.ieti_lab_app2.model.LoginWrapper;
import com.example.ieti_lab_app2.model.Token;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {
    @POST("auth")
    Call<Token> login(@Body LoginWrapper loginWrapper);
}
