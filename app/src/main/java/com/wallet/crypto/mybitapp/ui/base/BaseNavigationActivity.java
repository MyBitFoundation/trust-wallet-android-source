package com.wallet.crypto.mybitapp.ui.base;

import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.ActionBar;
import android.view.MenuItem;

import com.wallet.crypto.mybitapp.R;

public abstract class BaseNavigationActivity<T extends NoInternetConnectionBaseViewModel> extends NoInternetConnectionBaseActivity<T>
        implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView navigation;

    protected void initBottomNavigation() {
        navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    protected void setBottomMenu(@MenuRes int menuRes) {
        navigation.getMenu().clear();
        navigation.inflateMenu(menuRes);
    }

    public void setTitles(String title, String subTitle, BaseNavigationFragment fragment) {
        setTitle(title);
        setSubtitle(subTitle);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}