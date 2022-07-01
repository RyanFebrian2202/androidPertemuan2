package com.example.tugaspertemuan2.viewmodel;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tugaspertemuan2.data.remotes.ContentListItem;
import com.example.tugaspertemuan2.data.repository.ContentListRepository;

import java.util.List;

public class OfflineViewModel extends ViewModel {

    private ContentListRepository mContentListRepository;

    public OfflineViewModel(Application application) {
        mContentListRepository = new ContentListRepository(application);
    }

    public LiveData<List<ContentListItem>> getOfflineData() {
        return mContentListRepository.getContentLists();
    }
}
