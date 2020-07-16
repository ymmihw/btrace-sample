package com.ymmihw.btrace;

import java.util.Random;

public class App {
  public static void main(String[] args) throws Exception {
    Random random = new Random();
    while (true) {
      add(random.nextInt(10));
      Thread.sleep(100);
    }
  }

  public static void add(int num) {}
}
