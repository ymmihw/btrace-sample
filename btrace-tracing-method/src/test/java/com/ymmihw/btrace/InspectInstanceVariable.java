package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.classOf;
import static org.openjdk.btrace.core.BTraceUtils.field;
import static org.openjdk.btrace.core.BTraceUtils.getInt;
import static org.openjdk.btrace.core.BTraceUtils.println;
import static org.openjdk.btrace.core.BTraceUtils.str;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.Self;

@BTrace
public class InspectInstanceVariable {
  @OnMethod(clazz = "com.ymmihw.btrace.App", method = "add")
  public static void onMethod(@Self Object thiz) throws NoSuchFieldException, SecurityException {
    println("field = " + str(getInt(field(classOf(thiz), "field"), thiz)));
  }
}
