package com.example.qlphongtro;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.example.qlphongtro.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationView;
    private NavController navController;
    private boolean isDangTinMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.bottom_nav);
        navigationView.setItemActiveIndicatorEnabled(false);

        NavHostFragment navHostFragment = (NavHostFragment)
                getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();

        // Khởi tạo với menu tìm kiếm
        navigationView.inflateMenu(R.menu.nav_taikhoantimkiem_menu);

        navigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (isDangTinMode) {
                // Xử lý menu đăng tin
                if (itemId == R.id.navigation_tongquan) {
                    navController.navigate(R.id.navigation_tongquan);
                    return true;
                } else if (itemId == R.id.navigation_tindang) {
                    navController.navigate(R.id.navigation_tindang);
                    return true;
                } else if (itemId == R.id.navigation_dangtinmoi) {
                    navController.navigate(R.id.navigation_dangtinmoi);
                    return true;
                } else if (itemId == R.id.navigation_khachhang) {
                    navController.navigate(R.id.navigation_khachhang);
                    return true;
                } else if (itemId == R.id.navigation_taikhoan_dangtin) {
                    navController.navigate(R.id.navigation_taikhoan_dangtin);
                    return true;
                }
            } else {
                // Xử lý menu tìm kiếm
                if (itemId == R.id.navigation_timkiem) {
                    navController.navigate(R.id.navigation_timkiem);
                    return true;
                } else if (itemId == R.id.navigation_luutin) {
                    navController.navigate(R.id.navigation_luutin);
                    return true;
                } else if (itemId == R.id.navigation_taikhoan_timkiem) {
                    navController.navigate(R.id.navigation_taikhoan_timkiem);
                    return true;
                }
            }
            return false;
        });
    }

    // Phương thức để chuyển đổi chế độ
    public void switchToDangTinMode() {
        isDangTinMode = true;
        navigationView.getMenu().clear(); // Xóa menu cũ
        navigationView.inflateMenu(R.menu.nav_taikhoandangtin_menu); // Nạp menu đăng tin
        navController.navigate(R.id.navigation_main_dangtin);
    }

    public void switchToTimKiemMode() {
        isDangTinMode = false;
        navigationView.getMenu().clear(); // Xóa menu cũ
        navigationView.inflateMenu(R.menu.nav_taikhoantimkiem_menu); // Nạp menu tìm kiếm
        navController.navigate(R.id.navigation_timkiem);
    }
}