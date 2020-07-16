package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.ProbeMethodName;

@BTrace
public class GetMethodName {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "/.*/")
  public static void onMethod(@ProbeMethodName String pmn) {
    println("Hello from method " + pmn);
  }
}

