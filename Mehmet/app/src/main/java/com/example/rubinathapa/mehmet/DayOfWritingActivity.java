package com.example.rubinathapa.mehmet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Rubina Thapa on 4/24/2018.
 */

public class DayOfWritingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
       // this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemid=item.getItemId();
        if(itemid==android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }*/
}
