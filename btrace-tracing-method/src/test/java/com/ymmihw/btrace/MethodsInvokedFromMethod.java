package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.Kind;
import org.openjdk.btrace.core.annotations.Location;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.ProbeMethodName;
import org.openjdk.btrace.core.annotations.TargetMethodOrField;
import org.openjdk.btrace.core.annotations.Where;

@BTrace
public class MethodsInvokedFromMethod {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add", location = @Location(value = Kind.CALL,
      clazz = "java.lang.String", method = "toUpperCase", where = Where.BEFORE))
  public static void onMethod(@ProbeMethodName(fqn = true) String pmn,
      @TargetMethodOrField(fqn = true) String tpmn) {
    println("Hello from method " + pmn);
    println("Going to invoke method " + tpmn);
  }
}
