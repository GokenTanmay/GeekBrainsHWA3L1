package com.example.rumpilstilstkin.lesson1.mosby;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

import com.example.rumpilstilstkin.lesson1.R;
import com.hannesdorfmann.mosby3.mvp.MvpActivity;


public class MosbyMainActivity extends MvpActivity<MosbyExampleView, Presenter>
        implements MosbyExampleView, View.OnClickListener {

    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter1 = (Button) findViewById(R.id.btnCounter1);
        btnCounter2 = (Button) findViewById(R.id.btnCounter2);
        btnCounter3 = (Button) findViewById(R.id.btnCounter3);
        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);

    }

    @NonNull
    @Override
    public Presenter createPresenter() {
        return new Presenter(new Model());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCounter1:
                presenter.buttonClick("sec"); //Имеет ли смысл выносить наименовани кнопко в строковые константы?
                break;
            case R.id.btnCounter2:
                presenter.buttonClick("min");
                break;
            case R.id.btnCounter3:
                presenter.buttonClick("hr");
                break;
        }
    }

    @Override
    public void setSecButtonText(int value) {
        btnCounter1.setText("Количество = " + value);
    }

    @Override
    public void setMinButtonText(int value) {
        btnCounter2.setText("Количество = " + value);
    }

    @Override
    public void setHrButtonText(int value) {
        btnCounter3.setText("Количество = " + value);
    }
}
