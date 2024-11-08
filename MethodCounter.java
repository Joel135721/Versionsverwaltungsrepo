import java.sql.SQLOutput;

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
        lenasMethod()
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

    private static void henrysMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Henry");
    }

    private static void lenasMethod() {
        System.out.println("MethodCollector.aFristMethod: This method has been created by Lena 😀");
    }
}
