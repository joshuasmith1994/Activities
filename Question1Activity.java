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
import static com.smith.joshua.chiropro.R.array.body_parts;

public class Question1Activity extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    public final static String MESSAGE_KEYN = "com.smith.joshua.chiropro.message_keyn";
    public final static String MESSAGE_KEY1 = "com.smith.joshua.chiropro.message_key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, body_parts, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void buttonOnClick(View v) {
        Button button = (Button) v;

        String message;
        if(spinner.getSelectedItemPosition() == 0)
        {
            message = "Abdominals";
        }
        else if(spinner.getSelectedItemPosition() == 1)
        {
            message = "Biceps";
        }
        else if(spinner.getSelectedItemPosition() == 2)
        {
            message = "Buttocks";
        }
        else if(spinner.getSelectedItemPosition() == 3)
        {
            message = "Calf";
        }
        else if(spinner.getSelectedItemPosition() == 4)
        {
            message = "Deltoids";
        }
        else if(spinner.getSelectedItemPosition() == 5)
        {
            message = "Foot/Toe";
        }
        else if(spinner.getSelectedItemPosition() == 6)
        {
            message = "Forearm/Wrist";
        }
        else if(spinner.getSelectedItemPosition() == 7)
        {
            message = "Hamstring";
        }
        else if(spinner.getSelectedItemPosition() == 8)
        {
            message = "Hand";
        }
        else if(spinner.getSelectedItemPosition() == 9)
        {
            message = "Hip";
        }
        else if(spinner.getSelectedItemPosition() == 10)
        {
            message = "Neck";
        }
        else if(spinner.getSelectedItemPosition() == 11)
        {
            message = "Quadriceps";
        }
        else if(spinner.getSelectedItemPosition() == 12)
        {
            message = "Shin";
        }
        else if(spinner.getSelectedItemPosition() == 13)
        {
            message = "Trapezius";
        }
        else if(spinner.getSelectedItemPosition() == 14)
        {
            message = "Triceps";
        }
        else
        {
            message = "Trunk";
        }

        Intent i = getIntent();
        String messageN = i.getStringExtra(MESSAGE_KEYN);

        Intent i1 = new Intent(getApplicationContext(), Question2Activity.class);
        i1.putExtra(MESSAGE_KEYN, messageN);
        i1.putExtra(MESSAGE_KEY1, message);

        startActivity(i1);

    }

}
