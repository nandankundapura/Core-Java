package StringPrograms;

public class InterfaceA {
    interface InterfaceA {
        void methodA();

        default void defaultMethod() {
            System.out.println("Default method in InterfaceA");
        }

        static void staticMethod() {
            System.out.println("Static method in InterfaceA");
        }
    }


    interface InterfaceB {
        void methodB();

        default void defaultMethod() {
            System.out.println("Default method in InterfaceB");
        }

        static void staticMethod() {
            System.out.println("Static method in InterfaceB");
        }
    }


    class ChildClass implements InterfaceA, InterfaceB {
        @Override
        public void methodA() {
            System.out.println("Method A implemented in ChildClass");
        }

        @Override
        public void methodB() {
            System.out.println("Method B implemented in ChildClass");
        }


        @Override
        public void defaultMethod() {
            InterfaceA.super.defaultMethod();
        }
    }

    public class TestInheritance {
        public static void main(String[] args) {
            ChildClass obj = new ChildClass();
            obj.methodA();
            obj.methodB();
            obj.defaultMethod();

            InterfaceA.staticMethod();
            InterfaceB.staticMethod();

        }
}
