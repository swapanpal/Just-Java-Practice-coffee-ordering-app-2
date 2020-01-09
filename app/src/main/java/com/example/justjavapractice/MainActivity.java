package com.example.justjavapractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
/*
This app displays an order form to order coffee
 */

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    This method is called when plus button is clicked
     */
    public void increment(View view){
        quantity = quantity + 1;
        display(quantity);
    }
    /*
    This method is called when minus button is clicked
     */
    public void decrement(View view){
        quantity = quantity - 1;
        display(quantity);
    }
    /*
    This method is called when order button is clicked
     */
    public void submitOrder(View view){
        displayPrice(quantity * 5);

    }
    /*
    This method displays the given quantity value on the screen
     */
    private void display(int number){
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /*
    This method displays the given quantity value on the screen
     */
    private void displayPrice(int number){
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }
}