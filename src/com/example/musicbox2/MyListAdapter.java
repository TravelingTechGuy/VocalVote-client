package com.example.musicbox2;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {

	private Activity activity;
	private ArrayList<Song> songs;
	private static LayoutInflater inflater = null;

	public MyListAdapter(Activity a, ArrayList<Song> songs) {
		activity = a;
		this.songs = songs;
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public int getCount() {
		return songs.size();
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_item, null);

        TextView text=(TextView)vi.findViewById(R.id.textView_listitem_details);
        text.setText(songs.get(position).getTitle());
        
        ImageView imageView = (ImageView)vi.findViewById(R.id.imageView_listitem);
        imageView.setImageResource(songs.get(position).getImageResource());
        
        return vi;
    }
}