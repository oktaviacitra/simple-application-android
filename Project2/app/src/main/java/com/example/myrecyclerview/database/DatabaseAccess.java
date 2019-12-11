package com.example.myrecyclerview.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.myrecyclerview.model.Place;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public List<Place> getQuotes() {
        List<Place> list = new ArrayList<>();
//        String[] field = {"id", "name", "latitude", "longitude", "site", "detail"};
//        Cursor cursor = database.query("Places", field, null, null, null, null, null);
        Cursor cursor = database.rawQuery("SELECT * FROM Places", null);
        int idIndex = cursor.getColumnIndex("id");
        int nameIndex = cursor.getColumnIndex("name");
        int latitudeIndex = cursor.getColumnIndex("latitude");
        int longitudeIndex = cursor.getColumnIndex("longitude");
        int siteIndex = cursor.getColumnIndex("site");
        int detailIndex = cursor.getColumnIndex("detail");

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            int id = cursor.getInt(idIndex);
            String name = cursor.getString(nameIndex);
            double latitude = cursor.getDouble(latitudeIndex);
            double longitude = cursor.getDouble(longitudeIndex);
            String site = cursor.getString(siteIndex);
            String detail = cursor.getString(detailIndex);
            list.add(new Place(id, name, detail, latitude, longitude, site));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }
}