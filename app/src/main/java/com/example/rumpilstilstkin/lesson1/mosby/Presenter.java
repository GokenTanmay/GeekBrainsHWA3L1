package com.example.rumpilstilstkin.lesson1.mosby;


import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;


public class Presenter extends MvpBasePresenter<MosbyExampleView> {

    private Model mModel;

    Presenter(iModel model) {
        this.mModel = (Model) model;
    }

    private int calcNewModelValue(int currentValue) {
        return currentValue + 1;
    }

    public void buttonClick(final String btnName) {
        ifViewAttached(new ViewAction<MosbyExampleView>() {
            @Override
            public void run(@NonNull MosbyExampleView view) {
                int newModelValue;
                switch (btnName) {
                    case "sec":
                        newModelValue = calcNewModelValue(mModel.getSeconds());
                        mModel.setSeconds(newModelValue);
                        view.setSecButtonText(newModelValue);
                        break;
                    case "min":
                        newModelValue = calcNewModelValue(mModel.getMinutes());
                        mModel.setMinutes(newModelValue);
                        view.setMinButtonText(newModelValue);
                        break;
                    case "hr":
                        newModelValue = calcNewModelValue(mModel.getHours());
                        mModel.setHours(newModelValue);
                        view.setHrButtonText(newModelValue);
                        break;
                }
            }
        });

    }
}
