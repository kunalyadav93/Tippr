package com.zupito.tippr;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.zupito.tippr.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        EditText amountField = (EditText) findViewById(R.id.amount);
        String amountVal = amountField.getText().toString();
        double mag =  Integer.parseInt(amountField.getText().toString());


        String message1 = "₹" + mag*0.15;
        String message2 = "₹" + mag*0.20;
        String message3 = "₹" + mag*0.25;
        String message4 = "₹" + mag*0.30;




        displayMessage(message1);
        displayMessage2(message2);
        displayMessage3(message3);
        displayMessage4(message4);


    }

    /**
     * This method displays the given quantity value on the screen.
     */


    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price1);
        priceTextView.setText(message);
    }
    private void displayMessage2(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price2);
        priceTextView.setText(message);
    }
    private void displayMessage3(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price3);
        priceTextView.setText(message);
    }
    private void displayMessage4(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price4);
        priceTextView.setText(message);
    }
}
