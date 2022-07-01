package com.example.tugaspertemuan2.data.local;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.tugaspertemuan2.data.remotes.ContentListItem;

import java.util.List;

@Dao
public interface ContentListDao {
    @Insert
    void insert(ContentListItem contentListItem);

    @Query("SELECT * FROM ContentListItem")
    LiveData<List<ContentListItem>> getContentLists();
}
