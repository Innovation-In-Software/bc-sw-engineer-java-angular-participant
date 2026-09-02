public class StackExample {

    public static void main(String[] args) {
        System.out.println("===== Stack Memory Demonstration =====");
        System.out.println("Call chain: main() -> methodA() -> methodB() -> methodC()");
        System.out.println();

        int mainCounter = 1;
        String mainLabel = "main-frame";
        Person mainPerson = new Person("Main User", 30);

        System.out.println("main() frame");
        printFrameDetails("mainCounter", mainCounter, "mainLabel", mainLabel, mainPerson);
        methodA(10);
        System.out.println();
        System.out.println("Back in main() - methodC() frame has been removed from the stack.");
        printFrameDetails("mainCounter", mainCounter, "mainLabel", mainLabel, mainPerson);
    }

    private static void methodA(int valueA) {
        int localA = valueA * 2;
        String labelA = "frame-A";
        Person personA = new Person("Alice", 25);

        System.out.println();
        System.out.println("methodA() frame");
        printFrameDetails("localA", localA, "labelA", labelA, personA);
        methodB(localA);
    }

    private static void methodB(int valueB) {
        int localB = valueB + 5;
        String labelB = "frame-B";
        Person personB = new Person("Bob", 28);

        System.out.println();
        System.out.println("methodB() frame");
        printFrameDetails("localB", localB, "labelB", labelB, personB);
        methodC(localB);
    }

    private static void methodC(int valueC) {
        int localC = valueC - 3;
        String labelC = "frame-C";
        Person personC = new Person("Carol", 32);

        System.out.println();
        System.out.println("methodC() frame");
        printFrameDetails("localC", localC, "labelC", labelC, personC);
        System.out.println();
        System.out.println("Stack frame stores:");
        System.out.println("- Primitive values directly (localC = " + localC + ")");
        System.out.println("- Object references (personC reference on stack, object on heap)");
        System.out.println("- Return address to methodB()");
    }

    private static void printFrameDetails(String primitiveName, int primitiveValue,
                                          String stringName, String stringValue,
                                          Person person) {
        System.out.println("  Primitive on stack : " + primitiveName + " = " + primitiveValue);
        System.out.println("  Reference on stack : " + stringName + " -> \"" + stringValue + "\" (String object on heap)");
        System.out.println("  Reference on stack : person -> " + person);
        System.out.println("  Identity hash code : " + System.identityHashCode(person));
    }
}
