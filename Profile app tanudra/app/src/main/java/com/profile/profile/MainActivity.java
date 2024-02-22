package com.profile.profile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText nameEdit;
    EditText ageEdit;
    EditText addressEdit;
    EditText nationalityEdit;
    TextView name;
    TextView age;
    TextView address;
    TextView nationality;
    TextView showNa;
    TextView showAg;
    TextView showAddress;
    TextView showNational;
    Button display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdit=findViewById(R.id.input);
        name=findViewById(R.id.Display);
        ageEdit=findViewById(R.id.ageinput);
        age=findViewById(R.id.age);
        addressEdit=findViewById(R.id.adresInput);
        address=findViewById(R.id.address);
        nationalityEdit=findViewById(R.id.NatioInput);
        nationality=findViewById(R.id.natio);
        display=findViewById(R.id.displayBtn);
        showNa=findViewById(R.id.showName);
        showAg=findViewById(R.id.showAge);
        showAddress=findViewById(R.id.showAd);
        showNational=findViewById(R.id.showNatio);

        display.setOnClickListener(v -> {

            showNa.setText((nameEdit.getText().toString()));
            showAg.setText(ageEdit.getText().toString());
            showAddress.setText(addressEdit.getText().toString());
            showNational.setText(nationalityEdit.getText().toString());




        });
