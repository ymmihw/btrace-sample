package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;

@BTrace
public class MatchPattern {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "/ad.*/")
  public static void add() {
    println("Hello from method, add");
  }
}
