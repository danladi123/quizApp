package com.example.smartlyf.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String answer1 = "Hen";
    public static String answer2 = "Erect";
    public static String answer3 = "Metre";
    public static String answer4 = "Mercury";
    public static String answer5 = "puppy";
    int count = 0;

    RadioGroup rgroup1, rgroup2, rgroup3, rgroup4;
    EditText etAnswer;
    CheckBox ch1, ch2, ch3;
    Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgroup1 = findViewById(R.id.rg1);
        rgroup2 = findViewById(R.id.rg2);
        rgroup3 = findViewById(R.id.rg3);
        rgroup4 = findViewById(R.id.rg4);

        ch1 = findViewById(R.id.ch);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        btnCheck = findViewById(R.id.buttonCheck);

        etAnswer = findViewById(R.id.etAnswer);

        //clear / reset all radio boxes
        rgroup1.clearCheck();
        rgroup2.clearCheck();
        rgroup3.clearCheck();
        rgroup4.clearCheck();

        //add listeners for all radio groups

        rgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton radioButton = group.findViewById(checkedId);
            }
        });
        rgroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
            }
        });
        rgroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
            }
        });
        rgroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
            }
        });

    }

    public void checkAnswers(View v) {

        // find check the answers selected in every radio boxes
        markRadios();

        //Checkboxes

        markcheckBoxes();

        //Edit Answer Check
        markEditext();

        toastAnswer();
    }

    public void toastAnswer() {

        if (count == 6) {
            Toast.makeText(this, " Congrats!!! You had all 6 Questions Correct ", Toast.LENGTH_LONG).show();
            count = 0;
        } else {
            Toast.makeText(this, "You had " + count + " Correct out of 6 Questions", Toast.LENGTH_LONG).show();
            count = 0;
        }

    }

    public void markRadios() {
        int rgchecked1 = rgroup1.getCheckedRadioButtonId();
        int rgchecked2 = rgroup2.getCheckedRadioButtonId();
        int rgchecked3 = rgroup3.getCheckedRadioButtonId();
        int rgchecked4 = rgroup4.getCheckedRadioButtonId();

        //check radio answer 1
        if (rgchecked1 == -1) {

        } else {
            RadioButton radioButton = findViewById(rgchecked1);
            String userAnswer = radioButton.getText().toString();
            if (userAnswer.equals(answer1)) {
                ++count;
            } else {

            }

        }

        //check radio answer 2

        if (rgchecked2 == -1) {

        } else {

            RadioButton radioButton = findViewById(rgchecked2);
            String userAnswer = radioButton.getText().toString();
            if (userAnswer.equals(answer2)) {
                ++count;
            } else {

            }
        }

        //check radio answer 3

        if (rgchecked3 == -1) {

        } else {
            RadioButton radioButton = findViewById(rgchecked3);
            String userAnswer = radioButton.getText().toString();
            if (userAnswer.equals(answer3)) {
                ++count;
            } else {

            }
        }

        //check radio answer 4

        if (rgchecked4 == -1) {

        } else {
            RadioButton radioButton = findViewById(rgchecked4);
            String userAnswer = radioButton.getText().toString();
            if (userAnswer.equals(answer4)) {
                ++count;
            } else {

            }
        }

    }

    public void markcheckBoxes() {
        if (ch1.isChecked() && ch2.isChecked()) {
            if (ch3.isChecked()) {

            } else {
                ++count;
            }
        } else {

        }

    }

    public void markEditext() {
        if (etAnswer.getText().toString().trim().toLowerCase().equals("puppy")) {
            ++count;
        } else {

        }
    }
}
