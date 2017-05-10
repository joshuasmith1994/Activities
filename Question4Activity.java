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

public class Question4Activity extends AppCompatActivity {

    Spinner spinner4;
    ArrayAdapter<CharSequence> adapter4;
    public final static String MESSAGE_KEYN = "com.smith.joshua.chiropro.message_keyn";
    public final static String MESSAGE_KEY1 = "com.smith.joshua.chiropro.message_key1";
    public final static String MESSAGE_KEY2 = "com.smith.joshua.chiropro.message_key2";
    public final static String MESSAGE_KEY3 = "com.smith.joshua.chiropro.message_key3";
    public final static String MESSAGE_KEY4 = "com.smith.joshua.chiropro.message_key4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        spinner4 = (Spinner)findViewById(R.id.spinner4);
        adapter4 = ArrayAdapter.createFromResource(this,R.array.motion,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        String message4;
        if(spinner4.getSelectedItemPosition() == 0)
        {
            message4 = "Sporting";
        }
        else if(spinner4.getSelectedItemPosition() == 1)
        {
            message4 = "HunchingOverDesk";
        }
        else if(spinner4.getSelectedItemPosition() == 2)
        {
            message4 = "IndustrialAccident";
        }
        else if(spinner4.getSelectedItemPosition() == 3)
        {
            message4 = "Jumping/Falling";
        }
        else if(spinner4.getSelectedItemPosition() == 4)
        {
            message4 = "LiftingObjectFromGround";
        }
        else if(spinner4.getSelectedItemPosition() == 5)
        {
            message4 = "MotorAccident";
        }
        else if(spinner4.getSelectedItemPosition() == 6)
        {
            message4 = "PhysicalAltercation";
        }
        else if(spinner4.getSelectedItemPosition() == 7)
        {
            message4 = "Scoliosis";
        }
        else if(spinner4.getSelectedItemPosition() == 8)
        {
            message4 = "Swinging";
        }
        else
        {
            message4 = "Other";
        }

        String messageN = i.getStringExtra(MESSAGE_KEYN);
        String message1 = i.getStringExtra(MESSAGE_KEY1);
        String message2 = i.getStringExtra(MESSAGE_KEY2);
        String message3 = i.getStringExtra(MESSAGE_KEY3);

        Intent i4 = new Intent(getApplicationContext(), ResultActivity.class);
        i4.putExtra(MESSAGE_KEYN, messageN);
        i4.putExtra(MESSAGE_KEY1, message1);
        i4.putExtra(MESSAGE_KEY2, message2);
        i4.putExtra(MESSAGE_KEY3, message3);
        i4.putExtra(MESSAGE_KEY4, message4);
        startActivity(i4);
    }
}
