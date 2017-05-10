package com.smith.joshua.chiropro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Question3Activity extends AppCompatActivity {

    Spinner spinner3;
    ArrayAdapter<CharSequence> adapter3;
    public final static String MESSAGE_KEYN = "com.smith.joshua.chiropro.message_keyn";
    public final static String MESSAGE_KEY1 = "com.smith.joshua.chiropro.message_key1";
    public final static String MESSAGE_KEY2 = "com.smith.joshua.chiropro.message_key2";
    public final static String MESSAGE_KEY3 = "com.smith.joshua.chiropro.message_key3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        spinner3 = (Spinner)findViewById(R.id.spinner3);
        adapter3 = ArrayAdapter.createFromResource(this,R.array.intensity,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+" selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    public void buttonOnClick(View v) {
        Button button = (Button) v;
        Intent i = getIntent();

        String message;
        if(spinner3.getSelectedItemPosition() == 0)
        {
            message = "1";
        }
        else if(spinner3.getSelectedItemPosition() == 1)
        {
            message = "2";
        }
        else if(spinner3.getSelectedItemPosition() == 2)
        {
            message = "3";
        }
        else if(spinner3.getSelectedItemPosition() == 3)
        {
            message = "4";
        }
        else if(spinner3.getSelectedItemPosition() == 4)
        {
            message = "5";
        }
        else if(spinner3.getSelectedItemPosition() == 5)
        {
            message = "6";
        }
        else if(spinner3.getSelectedItemPosition() == 6)
        {
            message = "7";
        }
        else if(spinner3.getSelectedItemPosition() == 7)
        {
            message = "8";
        }
        else if(spinner3.getSelectedItemPosition() == 8)
        {
            message = "9";
        }
        else
        {
            message = "10";
        }

        String messageN = i.getStringExtra(MESSAGE_KEYN);
        String message1 = i.getStringExtra(MESSAGE_KEY1);
        String message2 = i.getStringExtra(MESSAGE_KEY2);

        Intent i3 = new Intent(getApplicationContext(), Question4Activity.class);
        i3.putExtra(MESSAGE_KEYN, messageN);
        i3.putExtra(MESSAGE_KEY1, message1);
        i3.putExtra(MESSAGE_KEY2, message2);
        i3.putExtra(MESSAGE_KEY3, message);
        startActivity(i3);
    }
}
