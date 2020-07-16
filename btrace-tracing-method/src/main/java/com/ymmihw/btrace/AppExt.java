package com.ymmihw.btrace;

import java.util.Random;

public class AppExt extends App {
  private void addString(String s) {};

  @Override
  public int add(String str, int num) {
    addString(String.valueOf(num));
    return num;
  }

  public static void main(String[] args) throws Exception {
    Random random = new Random();
    while (true) {
      new AppExt().add(String.valueOf(random.nextInt(10)), random.nextInt(10));
      Thread.sleep(1000);
    }
  }
}
