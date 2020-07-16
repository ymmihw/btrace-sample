package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import static org.openjdk.btrace.core.BTraceUtils.str;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.ProbeMethodName;

@BTrace
public class UnannotatedParameter {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add")
  public static void onMethod(@ProbeMethodName String pmn, String param1, int param2) {
    println("Hello from method " + pmn);
    println("Arguments: param1 = " + str(param1) + ", param2 = " + str(param2));
  }
}
