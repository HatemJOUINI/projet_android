/*package com.teepstech.sqlitecrud;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper (Context context) {
        super(context, "login.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table user (Email text primary key, mot de passe text)");

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists user");
    }
    // inserting in database

    public boolean insert (String email, String mot de passe) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues ();
        contentValues.put("Email",Email);
        contentValues.put("mot de passe", mot de passe);
        long ins = db.insert("user", null , contentValues);
        if(ins==-1) return false ;
        else return true ;
    }
    // checking if email exists;
    public boolean chkemail (String Email) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql "Select * from user where Email=?", new String[]{Email});
        if (cursor.getCount()>0) return false;
        else return true;


    }
}
*/