package com.sparta.debug;

public class DebugApp {
    public static void main(String[] args) {
        String name = "Josh Crabtree";
        String occupation = "trainee";
        String location = "London";
        String activityLevel = "moderate";

        System.out.println("My name is " + name);
        System.out.printf("I am a %s in %s%n", occupation, location);

        int age = 21;

        System.out.println("I am " + age + " years of age with a " + activityLevel + " activity level");
    }
}

//public class DebugApp {
//    public static void main(String[] args) {
//        var name;
//        name = "Josh Crabtree"
//        occupation = "trainee";
//        String location = 'London';
//        var activity level = "moderate";
//
//        System.out.println("My name is", name);
//        System.out.printf("I am a %s in %s%n" + location, occupation));
//
//        int age == 21;
//
//        print("I am " + age + "years of age with a ", activity level, "activity level");
//    }
//}