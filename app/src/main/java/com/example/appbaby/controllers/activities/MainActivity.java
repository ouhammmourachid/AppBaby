package com.example.appbaby.controllers.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.example.appbaby.R;
import com.example.appbaby.controllers.adapter.AnimalsAdapter;
import com.example.appbaby.controllers.adapter.NumbersAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    @BindView(R.id.activity_main_tool_bar) Toolbar mToolbar;
    @BindView(R.id.activity_main_drawer_layout) DrawerLayout mDrawerLayout;
    @BindView(R.id.activity_main_nav_view) NavigationView mNavigationView;
    @BindView(R.id.activity_main_view_pager) ViewPager mViewPager;
    //@BindView(R.id.tab_layout) TabLayout tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // configuration functions.
        configureToolBar();
        configureDrawerLayout();
        configureNavigationView();
        configureViewPagerAndTabs();
    }
    private void configureNavigationView() {
        mNavigationView.setNavigationItemSelectedListener(this);
    }
    private void configureDrawerLayout() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                mDrawerLayout,
                mToolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }
    private void configureToolBar() {
        setSupportActionBar(mToolbar);
    }
    private void configureViewPagerAndTabs(){
        //tabs.setupWithViewPager(mViewPager);
        //tabs.setTabMode(TabLayout.MODE_FIXED);
    }
    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.activity_main_drawer_animals:
                mViewPager.setAdapter(new AnimalsAdapter(getSupportFragmentManager()));
                break;
            case R.id.activity_main_drawer_numbers:
                mViewPager.setAdapter(new NumbersAdapter(getSupportFragmentManager()));
                break;
            default:
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}