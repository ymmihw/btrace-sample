package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;

@BTrace
public class TracingScript {
  @OnMethod(clazz = "com.ymmihw.btrace.HelloWorld", method = "add")
  public static void onAdd(int num) {
    println(num);
  }
}
