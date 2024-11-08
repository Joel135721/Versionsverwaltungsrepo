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
            floriansMethod();
            methodCounter++;
        }

        private static void aFirstMethod() {
            System.out.println("MethodCollector.aFristMethod: This method has been created by iLuckyW");
        }

        private static void aSecondMethod() {
            System.out.println("MethodCollector.aFristMethod: This method has been created by PhoenixDE");
        }

        private static void floriansMethod() {
            System.out.println("MethodCollector.floriansMethod: This method has been created by Florian")
        }

    }
