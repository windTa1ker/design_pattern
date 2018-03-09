package com.jingqi.practice.design_pattern;

import com.jingqi.practice.design_pattern.flow_framework.Circle;
import com.jingqi.practice.design_pattern.flow_framework.Circle2;
import com.jingqi.practice.design_pattern.flow_framework.IShape2;

public class TestIShape2 {

      public static void main(String[] args) {

            IShape2 obj = new Circle2(10.0f);
            Float result = (Float) obj.dispatch(1, null);
            System.out.println("半径 10 的圆面积: " + result.floatValue());
            
            
      }

}
