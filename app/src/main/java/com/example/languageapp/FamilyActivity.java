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
        words.add(new Words("әpә","father", R.drawable.family_father));
        words.add(new Words("әṭa","mother", R.drawable.family_mother));
        words.add(new Words("angsi","son", R.drawable.family_son));
        words.add(new Words("tune","daughter", R.drawable.family_daughter));
        words.add(new Words("taachi","older brother", R.drawable.family_older_brother));
        words.add(new Words("chalitti","younger brother", R.drawable.family_younger_brother));
        words.add(new Words("teṭe","older sister", R.drawable.family_older_sister));
        words.add(new Words("kolliti","younger sister", R.drawable.family_younger_sister));
        words.add(new Words("ama","grandmother", R.drawable.family_grandmother));
        words.add(new Words("paapa","grandfather", R.drawable.family_grandfather));


        //ArrayAdapter created to control the data source words
        WordsAdapter itemsAdapter = new WordsAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}