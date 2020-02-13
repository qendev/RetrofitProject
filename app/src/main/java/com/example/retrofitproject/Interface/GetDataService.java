package com.example.retrofitproject.Interface;


/*created by qendev
* on 13th feb 2020*/


/*create an interface for defining endpoints using special retrofit annotations to encode details about the parameters and request method (in this case Get Method)*/

import com.example.retrofitproject.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
