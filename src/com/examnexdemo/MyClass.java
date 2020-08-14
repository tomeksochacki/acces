package com.examnexdemo;

class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }
}

class AccesDemo{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setAlpha(-99);
        System.out.println("myClass.alpha is: " + myClass.getAlpha());

        //myClass.getAlpha() = 10;

        myClass.beta = 88;
        myClass.gamma = 90;
    }
}