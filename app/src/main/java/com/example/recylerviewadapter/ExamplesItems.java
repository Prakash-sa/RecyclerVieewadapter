package com.example.recylerviewadapter;

public class ExamplesItems {
    private int imageno;
    private String text;

    public ExamplesItems(int imageno,String text){
        imageno=imageno;
        text=text;
    }

    public int getImageno(){
        return imageno;
    }
    public String getText(){
        return text;
    }

}
