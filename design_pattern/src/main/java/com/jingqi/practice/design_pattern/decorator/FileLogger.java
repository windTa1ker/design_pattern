package com.jingqi.practice.design_pattern.decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FileLogger implements ILogger {

      @Override
      public void log(String msg) {
            DataOutputStream dos = null;
            try {
                  dos = new DataOutputStream(new FileOutputStream("log.txt"));
                  dos.writeBytes(msg + "\r\n");
                  dos.close();
            }catch (Exception e) {
                  e.printStackTrace();
            }
      }

}
