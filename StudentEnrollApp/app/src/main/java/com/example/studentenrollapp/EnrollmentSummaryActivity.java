package com.example.studentenrollapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EnrollmentSummaryActivity extends AppCompatActivity {

    TextView textViewSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrollment_summary);

        textViewSummary = findViewById(R.id.textViewSummary);
        int totalCredits = getIntent().getIntExtra("totalCredits", 0);

        // Display summary with the total credits
        String summary = "Subject List:\n";
        if (totalCredits >= 3) summary += "1. Subject 1 (3 credits)\n";
        if (totalCredits >= 4) summary += "2. Subject 2 (4 credits)\n";
        if (totalCredits >= 3) summary += "3. Subject 3 (3 credits)\n";

        summary += "\nTotal Credits: " + totalCredits;

        textViewSummary.setText(summary);
    }
}
