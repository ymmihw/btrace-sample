package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.ProbeMethodName;

@BTrace
public class GetMethodSignature {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add")
  public static void onMethod(@ProbeMethodName(fqn = true) String pmn) {
    println("Hello from method " + pmn);
  }
}
