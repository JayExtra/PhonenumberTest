package com.example.phonenumbertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private static final Pattern NUMBER_PATTERN=Pattern.compile("^" +
            "(?=.*[0-9])"        //at least 1 digit
            );

    private TextView showNumbeer;
    private EditText enterNumber;
    private Button saveNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //map the widgets
        showNumbeer=findViewById(R.id.number_sample);
        enterNumber=findViewById(R.id.phone_number);
        saveNumber=findViewById(R.id.button_save);




        //when show number button is clicked
        saveNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sample = enterNumber.getText().toString(); //fetch values from the text field

                if(sample.isEmpty()) {
                    enterNumber.setError("Field should not be empty");
                }else if(sample.length()>10 || sample.length()<10){
                    enterNumber.setError("Number should not be greater than or less than ten");
                }else{

                    int number=Integer.parseInt(sample);

                    int[] phoneNumber=new int[10];


                    //getting position of the integers
                    int firstDigit = Integer.parseInt(Integer.toString(number).substring(0,1));
                    int secondDigit = Integer.parseInt(Integer.toString(number).substring(1,2));
                    int thirdDigit = Integer.parseInt(Integer.toString(number).substring(2,3));
                    int fourthDigit = Integer.parseInt(Integer.toString(number).substring(3,4));
                    int fifthDigit = Integer.parseInt(Integer.toString(number).substring(4,5));
                    int sixthDigit = Integer.parseInt(Integer.toString(number).substring(5,6));
                    int seventhDigit = Integer.parseInt(Integer.toString(number).substring(6,7));
                    int eighthDigit = Integer.parseInt(Integer.toString(number).substring(7,8));
                    int ninethDigit = Integer.parseInt(Integer.toString(number).substring(8,9));
                    int tenthDigit = Integer.parseInt(Integer.toString(number).substring(9,10));



                    //adding the integers into their respective positions in the array
                    phoneNumber[0]=firstDigit;
                    phoneNumber[1]=secondDigit;
                    phoneNumber[2]=thirdDigit;
                    phoneNumber[3]=fourthDigit;
                    phoneNumber[4]=fifthDigit;
                    phoneNumber[5]=sixthDigit;
                    phoneNumber[6]=seventhDigit;
                    phoneNumber[7]=eighthDigit;
                    phoneNumber[8]=ninethDigit;
                    phoneNumber[9]=tenthDigit;

                    //converting the integers into strings to be able to display them in a textview
                    String a =Integer.toString(phoneNumber[0]);
                    String b =Integer.toString(phoneNumber[1]);
                    String c =Integer.toString(phoneNumber[2]);
                    String d =Integer.toString(phoneNumber[3]);
                    String e =Integer.toString(phoneNumber[4]);
                    String f =Integer.toString(phoneNumber[5]);
                    String g =Integer.toString(phoneNumber[6]);
                    String h =Integer.toString(phoneNumber[7]);
                    String i =Integer.toString(phoneNumber[8]);
                    String j =Integer.toString(phoneNumber[9]);



                        showNumbeer.setText("("+a+b+c+") "+d+e+f+"-"+g+h+i+j);

                }

            }
        });
    }
}
