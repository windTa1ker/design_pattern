package com.jingqi.practice.design_pattern.factory;

public abstract class AbstractFactory {
      abstract Color getColor(String color);

      abstract Shape getShape(String shape);
}
