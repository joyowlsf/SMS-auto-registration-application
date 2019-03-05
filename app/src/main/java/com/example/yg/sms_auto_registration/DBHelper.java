package com.example.yg.sms_auto_registration;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    //DBHelper 생성자로 관리할 DB이름과 버전 정보를 받음
    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    //DB를 새로 생성할 때 호출되는 함수
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    //DB업그레이드를 위해 버전이 변경될 때 호출되는 함수
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
