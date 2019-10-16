package com.example.lesson42simplelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String[] names = {"Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
            "Костя", "Игорь", "Анна", "Денис", "Андрей"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // находим список
        ListView listView = findViewById(R.id.lvMain);
        // создаем адаптер
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.my_list_item, names);
        // присваиваем адаптер списку
        listView.setAdapter(arrayAdapter);
    }
}
