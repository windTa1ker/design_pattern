package com.jingqi.practice.design_pattern.decorator;

import java.util.Date;

public class XMLLogger extends Decorator {

      public XMLLogger(ILogger logger) {
            super(logger);
      }

      @Override
      public void log(String msg) {
            String s = "<msg>\r\n" +
                                    "<content>"+ msg +"</content>\r\n"  +
                                    "<time>"+new Date().toString() +"</time>\r\n" +
                                    "</msg>\r\n";
            logger.log(s);
      }

}
