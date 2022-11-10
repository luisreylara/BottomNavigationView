package com.example.mi_bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar1; //androidx.appcompat.widget.Toolbar;

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar1=findViewById(R.id.toolbar1);
        bottomNavigationView = findViewById(R.id.bootomnavigationview1);
        toolbar1.setTitle("Fragment 1 Active");
        setSupportActionBar(toolbar1);
        getSupportFragmentManager().beginTransaction().add(R.id.frame1,
                new Fragment1()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()){
                            case R.id.menuFragmento1:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,
                                    new Fragment1()).commit();
                            toolbar1.setTitle("Fragment1 active");
                            return true;
                            case R.id.menuFragmento2:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,
                                    new Fragment2()).commit();
                                toolbar1.setTitle("Fragment2 active");
                                return true;
                            case R.id.menuFragmento3:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,
                                    new Fragment3()).commit();
                                toolbar1.setTitle("Fragment3 active");
                                return true;

                        }
                        return false;
                    }
                }
        );
    }
}