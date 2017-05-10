package com.smith.joshua.chiropro;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class VisualActivity extends AppCompatActivity {

    public final static String MESSAGE_KEYN = "com.smith.joshua.chiropro.message_keyn";
    public final static String MESSAGE_KEYS = "com.smith.joshua.chiropro.message_keys";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual);

        Intent i = getIntent();

        String messageN = i.getStringExtra(MESSAGE_KEYN);

        ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);

        String messageS = i.getStringExtra(MESSAGE_KEYS);

        if(messageS.equals("c1c3"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.c1c3);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("c4c3"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.c4c3);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("c4c5"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.c4c5);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("c5c6"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.c5c6);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("c6c7"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.c6c7);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("c7t1"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.c7t1);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("l1l5"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.l1l5);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("l4s1"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.l4s1);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("l5s3"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.l5s3);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("t1t7"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.t1t7);
            imageView1.setImageDrawable(drawable);
        }
        else if(messageS.equals("t7l1"))
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.t7l1);
            imageView1.setImageDrawable(drawable);
        }
        else
        {
            Resources res = getResources();
            Drawable drawable = res.getDrawable(R.drawable.spinal_column);
            imageView1.setImageDrawable(drawable);
        }

        i.putExtra(MESSAGE_KEYN, messageN);
    }

    public void buttonOnClick(View v) {
        Button button = (Button) v;
        Intent i = getIntent();
        String messageN = i.getStringExtra(MESSAGE_KEYN);

        Intent iV = new Intent(getApplicationContext(), ResultActivity.class);

        iV.putExtra(MESSAGE_KEYN, messageN);
        startActivity(iV);
    }
}
