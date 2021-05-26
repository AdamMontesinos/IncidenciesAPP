package com.example.Incidence;

import androidx.appcompat.app.AppCompatActivity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.example.Incidence.db.IncidenciaBDHelper;

public class Menu extends AppCompatActivity {
    public IncidenciaBDHelper dbhelper;
    public SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        dbhelper=new IncidenciaBDHelper(getApplicationContext());
        db=dbhelper.getWritableDatabase();
    }
}