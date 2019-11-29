package com.example.vmac.WatBot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.view.View;
import android.net.Uri;

public class Meet_the_team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_the_team);

        ImageView vivek = (ImageView)findViewById(R.id.imageView);
        vivek.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/vivek-kumar-950505148/"));
                startActivity(intent);
            }
        });

        ImageView adarsh = (ImageView)findViewById(R.id.imageView2);
        adarsh.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/adarsh-dwivedi-512001153/"));
                startActivity(intent);
            }
        });

        ImageView abhishek = (ImageView)findViewById(R.id.imageView3);
        abhishek.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/abhishek-saini-bab707157/"));
                startActivity(intent);
            }
        });

    }
}
