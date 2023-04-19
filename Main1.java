public class Main {
    public static void main (String[] args) {
        Fruit[] fruits = {
                new Fruit("apple", "green", true),
                new Fruit("cherry", "red/white/black", true),
                new Fruit("banana", "yellow/green", true)
        };


        int iterationNum = 0;

        for (Fruit currentFruit : fruits) {
            System.out.println("Iteration: " + iterationNum);
            System.out.println("Fruit name: " + currentFruit.name);
            System.out.println("Fruit color: " + currentFruit.color);
            System.out.println("Fruit is tasty?: " + currentFruit.isTasty);
            iterationNum++;
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Iteration: " + i);
            System.out.println("Fruit name: " + fruits[i].name);
            System.out.println("Fruit color: " + fruits[i].color);
            System.out.println("Fruit is tasty?: " + fruits[i].isTasty);
        }

    }
}