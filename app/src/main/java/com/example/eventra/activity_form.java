package com.example.eventra;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class activity_form extends AppCompatActivity {

    private EditText txtEventTitle, txtEventDescription, dateTimeEditText, txtVenue, txtTicketPrize, txtOrganizedBy;
    private Button btnAddEvent;
    String selectedDate, selectedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        dateTimeEditText = findViewById(R.id.dateTimeEditText);
        dateTimeEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateTimeEditText.setText("");
                showDateTimePickerDialog();
            }
        });
    }

    private void showDateTimePickerDialog() {
        Calendar currentDateTime = Calendar.getInstance();
        int year = currentDateTime.get(Calendar.YEAR);
        int month = currentDateTime.get(Calendar.MONTH);
        int day = currentDateTime.get(Calendar.DAY_OF_MONTH);
        int hour = currentDateTime.get(Calendar.HOUR_OF_DAY);
        int minute = currentDateTime.get(Calendar.MINUTE);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
                selectedDate = selectedYear + "-" + (selectedMonth + 1) + "-" + selectedDay;
                showTimePickerDialog(hour, minute);
            }
        }, year, month, day);
        datePickerDialog.show();
    }

    private void showTimePickerDialog(int hour, int minute) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
                selectedTime = String.format("%02d:%02d", selectedHour, selectedMinute);
                dateTimeEditText.setText(selectedDate + " " + selectedTime);
            }
        }, hour, minute, true);
        timePickerDialog.show();
    }
}