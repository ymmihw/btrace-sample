package com.ymmihw.btrace;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) throws Exception {
    Random random = new Random();
    while (true) {
      add(random.nextInt(10));
      Thread.sleep(1000);
    }
  }

  public static void add(int num) {}
}
