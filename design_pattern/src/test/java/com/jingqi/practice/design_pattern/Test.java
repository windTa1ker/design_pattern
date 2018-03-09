package com.jingqi.practice.design_pattern;

import com.jingqi.practice.design_pattern.decorator.FileLogger;
import com.jingqi.practice.design_pattern.decorator.ILogger;
import com.jingqi.practice.design_pattern.decorator.XMLLogger;

public class Test {

      public static void main(String[] args) throws InterruptedException {
            ILogger existObj = new FileLogger();
            ILogger newObj = new XMLLogger(existObj);
            String[] s = {"how", "are", "you"};
            for(int i = 0; i< s.length; i++) {
                  newObj.log(s[i]);
                  Thread.sleep(1000);
            }
            System.out.println("END ......");
      }

}
