package com.example.rubinathapa.mehmet;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
/*@BindView(R.id.Activity_main_mehmet_imageview)
    ImageView mehmetImageView;*/
@BindView(R.id.activity_main_name_textview)
    TextView mehmetNameTextView;
@BindView(R.id.activity_main_position_textview)
TextView positionTextView;
@BindView(R.id.activity_main_dayofwriting_button)
    Button dayofwritingButton;
@BindView(R.id.activity_main_allpost_button)
Button allpostButton;
@BindView(R.id.activity_main_abouttheauthor_button)
Button abouttheauthorButton;
@BindView(R.id.activity_main_contactus_button)
Button contactusButton;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        dayofwritingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context=getApplicationContext();
                Intent intent=new Intent(context ,DayOfWritingActivity.class);
                context.startActivity(intent);
            }
        });
        allpostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context=getApplicationContext();
                Intent intent=new Intent(context,AllPostActivity.class);
                context.startActivity(intent);
            }
        });

    }


}
