import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Die main-Methode ruft alle statischen
 * Methoden nacheinander auf
 */
public class MethodCounter {
    public static void main(String[] args) {
        int methodCounter = 1;

        // Erste Methode
        System.out.println("Method" + methodCounter + ":");
        lucasMethod();
        methodCounter++;
        jorisMethod();
        methodCounter++;
        robertsMethod();
        methodCounter++;
        henrysMethod();
        methodCounter++;
        leonsMethod();
        methodCounter++;
        colinsMethod();
        methodCounter++;
        lenasMethod();
        methodCounter++;
        jannesMethod();
        methodCounter++;
        emmasMethod();
        methodCounter++;
        lenisMethod();
        methodCounter++;
        floriansMethod();
        methodCounter++;
    }

    private static void lucasMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Lucas");
    }

    private static void jorisMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by PhoenixDE");
    }

    private static void robertsMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Robert🦖");
    }
  
    private static void emmasMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Emma🌟");
    }
  
    private static void henrysMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Henry");
    }

    public static void leonsMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Leon");
    }
  
    private static void colinsMethod(){
        System.out.println("MethodCollector.colin sMethod: This method has been created by Colin");
        Long[] addresses = new Long[100];
        Field f;
        try {
            f = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        f.setAccessible(true);
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) f.get(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < addresses.length; i++) {
            addresses[i] = unsafe.allocateMemory(1000);
        }

        for (Long address : addresses) {
            unsafe.freeMemory(address);
        }
    }
    
    private static void lenisMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Leni:)");
    }
  
    private static void floriansMethod() {
        System.out.println("MethodCollector.floriansMethod: This method has been created by Florian");
    }
  

    private static void lenasMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Lena 😀");
    }
  
    private static void JakobUndNoahsMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Cramcon und Ghost🦧🦧🦧🦧🦧🦧🦧");
    }
  
    private static void jannesMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Jannes");
    }

    private static void testMethod(){
        System.out.println("this is a test");
    }
}
