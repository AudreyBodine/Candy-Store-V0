package com.example.candystorev0;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.action_add:
                Log.w("MainActivity", "Add Selected");
                return true;
            case R.id.action_delete:
                Log.w("MainActivity", "Delete Selected");
                return true;
            case R.id.action_update:
                Log.w("MainActivity", "Update Selected");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}