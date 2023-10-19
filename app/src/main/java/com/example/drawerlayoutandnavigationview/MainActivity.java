package com.example.drawerlayoutandnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.drawerlayoutandnavigationview.Fragments.CallFragment;
import com.example.drawerlayoutandnavigationview.Fragments.ChatFragment;
import com.example.drawerlayoutandnavigationview.Fragments.StatusFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    BottomNavigationView bottomNav;

    /*
    activity_main.xml...DrawerLayout...Toolbar And NavigationView

    New Layout Resource---File my_header.xml   \\Header:-Gmail Logo And Gmail Text (Gmail Application)

    res---Android Resource Directory---menu---New---Menu Resource File---my_menu.xml   \\Menu:-Allinboxes,Primary,Social,...,Help (Gmail Application)

    NavigationView In my_header.xml And my_menu.xml File Are Declare
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        toolbar = findViewById(R.id.toolBar);
        navigationView = findViewById(R.id.navigationView);
        bottomNav = findViewById(R.id.bottomNav);

        //Navigation Syntax
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.open,R.string.close);
        actionBarDrawerToggle.syncState();

        //Fragment Syntax
        getSupportFragmentManager().beginTransaction().replace(R.id.showFrag,new ChatFragment()).commit();


        /*
        Button btn;

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });
         */

        bottomNav.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.chat){
                    getSupportFragmentManager().beginTransaction().replace(R.id.showFrag,new ChatFragment()).commit();
                }
                else if(item.getItemId()==R.id.status){
                    getSupportFragmentManager().beginTransaction().replace(R.id.showFrag,new StatusFragment()).commit();

                }
                else if(item.getItemId()==R.id.call){
                    getSupportFragmentManager().beginTransaction().replace(R.id.showFrag,new CallFragment()).commit();

                }
                return true;
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.chat){
                    getSupportFragmentManager().beginTransaction().replace(R.id.showFrag,new ChatFragment()).commit();
                }
               else if(item.getItemId()==R.id.status){
                    getSupportFragmentManager().beginTransaction().replace(R.id.showFrag,new StatusFragment()).commit();

                }
                else if(item.getItemId()==R.id.call){
                    getSupportFragmentManager().beginTransaction().replace(R.id.showFrag,new CallFragment()).commit();

                }

              drawerLayout.closeDrawers();  //closeDrawers()

                return false;
            }
        });


    }
}