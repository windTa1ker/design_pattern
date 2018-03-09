package com.jingqi.practice.design_pattern;

import com.jingqi.practice.design_pattern.flow_framework.Circle;
import com.jingqi.practice.design_pattern.flow_framework.IShape;
import com.jingqi.practice.design_pattern.flow_framework.Rect;
import com.jingqi.practice.design_pattern.flow_framework.ShapeProc;

public class TestArea {

      public static void main(String[] args) {

            IShape shape = new Circle();
            ShapeProc sProc = new ShapeProc(shape);
            float value = sProc.process();
            System.out.println("圆面积为:  " + value);
            
            IShape shape2 = new Rect();
            ShapeProc sProc2 = new ShapeProc(shape2);
            float value2 = sProc2.process();
            System.out.println("矩形面积为: " + value2);
            
      }

}
