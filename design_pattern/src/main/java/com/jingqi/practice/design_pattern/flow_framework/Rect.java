package com.jingqi.practice.design_pattern.flow_framework;

import java.util.Scanner;

public class Rect implements IShape {

      float width, height;
      
      @Override
      public boolean input() {
            System.out.println("请输入宽:");
            Scanner scanner = new Scanner(System.in);
            width = scanner.nextFloat();
            System.out.println("请输入高:");
            height = scanner.nextFloat();
            scanner.close();
            return true;            
      }

      @Override
      public float getArea() {
            float s = width * height;
            return s;
      }
      
      

}
