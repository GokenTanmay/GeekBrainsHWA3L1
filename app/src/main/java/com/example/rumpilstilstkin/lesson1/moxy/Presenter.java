package com.example.rumpilstilstkin.lesson1.moxy;


import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.rumpilstilstkin.lesson1.R;

@InjectViewState
public class Presenter extends MvpPresenter<MoxyExampleView> {

    private Model mModel; //Как правильно в moxy  в презентер инжектить модель?

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        mModel = new Model();
        Log.d("Dto", "first attach");
    }

    @Override
    public void attachView(MoxyExampleView view) {
        super.attachView(view);
        Log.d("Dto", "attach view");
    }

    private int calcNewModelValue(int currentValue) {
        return currentValue + 1;
    }

    public void buttonClick(final String btnName) {
        int newModelValue;
        switch (btnName) {
            case "sec":
                newModelValue = calcNewModelValue(mModel.getSeconds());
                mModel.setSeconds(newModelValue);
                getViewState().setButtonText(1, newModelValue);
                break;
            case "min":
                newModelValue = calcNewModelValue(mModel.getMinutes());
                mModel.setMinutes(newModelValue);
                getViewState().setButtonText(2, newModelValue);
                break;
            case "hr":
                newModelValue = calcNewModelValue(mModel.getHours());
                mModel.setHours(newModelValue);
                getViewState().setButtonText(3, newModelValue);
                break;
        }
    }
}
