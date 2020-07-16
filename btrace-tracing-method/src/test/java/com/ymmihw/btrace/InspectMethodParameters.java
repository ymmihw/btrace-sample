package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.printArray;
import static org.openjdk.btrace.core.BTraceUtils.println;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.ProbeMethodName;
import org.openjdk.btrace.core.types.AnyType;

@BTrace
public class InspectMethodParameters {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add")
  public static void onMethod(@ProbeMethodName String pmn, AnyType[] args) {
    println("Hello from method " + pmn);
    println("Received the following parameters:");
    printArray(args);
  }
}
