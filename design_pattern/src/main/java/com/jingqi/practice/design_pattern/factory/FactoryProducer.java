package com.jingqi.practice.design_pattern.factory;

public class FactoryProducer {
      public static AbstractFactory getFactory(String choice) {
            if (choice.equalsIgnoreCase("SHAPE")) {
                  return new ShapeFactory2();
            } else if (choice.equalsIgnoreCase("COLOR")) {
                  return new ColorFactory();
            }
            return null;
      }
}
