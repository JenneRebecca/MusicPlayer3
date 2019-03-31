package android.example.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {

    public SongAdapter(Context context, ArrayList pWords) {
        super(context,0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song my_word = (Song) getItem(position);
        TextView songTextView = listItemView.findViewById(R.id.song);
        songTextView.setText(my_word.getSongTitle());
        TextView artistTextView = listItemView.findViewById(R.id.artist);
        artistTextView.setText(my_word.getArtist());

        return listItemView;

    }
}