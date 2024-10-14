package org.example;

public class Main {

    // Köpeğin havlamasına göre uyanmayı sağlayan metod
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 20);
    }

    // Teenager olup olmadığını kontrol eden metod
    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) ||
                (age2 >= 13 && age2 <= 19) ||
                (age3 >= 13 && age3 <= 19);
    }

    // Kedinin oyun oynayıp oynamadığını kontrol eden metod
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }

    // Dikdörtgen alanı hesaplayan metod
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    // Daire alanı hesaplayan metod
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        // shouldWakeUp metodu testleri
        System.out.println(shouldWakeUp(true, 1));   // true
        System.out.println(shouldWakeUp(false, 2));  // false
        System.out.println(shouldWakeUp(true, 8));   // false
        System.out.println(shouldWakeUp(true, -1));  // false

        // hasTeen metodu testleri
        System.out.println(hasTeen(9, 99, 19));   // true
        System.out.println(hasTeen(23, 15, 42));  // true
        System.out.println(hasTeen(22, 23, 34));  // false

        // isCatPlaying metodu testleri
        System.out.println(isCatPlaying(true, 10));   // false
        System.out.println(isCatPlaying(false, 36));  // false
        System.out.println(isCatPlaying(false, 35));  // true

        // area metodu testleri (dikdörtgen)
        System.out.println(area(5.0, 4.0));    // 20.0
        System.out.println(area(-1.0, 4.0));   // -1

        // area metodu testleri (daire)
        System.out.println(area(5.0));   // 78.53975
        System.out.println(area(-1));    // -1
    }
}
