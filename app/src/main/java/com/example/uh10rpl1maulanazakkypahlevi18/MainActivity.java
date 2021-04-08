package com.example.uh10rpl1maulanazakkypahlevi18;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private datamenuadapter adapter;
    private ArrayList<datamenu> Menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.data);
        addData();
        adapter = new datamenuadapter(Menu);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        Menu = new ArrayList<>();
        Menu.add(new datamenu("Zakky Pahlevi", "15", "Nonton Anime","Miku"));
        Menu.add(new datamenu("Zakky Ganteng", "15", "Makan Mie", "Rias" ));
        Menu.add(new datamenu("Zakky Pintar", "15", "Rebahan", "Akano" ));
        Menu.add (new datamenu("Zakky Baik", "15" , "Main Game", "Itsuki"));
    }
}