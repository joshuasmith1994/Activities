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

public class Question2Activity extends AppCompatActivity {

    Spinner spinner2;
    ArrayAdapter<CharSequence> adapter2;
    public final static String MESSAGE_KEYN = "com.smith.joshua.chiropro.message_keyn";
    public final static String MESSAGE_KEY1 = "com.smith.joshua.chiropro.message_key1";
    public final static String MESSAGE_KEY2 = "com.smith.joshua.chiropro.message_key2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        adapter2 = ArrayAdapter.createFromResource(this,R.array.sensation,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
        if(spinner2.getSelectedItemPosition() == 0)
        {
            message = "Numbness";
        }
        else if(spinner2.getSelectedItemPosition() == 1)
        {
            message = "SharpShootingPain";
        }
        else if(spinner2.getSelectedItemPosition() == 2)
        {
            message = "Spasms";
        }
        else if(spinner2.getSelectedItemPosition() == 3)
        {
            message =  "Tenderness";
        }
        else
        {
            message = "Tingling";
        }

        String messageN = i.getStringExtra(MESSAGE_KEYN);
        String message1 = i.getStringExtra(MESSAGE_KEY1);

        Intent i2 = new Intent(getApplicationContext(), Question3Activity.class);
        i2.putExtra(MESSAGE_KEYN, messageN);
        i2.putExtra(MESSAGE_KEY1, message1);
        i2.putExtra(MESSAGE_KEY2, message);
        startActivity(i2);
    }
}
