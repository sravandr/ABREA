package com.sravan.abrea;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    //variables
    private ArrayList<String> mPhotoPath = new ArrayList<>();
    private ArrayList<String> mMemberName= new ArrayList<>();
    private ArrayList<String> mPhoneNumber= new ArrayList<>();
    private ArrayList<String> mWhatsappNumber= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPhotos();
    }

    private void initPhotos(){
        Log.d(TAG, "initPhotos: Started");
        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");


        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        mPhotoPath.add("http://opendata.toronto.ca/transportation/tmc/rescucameraimages/CameraImages/loc8015.jpg");
        mMemberName.add("Sivappa");
        mPhoneNumber.add("9448844084");
        mWhatsappNumber.add("9448844084");

        initRecyclerView();
    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: Entered");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mPhotoPath,mMemberName,mPhoneNumber,mWhatsappNumber,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
