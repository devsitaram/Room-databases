package com.example.roomdatabases.feature;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Student.class, version = 1)
public abstract class Databases  extends RoomDatabase {

    private static Databases instance;
    private static final String DB_NAME = "StudentData";

    public static synchronized Databases getInstance(Context context){
        if(instance== null){
            instance = Room.databaseBuilder(context, Databases.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract StudentDao studentDao();
}
