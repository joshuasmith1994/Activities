package com.smith.joshua.chiropro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    public final static String MESSAGE_KEYN = "com.smith.joshua.chiropro.message_keyn";
    public final static String MESSAGE_KEY1 = "com.smith.joshua.chiropro.message_key1";
    public final static String MESSAGE_KEY2 = "com.smith.joshua.chiropro.message_key2";
    public final static String MESSAGE_KEY3 = "com.smith.joshua.chiropro.message_key3";
    public final static String MESSAGE_KEY4 = "com.smith.joshua.chiropro.message_key4";
    public final static String MESSAGE_KEYS = "com.smith.joshua.chiropro.message_keys";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent i = getIntent();
        TextView textView = (TextView)findViewById(R.id.textView6);
        TextView textView2 = (TextView)findViewById(R.id.textView7);
        TextView textView3 = (TextView)findViewById(R.id.textView11);

        String messageN = i.getStringExtra(MESSAGE_KEYN);
        String message1 = i.getStringExtra(MESSAGE_KEY1);
        String message2 = i.getStringExtra(MESSAGE_KEY2);
        String message3 = i.getStringExtra(MESSAGE_KEY3);
        String message4 = i.getStringExtra(MESSAGE_KEY4);

        String messageS = "spine";

        String name = "Continue as: " + messageN;
        textView3.setText(name);

        //Arm symptoms
        if(message1.equals("Neck"))
        {
            message1 = "The possible vertebral disk(s) being affected are the C1-C3. The C3 nerve root is possibly pinched.";
            messageS = "c1c3";
            textView.setText(message1);
        }
        else if(message1.equals("Trapezius") && (message2.equals("SharpShootingPain") || message2.equals("Numbness") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C3-C4. The C4 nerve root is possibly pinched.";
            messageS = "c4c3";
            textView.setText(message1);
        }
        else if(message1.equals("Trapezius") && (message2.equals("Tingling") || message2.equals("Tenderness")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C3-C4. The C4 nerve root is possibly stretched.";
            messageS = "c4c3";
            textView.setText(message1);
        }
        else if((message1.equals("Deltoids") || message1.equals("Biceps")) && (message2.equals("Tingling") || message2.equals("Tenderness")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C4-C5. The C5 nerve root is possibly stretched.";
            messageS = "c4c5";
            textView.setText(message1);
        }
        else if((message1.equals("Deltoids") || message1.equals("Biceps")) && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C4-C5. The C5 nerve root is possibly pinched.";
            messageS = "c4c5";
            textView.setText(message1);
        }
        else if(message1.equals("Forearm/Wrist") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C5-C6. The C6 nerve root is possibly pinched.";
            messageS = "c5c6";
            textView.setText(message1);
        }
        else if(message1.equals("Forearm/Wrist") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C5-C6. The C6 nerve root is possibly stretched.";
            messageS = "c5c6";
            textView.setText(message1);
        }
        else if(message1.equals("Triceps") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C6-C7. The C7 nerve root is possibly pinched.";
            messageS = "c6c7";
            textView.setText(message1);
        }
        else if(message1.equals("Triceps") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C6-C7. The C7 nerve root is possibly stretched.";
            messageS = "c6c7";
            textView.setText(message1);
        }
        else if(message1.equals("Hand") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C7-T1. The C8 nerve root is possibly pinched.";
            messageS = "c7T1";
            textView.setText(message1);
        }
        else if(message1.equals("Hand") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the C7-T1. The C8 nerve root is possibly pinched.";
            messageS = "c7t1";
            textView.setText(message1);
        }

        //Torso Symptoms
        else if(message1.equals("Trunk") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the T1-T7. The T1-T6 nerve root(s) are possibly pinched.";
            messageS = "t1t7";
            textView.setText(message1);
        }
        else if(message1.equals("Trunk") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the T1-T7. The T1-T6 nerve root(s) are possibly stretched.";
            messageS = "t1t7";
            textView.setText(message1);
        }
        else if(message1.equals("Abdominals") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the T7-L1. The T7-T12 nerve root(s) are possibly pinched.";
            messageS = "t7l1";
            textView.setText(message1);
        }
        else if(message1.equals("Abdominals") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the T7-L1. The T7-T12 nerve root(s) are possibly stretched.";
            messageS = "t7l1";
            textView.setText(message1);
        }

        //Leg Symptoms
        else if(message1.equals("Quadriceps") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L1-L5. The L1-L4 nerve root(s) are possibly pinched.";
            messageS = "l1l5";
            textView.setText(message1);
        }
        else if(message1.equals("Quadriceps") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L1-L5. The L1-L4 nerve root(s) are possibly stretched.";
            messageS = "l1l5";
            textView.setText(message1);
        }
        else if(message1.equals("Hamstring") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L4-S1. The L4-L5 nerve root(s) are possibly pinched.";
            messageS = "l4s1";
            textView.setText(message1);
        }
        else if(message1.equals("Hamstring") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L4-S1. The L4-L5 nerve root(s) are possibly stretched.";
            messageS = "l4s1";
            textView.setText(message1);
        }
        else if(message1.equals("Shin") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L5-S1. The L5-S1 nerve root(s) are possibly pinched.";
            messageS = "l5s1";
            textView.setText(message1);
        }
        else if(message1.equals("Shin") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L5-S1. The L5-S1 nerve root(s) are possibly stretched.";
            messageS = "l5s1";
            textView.setText(message1);
        }
        else if((message1.equals("Calf") || message1.equals("Hip") || message1.equals("Foot/Toes")) && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L5-S3. The L5-S2 nerve root(s) are possibly pinched.";
            messageS = "l5s3";
            textView.setText(message1);
        }
        else if((message1.equals("Calf") || message1.equals("Hip") || message1.equals("Foot/Toes")) && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L5-S3. The L5-S2 nerve root(s) are possibly stretched.";
            messageS = "l5s3";
            textView.setText(message1);
        }
        else if(message1.equals("Buttocks") && (message2.equals("Numbness") || message2.equals("SharpShootingPain") || message2.equals("Spasms")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L5-S3. The S1-S2 nerve root(s) are possibly pinched.";
            messageS = "l5s3";
            textView.setText(message1);
        }
        else if(message1.equals("Buttocks") && (message2.equals("Tenderness") || message2.equals("Tingling")))
        {
            message1 = "The possible vertebral disk(s) being affected are the L5-S3. The S1-S2 nerve root(s) are possibly stretched.";
            messageS = "l5s3";
            textView.setText(message1);
        }

        //Necessity of Doctor Consultation
        //No
        if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("HunchingOverDesk"))
        {
            message2 = "Doctor assistance is not necessary.";
            textView2.setText(message2);
        }
        else if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("LiftingObjectFromGround"))
        {
            message2 = "Doctor assistance is not necessary.";
            textView2.setText(message2);
        }
        else if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("Sporting"))
        {
            message2 = "Doctor assistance is not necessary.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("HunchingOverDesk"))
        {
            message2 = "Doctor assistance is not necessary.";
            textView2.setText(message2);
        }

        //Varies
        if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("Jumping/Falling"))
        {
            message2 = "Doctor consultation is a possibility.";
            textView2.setText(message2);
        }
        else if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("IndustrialAccident"))
        {
            message2 = "Doctor consultation is a possibility.";
            textView2.setText(message2);
        }
        else if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("Swinging"))
        {
            message2 = "Doctor consultation is a possibility.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("LiftingObjectFromGround"))
        {
            message2 = "Doctor consultation is a possibility.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("Swinging"))
        {
            message2 = "Doctor consultation is a possibility.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("9") || message3.equals("10")) && message4.equals("HunchingOverDesk"))
        {
            message2 = "Doctor consultation is a possibility.";
            textView2.setText(message2);
        }

        //Yes - Car
        if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("MotorAccident"))
        {
            message2 = "It's highly recommended to consult a doctor after a motor accident, even with little stress.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("MotorAccident"))
        {
            message2 = "It's highly recommended to consult a doctor after a motor accident.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("MotorAccident"))
        {
            message2 = "Doctor assistance is REQUIRED after your accident and high intensity in sensation.";
            textView2.setText(message2);
        }

        //Yes
        if((message3.equals("4") || message3.equals("5")) && message4.equals("Jumping/Falling"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("IndustrialAccident"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("PhysicalAltercation"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("Scoliosis"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("Sporting"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("IndustrialAccident"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("Jumping/Falling"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("LiftingObjectFromGround"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("PhysicalAltercation"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("Scoliosis"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("Swinging"))
        {
            message2 = "It's highly recommended to get assistance from a doctor.";
            textView2.setText(message2);
        }

        //Recommended
        if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("PhysicalAltercation"))
        {
            message2 = "It's recommended to consult a doctor as the cause of stress possibly is from a personal conflict.";
            textView2.setText(message2);
        }
        else if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("Scoliosis"))
        {
            message2 = "It's recommended to consult a doctor as Scoliosis needs to be specially treated.";
            textView2.setText(message2);
        }
        else if((message3.equals("1") || message3.equals("2") || message3.equals("3")) && message4.equals("Other"))
        {
            message2 = "It's recommended to consult a doctor as the cause of stress is unknown.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("Sporting"))
        {
            message2 = "It's recommended to consult a doctor as the cause of stress is possibly from strenuous physical exertion.";
            textView2.setText(message2);
        }
        else if((message3.equals("4") || message3.equals("5")) && message4.equals("Other"))
        {
            message2 = "It's recommended to consult a doctor as the cause of stress is unknown.";
            textView2.setText(message2);
        }
        else if((message3.equals("6") || message3.equals("7") || message3.equals("8") || message3.equals("10")) && message4.equals("Other"))
        {
            message2 = "It's recommended to consult a doctor as the cause of stress is unknown.";
            textView2.setText(message2);
        }

        i.putExtra(MESSAGE_KEYN, messageN);
        i.putExtra(MESSAGE_KEYS, messageS);

    }

    public void buttonOnClick(View v) {
        Button button = (Button) v;

        Intent i = getIntent();

        String messageN = i.getStringExtra(MESSAGE_KEYN);
        String messageS = i.getStringExtra(MESSAGE_KEYS);


        if(button == (Button)findViewById(R.id.button6))
        {
            startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
        }

        else if(button == (Button)findViewById(R.id.button8))
        {
            Intent iR = new Intent(getApplicationContext(), VisualActivity.class);
            iR.putExtra(MESSAGE_KEYN, messageN);
            iR.putExtra(MESSAGE_KEYS, messageS);
            startActivity(iR);
        }

        else
        {
            Intent iR = new Intent(getApplicationContext(), IntroductionActivity.class);
            iR.putExtra(MESSAGE_KEYN, messageN);
            startActivity(iR);
        }
    }
}
