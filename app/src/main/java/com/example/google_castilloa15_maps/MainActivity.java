package com.example.google_castilloa15_maps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button enableDir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //links the xml button to the java
        enableDir = findViewById(R.id.button);

        //creates a listener which performs an action when the user clicks the button
        enableDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //The intent opens Google maps and guides the user from their current location to MSU
                Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Montclair+State+University"));
                map.setPackage("com.google.android.apps.maps");
                startActivity(map);
            }
        });
    }
}
