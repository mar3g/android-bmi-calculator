package com.marekkinasz;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = findViewById(R.id.Result);
        TextView weight = findViewById(R.id.WeightField);
        TextView height = findViewById(R.id.HeightField);

        Button submitButton = findViewById(R.id.SubmitButton);
        submitButton.setOnClickListener(v -> {
            try {
                double weightValue = Double.parseDouble(weight.getText().toString());
                double heightValue = Double.parseDouble(height.getText().toString());
                double bmi = weightValue / (heightValue * heightValue);

                result.setText("Your BMI = " + bmi);
            } catch (Exception e) {
                result.setText("Could not calculate BMI. Correct the data.");
            }
        });
    }
}