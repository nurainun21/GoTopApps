package com.lthn.gotopapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Grocery extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listGrocery = new String[] {"Hypermart Mal SKA", "Daily Mart-Supermarket Store", "Planet Swalayan Marpoyan",
                "Hawaii Swalayan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listGrocery));
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Hypermart Mal SKA")) {
                a = new Intent(this, HypermartMalSKA.class);
            } else if (pilihan.equals("Daily Mart-Supermarket Store")) {
                a = new Intent(this, DailyMart.class);
            } else if (pilihan.equals("Planet Swalayan Marpoyan")) {
                a = new Intent(this, PlanetSwalayanMarpoyan.class);
            } else if (pilihan.equals("Hawaii Swalayan")) {
                a = new Intent(this, HawaiiSwalayan.class);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
