package com.jingqi.practice.design_pattern.flow_framework;

public class ShapeProc {
      
      private IShape shape;

      public ShapeProc(IShape shape) {
            this.shape = shape;
      }
      
      public float process() {
            shape.input();
            float value = shape.getArea();
            return value;
      }
      
}
