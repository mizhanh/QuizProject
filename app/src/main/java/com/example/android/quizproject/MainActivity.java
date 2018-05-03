package com.example.android.quizproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int totalScore;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        EditText nameInput = (EditText) findViewById(R.id.player);
        name = nameInput.getText().toString();

        RadioButton choice1 = (RadioButton) findViewById(R.id.RadioButton1);
        boolean isChoice1 = choice1.isChecked();

        RadioButton choice2 = (RadioButton) findViewById(R.id.RadioButton2);
        boolean isChoice2 = choice2.isChecked();

        CheckBox Q2Choice1 = (CheckBox) findViewById(R.id.Q2_Choice1);
        boolean isQ2Choice1 = Q2Choice1.isChecked();

        CheckBox Q2Choice2 = (CheckBox) findViewById(R.id.Q2_Choice2);
        boolean isQ2Choice2 = Q2Choice2.isChecked();

        CheckBox Q2Choice3 = (CheckBox) findViewById(R.id.Q2_Choice3);
        boolean isQ2Choice3 = Q2Choice3.isChecked();

        CheckBox Q2Choice4 = (CheckBox) findViewById(R.id.Q2_Choice4);
        boolean isQ2Choice4 = Q2Choice4.isChecked();

        CheckBox Q3Choice1 = (CheckBox) findViewById(R.id.Q3_Choice1);
        boolean isQ3Choice1 = Q3Choice1.isChecked();

        CheckBox Q3Choice2 = (CheckBox) findViewById(R.id.Q3_Choice2);
        boolean isQ3Choice2 = Q3Choice2.isChecked();

        CheckBox Q3Choice3 = (CheckBox) findViewById(R.id.Q3_Choice3);
        boolean isQ3Choice3 = Q3Choice3.isChecked();

        CheckBox Q3Choice4 = (CheckBox) findViewById(R.id.Q3_Choice4);
        boolean isQ3Choice4 = Q3Choice4.isChecked();

        CheckBox Q4Choice1 = (CheckBox) findViewById(R.id.Q4_Choice1);
        boolean isQ4Choice1 = Q4Choice1.isChecked();

        CheckBox Q4Choice2 = (CheckBox) findViewById(R.id.Q4_Choice2);
        boolean isQ4Choice2 = Q4Choice2.isChecked();

        CheckBox Q4Choice3 = (CheckBox) findViewById(R.id.Q4_Choice3);
        boolean isQ4Choice3 = Q4Choice3.isChecked();

        CheckBox Q4Choice4 = (CheckBox) findViewById(R.id.Q4_Choice4);
        boolean isQ4Choice4 = Q4Choice4.isChecked();

        CheckBox Q5Choice1 = (CheckBox) findViewById(R.id.Q5_Choice1);
        boolean isQ5Choice1 = Q5Choice1.isChecked();

        CheckBox Q5Choice2 = (CheckBox) findViewById(R.id.Q5_Choice2);
        boolean isQ5Choice2 = Q5Choice2.isChecked();

        CheckBox Q5Choice3 = (CheckBox) findViewById(R.id.Q5_Choice3);
        boolean isQ5Choice3 = Q5Choice3.isChecked();

        CheckBox Q5Choice4 = (CheckBox) findViewById(R.id.Q5_Choice4);
        boolean isQ5Choice4 = Q5Choice4.isChecked();

        if (isChoice1) score = score + 1;
        if (isQ2Choice3) score = score + 1;
        if (isQ3Choice2 && isQ3Choice3 && isQ3Choice4) score = score + 1;
        if (isQ4Choice1 && isQ4Choice2) score = score + 1;
        if (isQ5Choice2 && isQ5Choice4) score = score + 1;
        totalScore = score;
        display(totalScore);
    }

    private void display(int finalScore){
        if (totalScore >= 4) {
            TextView scoreTextView = (TextView) findViewById(R.id.scoreView);
            scoreTextView.setText("Awesome, " + name + "!  You do know your POTUS." + "\nScore: " + totalScore + "/5");
        }

        if (totalScore <= 2) {
            TextView scoreTextView = (TextView) findViewById(R.id.scoreView);
            scoreTextView.setText("You should turn on the TV!" + "\nScore: " + totalScore + "/5");
        }
    }

}
