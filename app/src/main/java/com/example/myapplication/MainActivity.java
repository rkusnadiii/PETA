package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
<<<<<<< HEAD
            Fragment f;
=======
            Fragment f ;
>>>>>>> doi-brance
            int id = item.getItemId();
            if (id == R.id.menu_home){
                f = new HomeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,f).commit();
                return true;
            }else  if (id == R.id.menu_favorite){
                f = new FavoriteFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,f).commit();
                return true;
            }else if (id == R.id.menu_profile){
                f = new ProfileFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,f).commit();
                return true;
            }
            return true;
        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}