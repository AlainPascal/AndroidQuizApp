package com.example.pascal.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String answerOne = "Andy Rubin";
    String answerTwo = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the 'submit' button for Question 1 is clicked
     */
    public void submitQuestionOne(View view) {
        EditText answerOneTextField = findViewById(R.id.edit_text_q1);
        String userAnswerOne = answerOneTextField.getText().toString();

        // Comparing the user's answer with the correct answer
        if (userAnswerOne.equals(answerOne)) {
            // If the answer is correct then we add 1 to the user's score
            score += 1;

            // This will display a toast message saying that the answer is correct and display the score
            Toast.makeText(this, "Correct! You scored: " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        } else {
            // This will display a toast message saying that the answer is incorrect and display the score
            Toast.makeText(this, "Sorry, you got it wrong. You scored: " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the 'view answer' button  for Question 1 is clicked
     */
    public void viewAnswerOne(View view) {
        // This will display a toast message with the correct answer
        Toast.makeText(this, "The founder of Android is " + answerOne + ".", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the 'submit' button for Question 2 is clicked
     */
    public void submitQuestionTwo(View view) {
        String userAnswerTwo = "";

        RadioButton radioButtonFalse = findViewById(R.id.radio_button_false);
        boolean radioFalse = radioButtonFalse.isChecked();
        if (radioFalse) {
            userAnswerTwo = "False";
        }

        RadioButton radioButtonTrue = findViewById(R.id.radio_button_true);
        boolean radioTrue = radioButtonTrue.isChecked();
        if (radioTrue) {
            userAnswerTwo = "True";
        }

        if (userAnswerTwo.equals(answerTwo)) {
            score += 1;

            Toast.makeText(this, "Correct! You scored: " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Sorry, you got it wrong. You scored: " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the 'view answer' button  for Question 2 is clicked
     */
    public void viewAnswerTwo(View view) {
        // This will display a toast message with the correct answer
        Toast.makeText(this, answerTwo + ". Android Apps can also be developed in other programming languages such C/C++, Kotlin.", Toast.LENGTH_SHORT).show();
    }


}
