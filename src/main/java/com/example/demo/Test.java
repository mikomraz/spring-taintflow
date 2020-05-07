package com.example.demo;

import java.io.IOException;

class Test {
    public static void main(String[] args) throws IOException {
        String script = System.getenv("SCRIPTNAME");
        Runtime.getRuntime().exec(script);
    }
}