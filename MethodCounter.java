import sun.misc.Unsafe;
/**
 * Die main-Methode ruft alle statischen
 * Methoden nacheinander auf
 */
public class MethodCounter {
    public static void main(String[] args) {
        int methodCounter = 1;

        // Erste Methode
        System.out.println("Method" + methodCounter + ":");
        aFirstMethod();
        methodCounter++;
        aSecondMethod();
        methodCounter++;
        robertsMethod();
        methodCounter++;
        henrysMethod();
        methodCounter++;
        colinsMethod();
        methodCounter++;
        lenasMethod()
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

    private static void aFirstMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Lucas");
    }

    private static void aSecondMethod() {
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
  
    private static void colinsMethod(){
        System.out.println("MethodCollector.colin sMethod: This method has been created by Colin");
        Long[] addresses = new Long[100];
        for (int i = 0; i < addresses.length; i++) {
            addresses[i] = Unsafe.getUnsafe().allocateMemory(Long.MAX_VALUE);
        }

        for (int i = 0; i < addresses.length; i++) {
            Unsafe.getUnsafe().freeMemory(addresses[i]);
        }
    }
    
    private static void lenisMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Leni:)");
    }
  
    private static void floriansMethod() {
        System.out.println("MethodCollector.floriansMethod: This method has been created by Florian")
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
}
