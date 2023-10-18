package com.example.drawerlayoutandnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

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

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.open,R.string.close);
        actionBarDrawerToggle.syncState();

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

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.username){
                    Toast.makeText(MainActivity.this, "Username", Toast.LENGTH_SHORT).show();
                }
               else if(item.getItemId()==R.id.password){
                    Toast.makeText(MainActivity.this, "Password", Toast.LENGTH_SHORT).show();

                }
                else if(item.getItemId()==R.id.number){
                    Toast.makeText(MainActivity.this, "Number", Toast.LENGTH_SHORT).show();

                }
                else if(item.getItemId()==R.id.address){
                    Toast.makeText(MainActivity.this, "Address", Toast.LENGTH_SHORT).show();

                }
                else if(item.getItemId()==R.id.city){
                    Toast.makeText(MainActivity.this, "City", Toast.LENGTH_SHORT).show();

                }
                else if(item.getItemId()==R.id.pin){
                    Toast.makeText(MainActivity.this, "Pin", Toast.LENGTH_SHORT).show();

                }
                else if(item.getItemId()==R.id.state){
                    Toast.makeText(MainActivity.this, "State", Toast.LENGTH_SHORT).show();

                }
                drawerLayout.closeDrawers();  //closeDrawers()


                return false;
            }
        });


    }
}