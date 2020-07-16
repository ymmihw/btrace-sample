package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;

@BTrace
public class MethodExecute {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add")
  public static void onMethod() {
    println("Hello from method");
  }
}
