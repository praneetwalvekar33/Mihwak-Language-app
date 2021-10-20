package com.example.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_lists);
        /**
         * ArrayList created to add object of class Words
         */
        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("әpә","father"));
        words.add(new Words("әṭa","mother"));
        words.add(new Words("angsi","son"));
        words.add(new Words("tune","daughter"));
        words.add(new Words("taachi","older brother"));
        words.add(new Words("chalitti","younger brother"));
        words.add(new Words("teṭe","older sister"));
        words.add(new Words("kolliti","younger sister"));
        words.add(new Words("ama","grandmother"));
        words.add(new Words("paapa","grandfather"));


        //ArrayAdapter created to control the data source words
        WordsAdapter itemsAdapter = new WordsAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}