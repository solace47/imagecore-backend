package com.tech.imagecorebackendpictureservice.infrastructure.algorithm;// TopK.java
import java.util.List;
import java.util.concurrent.BlockingQueue;

public interface TopK {
    AddResult add(String key, int increment);
    List<Item> list();
    BlockingQueue<Item> expelled();
    void fading();
    long total();
}