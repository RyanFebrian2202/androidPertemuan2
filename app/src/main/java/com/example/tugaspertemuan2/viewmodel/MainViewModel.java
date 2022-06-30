package com.example.tugaspertemuan2.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tugaspertemuan2.data.remotes.ApiConfig;
import com.example.tugaspertemuan2.data.remotes.ApiService;
import com.example.tugaspertemuan2.data.remotes.ContentListItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<ContentListItem>> _contentLists = new MutableLiveData<>();
    public LiveData<List<ContentListItem>> getContentListItems() {
        return _contentLists;
    }

    private final ApiService mApiService = ApiConfig.getApiService();

    public void callApi() {
        mApiService.getContentLists().enqueue(new Callback<List<ContentListItem>>() {
            @Override
            public void onResponse(Call<List<ContentListItem>> call, Response<List<ContentListItem>> response) {
                if (response.isSuccessful()) {
                    _contentLists.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<ContentListItem>> call, Throwable t) {

            }
        });
    }
}
