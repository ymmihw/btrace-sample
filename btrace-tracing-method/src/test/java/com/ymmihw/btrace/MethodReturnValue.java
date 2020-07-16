package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.Kind;
import org.openjdk.btrace.core.annotations.Location;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.ProbeMethodName;
import org.openjdk.btrace.core.annotations.Return;

@BTrace
public class MethodReturnValue {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add", location = @Location(Kind.RETURN))
  public static void onMethod(@ProbeMethodName(fqn = true) String pmn, @Return int ret) {
    println("Hello from method " + pmn + "; returning " + ret);
  }
}
