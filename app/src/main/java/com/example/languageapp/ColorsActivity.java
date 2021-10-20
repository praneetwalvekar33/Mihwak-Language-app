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
        words.add(new Words("weṭeṭṭi","red "));
        words.add(new Words("chokokki","green"));
        words.add(new Words("ṭakaakki","brown"));
        words.add(new Words("ṭopoppi","gray"));
        words.add(new Words("kululli","black"));
        words.add(new Words("kelelli","white"));
        words.add(new Words("ṭopiisә","dusty yellow"));
        words.add(new Words("chiwiiṭә","mustard yellow"));



        //ArrayAdapter created to control the data source words
        WordsAdapter itemsAdapter = new WordsAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}