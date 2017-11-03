package com.example.milan.milanscholten_pset1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainPotato extends AppCompatActivity {

    public ImageView body;
    public ImageView arms;
    public ImageView ears;
    public ImageView eyebrows;
    public ImageView eyes;
    public ImageView glasses;
    public ImageView hat;
    public ImageView mouth;
    public ImageView mustache;
    public ImageView nose;
    public ImageView shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_potato);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CheckBox CBarms = (CheckBox) findViewById(R.id.CBarms);
        CheckBox CBears = (CheckBox) findViewById(R.id.CBears);
        CheckBox CBeyebrow = (CheckBox) findViewById(R.id.CBeyebrow);
        CheckBox CBeyes = (CheckBox) findViewById(R.id.CBeyes);
        CheckBox CBglasses = (CheckBox) findViewById(R.id.CBglasses);
        CheckBox CBhat = (CheckBox) findViewById(R.id.CBhat);
        CheckBox CBmouth = (CheckBox) findViewById(R.id.CBmouth);
        CheckBox CBmustache = (CheckBox) findViewById(R.id.CBmustache);
        CheckBox CBnose = (CheckBox) findViewById(R.id.CBnose);
        CheckBox CBhoes = (CheckBox) findViewById(R.id.CBshoes);

        body =  findViewById(R.id.Body);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mouth = findViewById(R.id.mouth);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("arms", arms.getVisibility());
        outState.putInt("ears", ears.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("mustache", mustache.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        int Visibility = inState.getInt("arms");
        arms.setVisibility(Visibility);
        Visibility = inState.getInt("ears");
        ears.setVisibility(Visibility);
        Visibility = inState.getInt("eyebrows");
        eyebrows.setVisibility(Visibility);
        Visibility = inState.getInt("eyes");
        eyes.setVisibility(Visibility);
        Visibility = inState.getInt("glasses");
        glasses.setVisibility(Visibility);
        Visibility = inState.getInt("hat");
        hat.setVisibility(Visibility);
        Visibility = inState.getInt("mouth");
        mouth.setVisibility(Visibility);
        Visibility = inState.getInt("mustache");
        mustache.setVisibility(Visibility);
        Visibility = inState.getInt("nose");
        nose.setVisibility(Visibility);
        Visibility = inState.getInt("shoes");
        shoes.setVisibility(Visibility);
    }

    public void Clicked(View v) {
            // Is the view now checked?
            boolean checked = ((CheckBox) v).isChecked();

            // Check which checkbox was checked
            switch(v.getId()) {
                case R.id.CBarms:
                    if (checked) {
                        arms.setVisibility(View.VISIBLE);
                    }
                    else {
                        arms.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBears:
                    if (checked) {
                        ears.setVisibility(View.VISIBLE);
                    }
                    else {
                        ears.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBeyebrow:
                    if (checked) {
                        eyebrows.setVisibility(View.VISIBLE);
                    }
                    else {
                        eyebrows.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBeyes:
                    if (checked) {
                        eyes.setVisibility(View.VISIBLE);
                    }
                    else {
                        eyes.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBglasses:
                    if (checked) {
                        glasses.setVisibility(View.VISIBLE);
                    }
                    else {
                        glasses.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBhat:
                    if (checked) {
                        hat.setVisibility(View.VISIBLE);
                    }
                    else {
                        hat.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBmouth:
                    if (checked) {
                        mouth.setVisibility(View.VISIBLE);
                    }
                    else {
                        mouth.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBmustache:
                    if (checked) {
                        mustache.setVisibility(View.VISIBLE);
                    }
                    else {
                        mustache.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBnose:
                    if (checked) {
                        nose.setVisibility(View.VISIBLE);
                    }
                    else {
                        nose.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.CBshoes:
                    if (checked) {
                        shoes.setVisibility(View.VISIBLE);
                    }
                    else {
                        shoes.setVisibility(View.INVISIBLE);
                    }
                    break;
        }
    }
}

