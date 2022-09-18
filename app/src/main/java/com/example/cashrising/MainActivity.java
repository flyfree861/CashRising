package com.example.cashrising;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity
{
    BottomNavigationView bottomNavigationMenuView;
    HomeFragment homeFragment = new HomeFragment();
    MoneyFragment moneyFragment = new MoneyFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationMenuView = findViewById( R.id.bottom_navigation_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, homeFragment).commit();

        bottomNavigationMenuView.setOnItemSelectedListener(item -> {
            switch (item.getItemId())
            {
                case R.id.item_home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, homeFragment).commit();
                    return true;

                case R.id.item_money:
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, moneyFragment).commit();
                    return true;

                case R.id.item_setting:
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, settingsFragment).commit();
                    return true;
            }

            return false;
        });
    }


}