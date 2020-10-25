package com.example.burgers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    // Global variable quantity starting at 1
    int quantity = 1;
    TextView totalDisplay;
    //String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Method to increment value called here
        incrementQuantity();
        // Method to decrement value called here
        decrementQuantity();
        // Method to order value called here
        btnOrder();

        totalDisplay = findViewById(R.id.totalDisplay);
        totalDisplay.setVisibility(View.GONE);
    }// END of onCreate
    // ---------------------------------------------------------------------
    //                       Methods starting here:
    //----------------------------------------------------------------------
    private void incrementQuantity(){
        // Variable to find reference
        Button btnIncrement = findViewById(R.id.btnIncrement);

        // Button on click
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if statement to count from 0 to 10 maximum in quantity
                if(quantity < 10)
                {
                    quantity = quantity + 1; // Increment by one
                }
                TextView txtQuantity = findViewById(R.id.quantity);
                txtQuantity.setText(String.valueOf(quantity));
            }
        });
    } // END of increment method
    private void decrementQuantity(){
        // Variable to find reference
        Button btnDecrement = findViewById(R.id.btnDecrement);

        // Button on click
        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // if statement to count not to go negative in quantity
                if(quantity > 1) {
                    quantity  = quantity - 1; // Decrement by one
                }
                TextView txtQuantity = findViewById(R.id.quantity);
                txtQuantity.setText(String.valueOf(quantity));
            }
        });
    } // END of Decrement method
    // Method to click on order:
    private void btnOrder(){
        Button btnOrder = findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Variable to hold total:
                totalDisplay = findViewById(R.id.totalDisplay);
                EditText txtName = findViewById(R.id.txtName);

                totalDisplay.setText("Your total is $" + String.valueOf(quantity * 10) + "."
                        + "\n" + "Thanks for buying with us, " + txtName.getText().toString() + "!!");
                totalDisplay.setVisibility(View.VISIBLE);
            }
        });
    }
}// END MainActivity extends AppCompatActivityid.txtName);