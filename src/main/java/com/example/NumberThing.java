package com.example;

public interface NumberThing<T extends Number & Comparable<T>> extends Thing<T> {}