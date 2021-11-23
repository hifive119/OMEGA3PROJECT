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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar toolBar = findViewById(R.id.toolBar);

        // 액션 바 변경
        setSupportActionBar(toolBar);
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
            case R.id.menuBluetooth:
                Intent NewActivity1 = new Intent(getApplicationContext(), BluetoothActivity.class);
                startActivity(NewActivity1);
                break;

            case R.id.menuAlram:
                Intent NewActivity2 = new Intent(getApplicationContext(), AlarmActivity.class);
                startActivity(NewActivity2);
                break;

            case R.id.menuDatasheet:
                Intent NewActivity3 = new Intent(getApplicationContext(), DatasheetActivity.class);
                startActivity(NewActivity3);
                break;
        }
        return true;
    }
}
