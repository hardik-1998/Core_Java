package com.hardik.NestedClass;

class Greeting {
    public void sayHello(){
        System.out.println("Namaste!!!");
    }
}

class India {
    Greeting g = new Greeting(){
        public void sayHello(){
            System.out.println("Namaste!!!");
        }
    };
}

public class OuterClass {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";
    //Inner Class
    class InnerClass {
//        static String innerClassField = "Hardik";
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }
    //static nested class
    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            //     field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.accessMembers(outerObject);
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);

        System.out.println("\nAnonymus inner class:");
        India india = new India();
        india.g.sayHello();
    }
}