package ru.kpfu.itis.springControllers.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.kpfu.itis.springControllers.model.Episode;

public interface Api {
    @GET("/api/episode")
    Call<List<Episode>> getData();
}