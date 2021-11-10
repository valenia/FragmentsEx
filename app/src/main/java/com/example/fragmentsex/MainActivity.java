package com.example.fragmentsex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boto1 = findViewById(R.id.newFragment);
        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO patata
                FragmentManager fm = getSupportFragmentManager();

                if(fm.findFragmentById(R.id.contenidor1)==null){   //OPCIONAL per check si esta buit
                    Fragment_1 fragment1 = new Fragment_1();
                    fm.beginTransaction().add(R.id.contenidor1,fragment1).commit();
                }
            }
        });

        Button boto2 = findViewById(R.id.replaceFragment);
        boto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm1 = getSupportFragmentManager();
                Fragment_red fragmentRed = new Fragment_red();
                fm1.beginTransaction().replace(R.id.contenidor1,fragmentRed).commit();
                //patata
            }
        });
    }


}