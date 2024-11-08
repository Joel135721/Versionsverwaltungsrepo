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
        }

        private static void aFirstMethod() {
            System.out.println("MethodCollector.aFristMethod: This method has been created by iLuckyW");
        }
    }
