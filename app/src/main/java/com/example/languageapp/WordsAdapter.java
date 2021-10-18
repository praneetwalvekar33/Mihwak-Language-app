package com.example.languageapp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class WordsAdapter extends ArrayAdapter<Words> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView1, @Nullable View convertView2, @NonNull ViewGroup parent) {
        return super.getView(position, convertView1, convertView2, parent);
    }
}
