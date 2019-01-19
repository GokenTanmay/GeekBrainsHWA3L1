package com.example.rumpilstilstkin.lesson1.main.mvp;


public class Presenter {

    private iModel mModel;
    private iMainView view;

    public Presenter(iModel model, iMainView view) {
        this.mModel = model;
        this.view = view;
    }

    private int calcNewModelValue(int currentValue) {
        //DO SMT
        return currentValue + 1;
    }

    public void incSec(){
        int newModelValue = calcNewModelValue(mModel.getSeconds());
        mModel.setSeconds(newModelValue);
        view.setSeconds(newModelValue);
    }

    public void incMin(){
        int newModelValue = calcNewModelValue(mModel.getMinutes());
        mModel.setMinutes(newModelValue);
        view.setMinute(newModelValue);
    }

    public void incHours(){
        int newModelValue = calcNewModelValue(mModel.getHours());
        mModel.setHours(newModelValue);
        view.setHours(newModelValue);
    }
}

