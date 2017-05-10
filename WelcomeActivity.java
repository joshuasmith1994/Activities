package com.smith.joshua.chiropro;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {

    public final static String MESSAGE_KEYN = "com.smith.joshua.chiropro.message_keyn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //getWindow().getDecorView().setBackgroundColor(Color.argb(20,10,50,200));

    }

    public void buttonOnClick(View v) {
        Button button = (Button) v;

        Intent i = new Intent(getApplicationContext(), IntroductionActivity.class);
        EditText message_text = (EditText)findViewById(R.id.editText);
        String messageN = message_text.getText().toString();
        i.putExtra(MESSAGE_KEYN, messageN);
        startActivity(i);
    }
}
