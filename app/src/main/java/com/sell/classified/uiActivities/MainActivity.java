package com.sell.classified.uiActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.sell.classified.R;
import com.sell.classified.helper.SortBottomSheetDialog;
import com.sell.classified.model.Chat;
import com.sell.classified.ui.ChatFragment;
import com.sell.classified.ui.ChooseCategoryFragment;
import com.sell.classified.ui.ProfileFragment;
import com.sell.classified.ui.SearchFragment;
import com.sell.classified.ui.gallery.GalleryFragment;
import com.sell.classified.ui.home.HomeFragment;
import com.sell.classified.ui.slideshow.SlideshowFragment;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements SortBottomSheetDialog.BottomSheetListener {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new ChooseCategoryFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
            }
        });

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.nav_bottom_home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.nav_bottom_profile:
                        selectedFragment = new ProfileFragment();
                        break;
                    case R.id.nav_bottom_search:
                        selectedFragment = new SearchFragment();
                        break;
                    case R.id.nav_bottom_messages:
                        selectedFragment = new ChatFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,
                        selectedFragment).commit();
                return true;
            }
        });



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                Fragment fragment = null;

                switch (id){
                    case R.id.nav_home:
                        fragment=new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,fragment).commit();
                        break;
                    case R.id.nav_my_ads:
                        startActivity(new Intent(MainActivity.this,MyAdActivity.class));
                        break;
                    case R.id.nav_favorites:
                        startActivity(new Intent(MainActivity.this,FavoriteActivity.class));
                        break;
                    case R.id.nav_chat:
                        startActivity(new Intent(MainActivity.this, ChatActivity.class));
                        break;
                    case R.id.nav_notification:
                        startActivity(new Intent(MainActivity.this, NotificationActivity.class));
                        break;
                    case R.id.nav_blank_page:
                        startActivity(new Intent(MainActivity.this, BlankPageActivity.class));
                        break;
                    case R.id.nav_setting:
                        startActivity(new Intent(MainActivity.this, SettingActivity.class));
                        break;
                    case R.id.nav_pages:
                        startActivity(new Intent(MainActivity.this,PagesActivity.class));
                        break;
                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        menu.findItem(R.id.action_settings).setVisible(false);
        menu.findItem(R.id.action_filter).setVisible(false);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onButtonClicked(String text) {

    }
}