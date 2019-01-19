package com.example.rumpilstilstkin.lesson1.mosby;


import java.util.ArrayList;
import java.util.List;


public class Model implements iModel {

    private List<Integer> mList;

    public Model() {
        mList = new ArrayList<>(3);
        mList.add(0);
        mList.add(0);
        mList.add(0);
    }

    //Является ли ошибкой то, что Presenter может запросить несуществующий индекс?
    public int getSeconds() {
        return mList.get(0);
    }

    public void setSeconds(int value) {
        mList.set(0, value);
    }

    public int getMinutes() {
        return mList.get(1);
    }

    public void setMinutes(int value) {
        mList.set(1, value);
    }

    public int getHours() {
        return mList.get(2);
    }

    public void setHours(int value) {
        mList.set(2, value);
    }
}

