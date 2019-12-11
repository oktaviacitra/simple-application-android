package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myrecyclerview.model.Place;
import com.example.myrecyclerview.model.PlacesData;

import de.hdodenhof.circleimageview.CircleImageView;

public class Detail extends AppCompatActivity {
    int id;
    TextView description;
    CircleImageView photo;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        id = getIntent().getIntExtra("ID", 0);
        description = (TextView) findViewById(R.id.description);
        photo = (CircleImageView) findViewById(R.id.photo_detail);
        title = (TextView) findViewById(R.id.title_name);
        PlacesData placesData = new PlacesData();
        Place place = placesData.getData(id);
        title.setText(place.getName());
        description.setText(place.getDetail());
        photo.setImageResource(place.getPhoto());
    }
}
