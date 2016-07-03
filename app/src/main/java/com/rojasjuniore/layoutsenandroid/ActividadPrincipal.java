package com.rojasjuniore.layoutsenandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActividadPrincipal extends AppCompatActivity implements View.OnClickListener {

    Button btngrip, btnlinear, btnFrame, btnTable, btnRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        btngrip = (Button) findViewById(R.id.btngrip);
        btngrip.setOnClickListener(this);
        btnlinear = (Button) findViewById(R.id.btnlinear);
        btnlinear.setOnClickListener(this);
        btnFrame = (Button) findViewById(R.id.btnFrame);
        btnFrame.setOnClickListener(this);
        btnTable = (Button) findViewById(R.id.btnTable);
        btnTable.setOnClickListener(this);
        btnRelative = (Button) findViewById(R.id.btnRelative);
        btnRelative.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btngrip) {
            Intent intent = new Intent(this, GribLayout.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnlinear) {
            Intent intent = new Intent(this, LinearLayout.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnFrame) {
            Intent intent = new Intent(this, FrameLayout.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnTable) {
            Intent intent = new Intent(this, TableLayout.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnRelative) {
            Intent intent = new Intent(this, RelativeLayout.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actividad_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_about) {
            Uri webpage = Uri.parse("http://rojasjuniore.ga/");
            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(webIntent);
        }

        return super.onOptionsItemSelected(item);
    }


}
