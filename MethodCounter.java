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
    }

    private static void aFirstMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by iLuckyW");
    }

    private static void aSecondMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by PhoenixDE");
    }

    private static void robertsMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Robert🦖");
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
}
