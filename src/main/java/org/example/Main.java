package org.example;

public class Main {
    public static void main(String[] args) {

        Tester.printStaticInfo();

        Tester tester1 = new Tester("Никита", "Шетик");
        Tester tester2 = new Tester("Кирилл", "Левчук");
        Tester tester3 = new Tester("Владимир", "Ершов", 3, "C1", 5000.0);

        tester1.printInfo();
        tester2.printInfo(true);
        tester3.printInfo(true, true, true);
    }
}