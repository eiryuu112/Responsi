package com.example.user.utsresponsi.apl;

import com.example.user.utsresponsi.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service
{
    @GET("movie/popular")
        Call<MoviesResponse> getPopularMovies(@Query("d16bcd76769de9f4e5d102d57f8c2997") String apiKey);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("d16bcd76769de9f4e5d102d57f8c2997") String apiKey);

    //@GET("movie/popular")
    //Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    //@GET("movie/top_rated")
    //Call<MoviesResponse> getTopRatedMovies(@Query("d16bcd76769de9f4e5d102d57f8c2997") String apiKey);

}
