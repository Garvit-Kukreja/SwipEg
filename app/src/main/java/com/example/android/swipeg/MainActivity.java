package com.example.android.swipeg;


import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView centerList;
    SwipeHelper swipeHelper = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        centerList = (RecyclerView) findViewById(R.id.centerList);
        centerList.setLayoutManager(new LinearLayoutManager(this));
        String[] Centers = {"Center 1", "Center 2", "Center 3", "Center 4", "Center 5", "Center 6",
                "Center 7", "Center 8", "Center 9", "Center 10", "Center 11", "Center 12",};
        centerList.setAdapter(new CenterAdapter(Centers));
        setupRecyclerView();
    }

    private void setupRecyclerView() {

        SwipeHelper swipeHelper = new SwipeHelper(this, centerList) {
            @Override
            public void instantiateUnderlayButton(RecyclerView.ViewHolder viewHolder, List<UnderlayButton> underlayButtons) {
                underlayButtons.add(new SwipeHelper.UnderlayButton(
                        "Undo",
                        0,
                        Color.parseColor("#C7C7CB"),
                        new SwipeHelper.UnderlayButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(MainActivity.this, "UNDO", Toast.LENGTH_SHORT).show();

                            }
                        }
                ));

                underlayButtons.add(new SwipeHelper.UnderlayButton(
                        "End",
                        0,
                        Color.parseColor("#FF3C30"),
                        new SwipeHelper.UnderlayButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(MainActivity.this, "END", Toast.LENGTH_SHORT).show();

                            }
                        }
                ));
                underlayButtons.add(new SwipeHelper.UnderlayButton(
                        "Start",
                        0,
                        Color.parseColor("#5ec639"),
                        new SwipeHelper.UnderlayButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(MainActivity.this, "START", Toast.LENGTH_SHORT).show();

                            }
                        }
                ));
            }
        };
    }
}








