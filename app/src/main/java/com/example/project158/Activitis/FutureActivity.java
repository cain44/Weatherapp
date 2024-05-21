package com.example.project158.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.project158.Adapters.FutureAdapter;
import com.example.project158.Domains.FutureDomain;
import com.example.project158.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTommorow;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);

        setVariable();
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items = new ArrayList<>();
        items.add(new FutureDomain("Cmt", "storm", "Fırtınalı", 24, 12));
        items.add(new FutureDomain("Paz", "cloudy", "Bulutlu", 25, 16));
        items.add(new FutureDomain("Pzt", "windy", "Rüzgarlı", 29, 15));
        items.add(new FutureDomain("Sal", "cloudy_sunny", "Parçalı Bulutlu", 23, 15));
        items.add(new FutureDomain("Çar", "sunny", "Güneşli", 28, 11));
        items.add(new FutureDomain("Per", "rainy", "Yağmurlu", 23, 12));

        recyclerView = findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterTommorow = new FutureAdapter(items);
        recyclerView.setAdapter(adapterTommorow);
    }

    private void setVariable() {
        ConstraintLayout backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> startActivity(new Intent(FutureActivity.this, MainActivity.class)));
    }
}