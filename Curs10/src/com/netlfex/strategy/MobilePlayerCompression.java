package com.netlfex.strategy;

public class MobilePlayerCompression implements CompressionStragegy{
    @Override
    public void compress() {
        System.out.println("Using H264 compression");
    }
}
