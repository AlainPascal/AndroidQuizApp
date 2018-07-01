package com.example.pascal.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String answerOne = "Andy Rubin";
    String answerTwo = "False";
    String answerThree = "Android Studio";
    String answerFour = "Android is an open-source operating system for smartphones, tablet computers, etc.";
    String answerFive = "layout_width, src, scaleType";

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
            Toast.makeText(this, "Correct! You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        } else {
            // This will display a toast message saying that the answer is incorrect and display the score
            Toast.makeText(this, "Sorry, you got it wrong. You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
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
        // Declaring variable to hold user's answer for Question 2
        String userAnswerTwo = "";

        // Checking if the user has checked False and assigning it to the declared variable
        RadioButton radioButtonFalse = findViewById(R.id.radio_button_false);
        boolean radioFalse = radioButtonFalse.isChecked();
        if (radioFalse) {
            userAnswerTwo = "False";
        }

        // Checking if the user has checked True and assigning it to the declared variable
        RadioButton radioButtonTrue = findViewById(R.id.radio_button_true);
        boolean radioTrue = radioButtonTrue.isChecked();
        if (radioTrue) {
            userAnswerTwo = "True";
        }

        // Comparing user's answer and the correct answer for Question 2
        if (userAnswerTwo.equals(answerTwo)) {
            score += 1;

            Toast.makeText(this, "Correct! You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Sorry, you got it wrong. You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the 'view answer' button  for Question 2 is clicked
     */
    public void viewAnswerTwo(View view) {
        // This will display a toast message with the correct answer
        Toast.makeText(this, answerTwo + ". Android Apps can also be developed in other programming languages such C/C++, Kotlin.", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the 'submit' button for Question 3 is clicked
     */
    public void submitQuestionThree(View view) {
        // Declaring variable to hold user's answer for Question 3
        String userAnswerThree = "";

        // Checking if the user has selected NetBeans and assigning it to the declared variable
        RadioButton radioButtonNetBeans = findViewById(R.id.radio_button_netBeans);
        boolean radioNetBeans = radioButtonNetBeans.isChecked();
        if (radioNetBeans) {
            userAnswerThree = "NetBeans";
        }

        // Checking if the user has selected Android Studio and assigning it to the declared variable
        RadioButton radioButtonAndroidStudio = findViewById(R.id.radio_button_androidStudio);
        boolean radioAndroidStudio = radioButtonAndroidStudio.isChecked();
        if (radioAndroidStudio) {
            userAnswerThree = "Android Studio";
        }

        // Checking if the user has selected Code::Blocks and assigning it to the declared variable
        RadioButton radioButtonCodeBlocks = findViewById(R.id.radio_button_codeBlocks);
        boolean radioCodeBlocks = radioButtonCodeBlocks.isChecked();
        if (radioCodeBlocks) {
            userAnswerThree = "Code::Blocks";
        }

        // Comparing user's answer and the correct answer for Question 3
        if (userAnswerThree.equals(answerThree)) {
            score += 1;

            Toast.makeText(this, "Correct! You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Sorry, you got it wrong. You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the 'view answer' button  for Question 3 is clicked
     */
    public void viewAnswerThree(View view) {
        // This will display a toast message with the correct answer
        Toast.makeText(this, "The IDE for developing Android Apps is " + answerThree + ".", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the 'submit' button for Question 4 is clicked
     */
    public void submitQuestionFour(View view) {
        EditText answerFourTextField = findViewById(R.id.edit_text_q4);
        String userAnswerFour = answerFourTextField.getText().toString();

        // Checking if the user has given an answer
        if (userAnswerFour.isEmpty()) {
            Toast.makeText(this, "Please provide your answer.", Toast.LENGTH_SHORT).show();
        } else {
            score += 1;

            Toast.makeText(this, "Nice try! You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the 'view answer' button  for Question 4 is clicked
     */
    public void viewAnswerFour(View view) {
        // This will display a toast message with the correct answer
        Toast.makeText(this, answerFour, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the 'submit' button for Question 5 is clicked
     */
    public void submitQuestionFive(View view) {
        CheckBox checkBoxWidth = findViewById(R.id.check_box_width);
        boolean checkWidth = checkBoxWidth.isChecked();

        CheckBox checkBoxSrc = findViewById(R.id.check_box_src);
        boolean checkSrc = checkBoxSrc.isChecked();

        CheckBox checkBoxScaleType = findViewById(R.id.check_box_scaleType);
        boolean checkScaleType = checkBoxScaleType.isChecked();

        // Checking if the user has selected the right check boxes
        if (checkWidth && checkSrc && checkScaleType) {
            score += 1;

            Toast.makeText(this, "Correct! You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Sorry, you got it wrong. You scored " + score + " points out of 5.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the 'view answer' button  for Question 5 is clicked
     */
    public void viewAnswerFive(View view) {
        // This will display a toast message with the correct answer
        Toast.makeText(this, answerFive, Toast.LENGTH_SHORT).show();
    }
}
