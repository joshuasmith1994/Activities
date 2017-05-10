package com.smith.joshua.chiropro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IntroductionActivity extends AppCompatActivity {

    public final static String MESSAGE_KEYN = "com.smith.joshua.chiropro.message_keyn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Intent i = getIntent();
        TextView textView = (TextView)findViewById(R.id.textView8);
        String message1 = "Greetings, " + i.getStringExtra(MESSAGE_KEYN) + "!";

        textView.setText(message1);

        //setContentView(textView);
        //setContentView(textView2);
    }

    public void buttonOnClick(View view)
    {
        Button button = (Button) view;

        Intent i = getIntent();
        String messageN = i.getStringExtra(MESSAGE_KEYN);

        Intent iN = new Intent(getApplicationContext(), Question1Activity.class);
        iN.putExtra(MESSAGE_KEYN, messageN);
        startActivity(iN);
    }
}
