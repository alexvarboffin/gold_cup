package com.sport.matches.winline.model;


public class HeaderObject implements ViewModel {

    public int title;
    public int icon;
    public final String packageName;

    public HeaderObject(int title, String content, String packageName, int icon) {
        this.title = title;
        this.icon = icon;
        this.packageName = packageName;
    }
}