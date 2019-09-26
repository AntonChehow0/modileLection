package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Получение кнопки из xml
        Button clickableButton = (Button) findViewById(R.id.clicableButton);

        //Установка текста на кнопку
        clickableButton.setText("Нажми меня");

        //Назначение слушателя события - "нажатие на кнопку"
        //Сделано в виде анонимного класса
        clickableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast testToast = Toast.makeText(getApplicationContext(), "Нажили на кнопку", Toast.LENGTH_SHORT);
                testToast.show();
            }
        });


        Button button1 = (Button) findViewById(R.id.clicableButton1);

        button1.setText("Нажми меня");

        TestListener listener = new TestListener();
        listener.context = getApplicationContext();

        button1.setOnClickListener(listener);

    }
}

class TestListener implements View.OnClickListener {

    public Context context;

    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(context, "Нажали на вторую кнопку", Toast.LENGTH_SHORT);
        toast.show();
    }
}