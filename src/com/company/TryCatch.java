package com.company;

public class TryCatch {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.substring(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("I'm still executing...");
    }
}
