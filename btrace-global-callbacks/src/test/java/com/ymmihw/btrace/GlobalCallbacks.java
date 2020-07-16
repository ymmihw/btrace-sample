package com.ymmihw.btrace;

import static org.openjdk.btrace.core.BTraceUtils.println;
import static org.openjdk.btrace.core.BTraceUtils.str;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnError;
import org.openjdk.btrace.core.annotations.OnEvent;
import org.openjdk.btrace.core.annotations.OnExit;
import org.openjdk.btrace.core.annotations.OnTimer;

@BTrace
public class GlobalCallbacks {
  @OnExit
  public static void onexit(int code) {
    println("Application exitting with " + code);
  }

  @OnError
  public static void onerror(Throwable t) {
    println("Encountered internal error " + str(t));
  }

  @OnTimer(1000)
  public static void ontimer() {
    println("tick ...");
  }

  @OnEvent
  public static void unnamed() {
    println("Received unnamed event");
  }

  @OnEvent("myEvent")
  public static void myevent() {
    println("Received my event");
  }
}
