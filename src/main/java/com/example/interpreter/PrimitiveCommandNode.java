package com.example.interpreter;


public class PrimitiveCommandNode extends Node {
    private String name;

    @Override
    public void parse(Context context) throws ParseException {

    }

    @Override
    public String toString() {
        return name;
    }
}
