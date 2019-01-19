package com.example.rumpilstilstkin.lesson1.mosby;


import com.hannesdorfmann.mosby3.mvp.MvpView;


public interface MosbyExampleView extends MvpView {
    void setSecButtonText(int value);
    void setMinButtonText(int value);
    void setHrButtonText(int value);
}
