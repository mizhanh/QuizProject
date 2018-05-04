package com.example.android.quizproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        EditText answerInput = (EditText) findViewById(R.id.answerQ2);
        String answer = answerInput.getText().toString();
        String correctAnswer = "Melania";

        RadioButton choiceA = (RadioButton) findViewById(R.id.RadioButton1);
        RadioButton choiceB = (RadioButton) findViewById(R.id.RadioButton2);

        CheckBox q3Choice1 = (CheckBox) findViewById(R.id.Q3_Choice1);
        CheckBox q3Choice2 = (CheckBox) findViewById(R.id.Q3_Choice2);
        CheckBox q3Choice3 = (CheckBox) findViewById(R.id.Q3_Choice3);
        CheckBox q3Choice4 = (CheckBox) findViewById(R.id.Q3_Choice4);

        CheckBox q4Choice1 = (CheckBox) findViewById(R.id.Q4_Choice1);
        CheckBox q4Choice2 = (CheckBox) findViewById(R.id.Q4_Choice2);
        CheckBox q4Choice3 = (CheckBox) findViewById(R.id.Q4_Choice3);
        CheckBox q4Choice4 = (CheckBox) findViewById(R.id.Q4_Choice4);

        CheckBox q5Choice1 = (CheckBox) findViewById(R.id.Q5_Choice1);
        CheckBox q5Choice2 = (CheckBox) findViewById(R.id.Q5_Choice2);
        CheckBox q5Choice3 = (CheckBox) findViewById(R.id.Q5_Choice3);
        CheckBox q5Choice4 = (CheckBox) findViewById(R.id.Q5_Choice4);

        if (choiceA.isChecked() && !choiceB.isChecked()) score += 1;
        if (answer.equals(correctAnswer)) score +=1;
        if (!q3Choice1.isChecked() && q3Choice2.isChecked() && q3Choice3.isChecked() && q3Choice4.isChecked()) score += 1;
        if (q4Choice1.isChecked() && q4Choice2.isChecked() && !q4Choice3.isChecked() && !q4Choice4.isChecked()) score += 1;
        if (!q5Choice1.isChecked() && q5Choice2.isChecked() && !q5Choice3.isChecked() && q5Choice4.isChecked()) score += 1;

        if (score >=3) {
            Context context = getApplicationContext();
            CharSequence text = "Awesome, you do know your POTUS!" + "\nScore: " + score + "/5" ;
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            Context context = getApplicationContext();
            CharSequence text = "You should watch more TV!" + "\nScore: " + score + "/5" ;
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

}
