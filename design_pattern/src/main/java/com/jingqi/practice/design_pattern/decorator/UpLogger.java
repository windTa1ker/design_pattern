package com.jingqi.practice.design_pattern.decorator;

public class UpLogger extends Decorator {

      public UpLogger(ILogger logger) {
            super(logger);
      }

      @Override
      public void log(String msg) {
            msg = msg.toUpperCase();
            logger.log(msg);
      }

}
