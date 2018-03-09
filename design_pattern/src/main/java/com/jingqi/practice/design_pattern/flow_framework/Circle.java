package com.jingqi.practice.design_pattern.flow_framework;

import java.util.Scanner;

public class Circle implements IShape{

      float r;
      
      @Override
      public boolean input() {
            System.out.println("请输入半径: ");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextFloat();
            scanner.close();
            return true;
      }

      @Override
      public float getArea() {
            float s = (float) (Math.PI * r * r);
            return s;
      }
      
}
