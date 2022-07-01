package com.example.tugaspertemuan2.data.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.tugaspertemuan2.data.local.ContentListDao;
import com.example.tugaspertemuan2.data.local.ContentListRoomDatabase;
import com.example.tugaspertemuan2.data.remotes.ContentListItem;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ContentListRepository {

    private ContentListDao mContentListDao;

    private final ExecutorService mExecutorService;

    public ContentListRepository(Application application) {
        mExecutorService = Executors.newSingleThreadExecutor();
        ContentListRoomDatabase db = ContentListRoomDatabase.getDatabase(application);
        mContentListDao = db.mContentListDao();
    }

    public LiveData<List<ContentListItem>> getContentLists() {
        return mContentListDao.getContentLists();
    }

    public void insert(final ContentListItem contentListItem) {
        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                mContentListDao.insert(contentListItem);
            }
        });
    }
}
