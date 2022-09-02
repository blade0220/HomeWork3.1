import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        task_1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    public static void task_1() {
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем  с совершеннолетием!");
        }

        if (age < 18) {
            System.out.println("Извини, но тебе еще нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int age1 = 18;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек уже закончил школу и может поступать в Университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил Университет и ему пора искать первую работу");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");

        int total = 103;
        int seat = 61;
        int standingPlace = total - seat;
            System.out.println("Всего стоячих " + standingPlace + " мест");
        if (seat <= 60 ) {
            System.out.println("Еще сидячие места есть");
        } else if ((standingPlace + seat) <= 102 ) {
            System.out.println("Остались только стоячие места");
        }

        //if ((standingPlace + seat) <= 102 ) {
           // System.out.println("Еще есть стоячие места");
       // } else if (total > 102) {
            System.out.println("Мест больше нет");
        //}


    }

    public static void task4() {
        System.out.println("Задание 4");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем  с совершеннолетием!");
        } else
        {
            System.out.println("Извини, но тебе еще нужно немного подождать");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int age1 = 16;
        if (age1 >= 7 && age1 <18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек закончил школу и теперь поступает в Университет");
        } else if (age1 >= 24) {
            System.out.println("Человек окончил Университет и ему пора искать первую работу");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int total = 103;
        int seat = 61;
        int standingPlace = total - seat;
        System.out.println("Всего стоячих " + standingPlace + " мест");
        if (seat <= 60 ) {
            System.out.println("Еще сидячие места есть");
        } else if ((standingPlace + seat) <= 102 ) {
            System.out.println("Остались только стоячие места");
        }

        //if ((standingPlace + seat) <= 102 ) {
        // System.out.println("Еще есть стоячие места");
        // } else if (total > 102) {
        System.out.println("Мест больше нет");
        //}


    }
    public static void task7() {
        System.out.println("Задание 7");
    int canNotGoToShcool = 19;
   // int canGoToShcool = 18;
   // int canGoToUniversitet = 24;
   // int canGoToWork = 25;

        if (canNotGoToShcool >= 2 && canNotGoToShcool <= 6) {
            System.out.println("Если возраст человека равен " + canNotGoToShcool +"  лет, то ему нужно ходить в детский сад");
        }
        if (canNotGoToShcool >= 7 && canNotGoToShcool <= 18) {
            System.out.println("Если возраст человека равен " + canNotGoToShcool +" лет, то ему нужно ходить в школу");
        }
        if (canNotGoToShcool > 18 && canNotGoToShcool <= 24) {
            System.out.println("Если возраст человека равен " + canNotGoToShcool + " лет, то ему нужно ходить в Университет");
        } else if (canNotGoToShcool > 24) {
            System.out.println("Если возраст человека равен " + canNotGoToShcool + " лет, то ему нужно ходить на работу");
        }
    }
    public static void task8() {
        System.out.println("Задание 8");
    int childAge = 15;
        if (childAge < 5) {
            System.out.println("Ребенок не может кататься на карусели");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else if (childAge > 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
    }
    public static void task9() {
        System.out.println("Задание 9");
    int one = 55;
    int two = 60;
    int three = 25;
        if (one > two) {
            System.out.println(one + " больше чем " + two);
        } else if (one < two) {
            System.out.println(two + " больше чем " +one);
        }
        if (one > three) {
            System.out.println(one + " больше чем " + three);
        } else if (one < three) {
            System.out.println(three + " больше чем " +one);
        }
        if (three > two) {
            System.out.println(three + " больше чем " + two);
        } else if (three < two) {
            System.out.println(two + " больше чем " +three);
        }
    }
}