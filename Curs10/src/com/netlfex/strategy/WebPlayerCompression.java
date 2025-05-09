package com.netlfex.strategy;

public class WebPlayerCompression implements CompressionStragegy{
    @Override
    public void compress() {
        System.out.println("Using MPEG compression");
    }
}
