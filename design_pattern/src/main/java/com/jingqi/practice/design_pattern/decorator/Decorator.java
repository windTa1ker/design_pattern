package com.jingqi.practice.design_pattern.decorator;

public abstract class Decorator implements ILogger {

      protected ILogger logger;

      public Decorator(ILogger logger) {
            this.logger = logger;
      }

}
