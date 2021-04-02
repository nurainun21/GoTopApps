package com.lthn.gotopapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sekolah extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listSekolah = new String[] {"SD NEGERI 80 PEKANBARU", "SD NEGERI 95 PEKANBARU", "SMP NEGERI 8 PEKANBARU",
        "SMP NEGERI 1 PEKANBARU","SMA NEGERI 4 PEKANBARU", "SMA DARMA YUDHA"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, listSekolah));
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
            if (pilihan.equals("SD NEGERI 80 PEKANBARU")) {
                a = new Intent(this, sdn80Pekanbaru.class);
            } else if (pilihan.equals("SD NEGERI 95 PEKANBARU")) {
                a = new Intent(this, sdn95Pekanbaru.class);
            } else if (pilihan.equals("SMP NEGERI 8 PEKANBARU")) {
                a = new Intent(this, smpn8Pekanbaru.class);
            } else if (pilihan.equals("SMP NEGERI 1 PEKANBARU")) {
                a = new Intent(this, smpn1Pekanbaru.class);
            } else if (pilihan.equals("SMA NEGERI 4 PEKANBARU")) {
                a = new Intent(this, sman4Pekanbaru.class);
            } else if (pilihan.equals("SMA DARMA YUDHA")) {
                a = new Intent(this, smaDarmaYudha.class);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
