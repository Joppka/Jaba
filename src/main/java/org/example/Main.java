package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Dima", "Metelitsa", 2);
        Tester tester2 = new Tester("Renat", "Mfthuhevisch", 3, "Advanced");
        Tester tester3 = new Tester("Vladislav", "Egorov", 8, "Expert", 50000);

        tester1.printInfo();
        tester2.printInfo(true);
        tester3.printInfo("qwerty");
        Tester.staticMethodExample();
    }
}