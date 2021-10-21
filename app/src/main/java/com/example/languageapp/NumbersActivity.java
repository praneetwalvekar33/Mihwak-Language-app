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
        words.add(new Words("lutti","One", R.drawable.number_one));
        words.add(new Words("otiiko","Two", R.drawable.number_two));
        words.add(new Words("tolookosu","Three", R.drawable.number_three));
        words.add(new Words("oyyisa","Four", R.drawable.number_four));
        words.add(new Words("massokka","Five", R.drawable.number_five));
        words.add(new Words("temmokka","Six", R.drawable.number_six));
        words.add(new Words("kenekaku","Seven", R.drawable.number_seven));
        words.add(new Words("kawinta","Eight", R.drawable.number_eight));
        words.add(new Words("wo'e","Nine", R.drawable.number_nine));
        words.add(new Words("na'aacha","Ten", R.drawable.number_ten));


        //ArrayAdapter created to control the data source words
        WordsAdapter itemsAdapter = new WordsAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        }

}