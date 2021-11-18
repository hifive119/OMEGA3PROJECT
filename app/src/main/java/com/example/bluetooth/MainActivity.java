package com.example.bluetooth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void settingSideNavBar() {
//        // 툴바 생성
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        // 사이드 메뉴를 오픈하기위한 아이콘 추가
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_dehaze_24);
//
//        // 사이드 네브바 구현
//        DrawerLayout drawLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//
//        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
//                MainActivity.this,
//                drawLayout,
//                toolbar,
//                R.string.open,
//                R.string.closed
//        );
//
//        // 사이드 네브바 클릭 리스너
//        drawLayout.addDrawerListener(actionBarDrawerToggle);
//
//        // -> 사이드 네브바 아이템 클릭 이벤트 설정
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//                int id = menuItem.getItemId();
//
//                if (id == R.id.menu_item1) {
//                    Toast.makeText(getApplicationContext(), "블루투스 메뉴", Toast.LENGTH_SHORT).show();
//                } else if (id == R.id.menu_item2) {
//                    Toast.makeText(getApplicationContext(), "알람 설정 메뉴", Toast.LENGTH_SHORT).show();
//                } else if (id == R.id.menu_item3) {
//                    Toast.makeText(getApplicationContext(), "약 복용 메뉴", Toast.LENGTH_SHORT).show();
//                }
//
//
//                DrawerLayout drawer = findViewById(R.id.drawer_layout);
//                drawer.closeDrawer(GravityCompat.START);
//                return true;
//            }
//        });
//
//    }
//
//
//    /***
//     *  -> 뒤로가기시, 사이드 네브바 닫는 기능
//     */
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
}
