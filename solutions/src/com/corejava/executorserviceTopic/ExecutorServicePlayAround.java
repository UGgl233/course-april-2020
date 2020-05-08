package com.corejava.executorserviceTopic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public class ExecutorServicePlayAround {
    static class A {
        public A(){}
        static String getMethod(){
            return "A.getMethod";
        }
    }

    static class B {
        public B(){}
        static String getMethod(){
            return "B.getMethod";
        }
    }

    private static String runSameTime() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        StringBuilder sb = new StringBuilder();
        try {
            Future<String> aFuture = executorService.submit(A::getMethod);
            Future<String> bFuture = executorService.submit(B::getMethod);
            boolean flag = true;
            while (flag) {
                if (aFuture.isDone() && bFuture.isDone()) {
                    sb.append(bFuture.get() + " " + aFuture.get());
                    flag = false;
                }
            }
        }
        catch (InterruptedException ie) {
            System.out.println("InterruptedException caught");
            ie.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(runSameTime());
    }
}
