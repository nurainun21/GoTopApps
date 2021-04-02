package com.lthn.gotopapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Polisi extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listPolisi = new String[] {"Polresta Pekanbaru", "Polda Pekanbaru", "Polsekta Pekanbaru",
                "Polsek Tenayan Raya","Polsek Tampan", "Polsek Rumbai Pesisir"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPolisi));
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
            if (pilihan.equals("Polresta Pekanbaru")) {
                a = new Intent(this, PolrestaPku.class);
            } else if (pilihan.equals("Polda Pekanbaru")) {
                a = new Intent(this, PoldaPku.class);
            } else if (pilihan.equals("Polsekta Pekanbaru")) {
                a = new Intent(this, PolsektaPku.class);
            } else if (pilihan.equals("Polsek Tenayan Raya")) {
                a = new Intent(this, PolsekTenayanRaya.class);
            } else if (pilihan.equals("Polsek Tampan")) {
                a = new Intent(this, PolsekTampan.class);
            } else if (pilihan.equals("Polsek Rumbai Pesisir")) {
                a = new Intent(this, PolsekRumbaiPesisir.class);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
