package com.example.bluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";

    private ImageView menuBar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuBar = findViewById(R.id.menuBar);
        drawerLayout = findViewById(R.id.mainFrame);
        androidx.appcompat.widget.Toolbar toolBar = findViewById(R.id.toolBar);

        // 액션 바 변경
        setSupportActionBar(toolBar);

        menuBar.setOnClickListener(v -> {
            Log.d(TAG, "onClick: 클릭됨");
            drawerLayout.openDrawer(Gravity.LEFT);
        });
    }

    // 메인 메뉴 바 구성
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    // 메뉴 선택 시 액티비티 이동
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.bluetooth:
                Intent NewActivity = new Intent(getApplicationContext(), BluetoothActivity.class);
                startActivity(NewActivity);
                break;
        }
        return true;
    }
}
