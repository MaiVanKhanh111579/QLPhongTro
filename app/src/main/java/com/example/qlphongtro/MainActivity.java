package com.example.qlphongtro;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.example.qlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationView, bottomNav3Items, bottomNav5Items;

    private NavController navController;
    private boolean is3ItemsNavActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav3Items = findViewById(R.id.bottom_nav_view_3items);
        bottomNav5Items = findViewById(R.id.bottom_nav_view_5items);


        NavHostFragment navHostFragment = (NavHostFragment)
                getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();

        setupBottomNavigation();
    }
    private void setupBottomNavigation() {
        // Thiết lập điều hướng cho Bottom Navigation 3 items
        if (bottomNav3Items != null) {
            bottomNav3Items.setItemActiveIndicatorEnabled(false);
            bottomNav3Items.setOnItemSelectedListener(item -> {
                int itemId = item.getItemId();
                if (itemId == R.id.navigation_timkiem) {
                    navController.navigate(R.id.navigation_timkiem);
                } else if (itemId == R.id.navigation_luutin) {
                    navController.navigate(R.id.navigation_luutin);
                } else if (itemId == R.id.navigation_taikhoan_timkiem) {
                    navController.navigate(R.id.navigation_taikhoan_timkiem);
                }
                return true;
            });
        }

        // Thiết lập điều hướng cho Bottom Navigation 5 items
        if (bottomNav5Items != null) {
            bottomNav5Items.setItemActiveIndicatorEnabled(false);
            bottomNav5Items.setOnItemSelectedListener(item -> {
                int itemId = item.getItemId();
                if (itemId == R.id.navigation_tongquan) {
                    navController.navigate(R.id.navigation_tongquan);
                } else if (itemId == R.id.navigation_tindang) {
                    navController.navigate(R.id.navigation_tindang);
                } else if (itemId == R.id.navigation_dangtinmoi) {
                    navController.navigate(R.id.navigation_dangtinmoi);
                } else if (itemId == R.id.navigation_khachhang) {
                    navController.navigate(R.id.navigation_khachhang);
                } else if (itemId == R.id.navigation_taikhoan_dangtin) {
                    navController.navigate(R.id.navigation_taikhoan_dangtin);
                }
                return true;
            });
        }
    }
    // Phương thức để chuyển đổi chế độ
    public void switchTo5ItemsNavigation() {
        is3ItemsNavActive = false;
        bottomNav3Items.setVisibility(View.GONE);
        bottomNav5Items.setVisibility(View.VISIBLE);
        navController.setGraph(R.navigation.nav_graph_dangtin);
    }

    public void switchTo3ItemsNavigation() {
        is3ItemsNavActive = true;
        bottomNav3Items.setVisibility(View.VISIBLE);
        bottomNav5Items.setVisibility(View.GONE);
        navController.setGraph(R.navigation.nav_graph_timkiem);
    }
}
