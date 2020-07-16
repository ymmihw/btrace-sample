package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import static org.openjdk.btrace.core.BTraceUtils.str;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.Duration;
import org.openjdk.btrace.core.annotations.Kind;
import org.openjdk.btrace.core.annotations.Location;
import org.openjdk.btrace.core.annotations.OnMethod;

@BTrace
public class ExecutionDuration {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add", location = @Location(Kind.RETURN))
  public static void onMethod(@Duration long dur) {
    println("It took " + str(dur) + "ns to execute this method");
  }
}
