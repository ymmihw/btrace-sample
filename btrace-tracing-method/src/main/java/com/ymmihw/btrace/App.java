package com.ymmihw.btrace;

import java.util.Random;

public class App {

  private int field = 314;

  public static void main(String[] args) throws Exception {
    Random random = new Random();
    while (true) {
      new App().add(String.valueOf(random.nextInt(10)), random.nextInt(10));
      Thread.sleep(1000);
    }
  }

  private void innerAdd(String str, int num) {

  }

  public int add(String str, int num) {
    innerAdd(str, num);
    str.toUpperCase();
    return num;
  }
}
