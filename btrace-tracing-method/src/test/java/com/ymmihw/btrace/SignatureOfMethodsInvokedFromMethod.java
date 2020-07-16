package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.classOf;
import static org.openjdk.btrace.core.BTraceUtils.println;
import static org.openjdk.btrace.core.BTraceUtils.str;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.Kind;
import org.openjdk.btrace.core.annotations.Location;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.ProbeMethodName;
import org.openjdk.btrace.core.annotations.Self;
import org.openjdk.btrace.core.annotations.TargetInstance;
import org.openjdk.btrace.core.annotations.TargetMethodOrField;
import org.openjdk.btrace.core.annotations.Where;

@BTrace
public class SignatureOfMethodsInvokedFromMethod {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add", location = @Location(value = Kind.CALL,
      clazz = "com.ymmihw.btrace.App", method = "innerAdd", where = Where.BEFORE))
  public static void onMethod(@ProbeMethodName(fqn = true) String pmn,
      @TargetMethodOrField(fqn = true) String tpmn, @Self Object thiz, @TargetInstance Object tgt,
      String a, int b) {
    println("Hello from method " + pmn);
    println("Going to invoke method " + tpmn);
    println("context = " + str(classOf(thiz)) + ", target = " + str(classOf(tgt)));
    println("a = " + a + ", b = " + str(b));
  }
}
