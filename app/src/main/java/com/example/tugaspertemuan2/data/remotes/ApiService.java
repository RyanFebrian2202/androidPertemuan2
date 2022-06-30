package com.example.tugaspertemuan2.data.remotes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("nbateams")
    Call<List<ContentListItem>> getContentLists();
}
