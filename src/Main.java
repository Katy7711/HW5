public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, Вам нужно немного подождать");
        }


        int age1 = 25;
        if (age1 >= 7)
            if (age1 <= 17) {
                System.out.println("Ребенок ходит в школу");
            }
        if (age1 >= 18)
            if (age1 <= 23) {
                System.out.println("Человек уже окончил школу и может отправляться в институт");
            }
        if (age1 >= 24) {
            System.out.println("Человек окончил институт и можно искать первую работу");
        }

        int person = 65;
        if (person >= 103) {
            System.out.println("Мест больше нет");
        }
        if (person <= 102)
            if (person >= 61) {
                System.out.println("Остались только стоячие места");
            }
        if (person < +60) {
            System.out.println("Свободны сидячие места");
        }


        int age2 = 16;
        if (age2 >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        int age3 = 17;
        if (age3 >= 24) {
            System.out.println("Человек уже закончил институт и можно искать новую работу");
        } else {
            System.out.println("Человек учится в школе или институте");
        }


        int place = 50;
        if (place <= 102) {
            System.out.println("В вагоне имеются места");
        } else {
            System.out.println("Мест нет");

        }

        int age4 = 33;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека " + age4 + " то он должен ходить в детский сад");
        }
        if (age4 >= 7 && age4 <= 18) {
            System.out.println("Если возраст человека " + age4 + " то он должен ходить в школу");
        }
        if (age4 > 18 && age4 < 24) {
            System.out.println("Если возраст человека " + age4 + " то он должен ходить в университет");
        } else {
            System.out.println("Если возраст человека " + age4 + " то он должен работать");

        }

        int childAge = 17;
        if (childAge < 5) {
            System.out.println("Ребенок не может кататься на каруселях");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Ребенок может кататься на каруселях только в сопровождении взрослого");
        } else {
            System.out.println("Человек может посещать карусели без сопровождения взрослых");
        }

        int one = 5;
        int two = 5;
        int free = 5;
        if (one > two && one > free) {
            System.out.println("Максимальное число " + one);
        }
        if (two > one && two > free) {
            System.out.println("Максимальное число " + two);
        }
        if (free > one && free > two) {
            System.out.println("Максимальное число " + free);
        }
        if (one == free && one == free) {
            System.out.println("Числа равны ");
        }

    }
}


