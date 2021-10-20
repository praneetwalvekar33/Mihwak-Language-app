package com.example.languageapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Words> {

    /**
     * Custom Constructor (Does not mirror the parent constructor)
     * The context is used to inflate the layout file. The list is used as the date to populate
     * the ListView
     * @param context Current context used to inflate the layout file
     * @param words  A list Words object to display in the List
     */
    public WordsAdapter(Activity context, ArrayList<Words> words){
        //  Here we initialize the ArrayAdapter internal storage for context and list
        //  Second argument is used when the ArrayAdapter is populating single TextView
        //  Because this is a custom adapter for two TextViews  the adapter is not
        //  going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    /**
     * Provide a view for an AdapterView
     * @param position      Position in the list of data that should be displayed by ListView
     * @param convertView  The recycle view to populate
     * @param parent        The parent ViewGroup used for Inflation
     * @return              The view for position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        //  Get the Words object located in this position in the ArrayList
        Words currentWord = getItem(position);

        //  Find the TextView in the list_item.xml layout with version id name for Miwok Word
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        //  Set the set text in the TextView for miwok translation
        miwokTextView.setText(currentWord.getMiwokWord());

        //  Find the TextView in the list_item.xml layout with version id name for English Word
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_word);
        //  Set the set text in the TextView for english translation
        englishTextView.setText(currentWord.getEnglishWord());

        //  return the entire listItemView (Containing the 2 TextView to displayed on Listiew
        return listItemView;
    }
}
