package com.example.movieapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.movieapp.R;
import com.example.movieapp.serviceapi.*;
//import com.example.movieapp.serviceapi.movieserviceApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepository {

    private ArrayList<Movie> movies = new ArrayList<>();
    private MutableLiveData<List<Movie>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public MovieRepository(Application application) {
        this.application = application;
    }


    public MutableLiveData<List<Movie>> getMutableLiveData(){

        movieserviceApi MovieserviceApi = RetrofitInstance.getService();

        Call<Result> call = MovieserviceApi.getPopularMovies(application.getApplicationContext().getString(R.string.api_key));

        call.enqueue(new Callback<Result>() {
            
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {

                Result result = response.body();

                if(result != null && result.getResult() != null){
                    List<Movie> movie = result.getResult();
                    mutableLiveData.setValue(movie);
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable throwable) {

            }
        });

        return mutableLiveData;
    }
}
