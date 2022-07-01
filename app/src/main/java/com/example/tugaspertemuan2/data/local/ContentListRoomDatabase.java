package com.example.tugaspertemuan2.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.tugaspertemuan2.data.remotes.ContentListItem;

@Database(entities = {ContentListItem.class},version = 1)
public abstract class ContentListRoomDatabase extends RoomDatabase {
    public abstract ContentListDao mContentListDao();

    public ContentListRoomDatabase() {
    }

    private static ContentListRoomDatabase INSTANCE;

    public static ContentListRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ContentListRoomDatabase.class) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        ContentListRoomDatabase.class,
                        "content_database").build();
            }
        }
        return INSTANCE;
    }
}
