package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myrecyclerview.database.DatabaseAccess;
import com.example.myrecyclerview.model.Place;
import com.example.myrecyclerview.model.PlacesData;

import de.hdodenhof.circleimageview.CircleImageView;

public class Detail extends AppCompatActivity {
    int id;
    TextView description;
    TextView title;
    Button site;
    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        id = getIntent().getIntExtra("ID", 0);
        description = (TextView) findViewById(R.id.detail);
        title = (TextView) findViewById(R.id.title);
        site = (Button) findViewById(R.id.site);
        map = (Button) findViewById(R.id.map);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        final Place place = databaseAccess.getQuotes().get(id);
        databaseAccess.close();
        title.setText(place.getName());
        description.setText(place.getDetail());
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, place.getSite());
                startActivity(intent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:"+ place.getLatitude() + "," + place.getLongitude() + "?q=" + place.getName());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}
