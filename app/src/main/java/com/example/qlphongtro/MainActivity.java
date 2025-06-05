package com.example.qlphongtro;

import android.annotation.SuppressLint;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationview;

    @SuppressLint({"NonConstantResourceId", "CutPasteId", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationview = findViewById(R.id.bottom_nav);
        navigationview.setItemActiveIndicatorEnabled(false);
        NavHostFragment navHostFragment = (NavHostFragment)
                getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        navigationview.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.navigation_timkiem) {
                navController.navigate(R.id.navigation_timkiem);
                return true;
            } else if (item.getItemId() == R.id.navigation_luutin) {
                navController.navigate(R.id.navigation_luutin);
                return true;
            } else if (item.getItemId() == R.id.navigation_taikhoan_timkiem) {
                navController.navigate(R.id.navigation_taikhoan_timkiem);
                return true;
            } //else if (item.getItemId() == R.id.navigation_khachhang) {
//                navController.navigate(R.id.navigation_khachhang);
//                return true;
//            } else if (item.getItemId() == R.id.navigation_taikhoan) {
//                navController.navigate(R.id.navigation_taikhoan);
//                return true;
//            } else navController.navigate(R.id.navigation_tongquan);
            return false;
        });
    }
}