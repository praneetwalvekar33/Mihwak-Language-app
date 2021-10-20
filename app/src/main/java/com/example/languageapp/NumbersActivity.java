package com.example.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_lists);
        /**
         * ArrayList created to add object of class Words
         */
        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("lutti","One"));
        words.add(new Words("otiiko","Two"));
        words.add(new Words("tolookosu","Three"));
        words.add(new Words("oyyisa","Four"));
        words.add(new Words("massokka","Five"));
        words.add(new Words("temmokka","Six"));
        words.add(new Words("kenekaku","Seven"));
        words.add(new Words("kawinta","Eight"));
        words.add(new Words("wo'e","Nine"));
        words.add(new Words("na'aacha","Ten"));


        //ArrayAdapter created to control the data source words
        WordsAdapter itemsAdapter = new WordsAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        }

}