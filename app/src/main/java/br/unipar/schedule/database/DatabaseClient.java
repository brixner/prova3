package br.unipar.schedule.database;

import android.content.Context;

import androidx.room.Room;

import java.lang.ref.WeakReference;

public class DatabaseClient {

    private static AppDatabase databaseInstance;
    private static final String DATABASE_NAME = "app_database";

    public static synchronized AppDatabase getDatabase(WeakReference<Context> weakReference) {
        if (databaseInstance == null) {
            databaseInstance = Room.databaseBuilder(weakReference.get(), AppDatabase.class, DATABASE_NAME).build();
        }
        return databaseInstance;
    }
}