package com.example.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_lists);
        /**
         * ArrayList created to add object of class Words
         */
        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("weṭeṭṭi","red", R.drawable.color_red));
        words.add(new Words("chokokki","green", R.drawable.color_green));
        words.add(new Words("ṭakaakki","brown", R.drawable.color_brown));
        words.add(new Words("ṭopoppi","gray", R.drawable.color_gray));
        words.add(new Words("kululli","black", R.drawable.color_black));
        words.add(new Words("kelelli","white", R.drawable.color_white));
        words.add(new Words("ṭopiisә","dusty yellow", R.drawable.color_dusty_yellow));
        words.add(new Words("chiwiiṭә","mustard yellow", R.drawable.color_mustard_yellow));



        //ArrayAdapter created to control the data source words
        WordsAdapter itemsAdapter = new WordsAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}