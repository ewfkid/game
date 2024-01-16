package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.game.service.GameView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }
}