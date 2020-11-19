package com.example.ieti_lab_app2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Token
{

    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}