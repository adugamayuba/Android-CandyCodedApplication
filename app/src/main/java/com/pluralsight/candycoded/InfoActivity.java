package com.pluralsight.candycoded;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView)findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);


    }

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***

    public void createMapIntent(View view){

        Uri urilink = Uri.parse("geo:0,0?q=618 E South St 0rlando, FL 32801");
        Intent mmapIntent = new Intent(Intent.ACTION_VIEW, urilink);

        mmapIntent.setPackage("com.google.android.apps.maps");

        if(mmapIntent.resolveActivity(getPackageManager()) != null ){

            startActivity(mmapIntent);

        }
    }

    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***
}
