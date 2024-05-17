public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задание 2");
        int temp = 10;
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println("Задание 3");
        int speed = 90;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }

        System.out.println("Задание 4");
        int ageHuman = 17;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад.");
        } else if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
        } else if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно учиться в университете.");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему пора ходить на работу.");
        }

        System.out.println("Задание 5");
        int ageKid = 14;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему нельзя кататься на аттракционе");
        } else if (ageKid >= 5 && ageKid <= 14) {
            System.out.println("Если возраст ребёнка равен " + ageKid + ", то ему можно кататься на аттракционе только в сопровождении взрослого.");
        } else if (ageKid > 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задание 6");

        // Если мы берём в учёт то, что люди перманентно занимают сначала сидячие, а только потом стоячие, то получаем следующее:
        int carriageCapacity = 102;
        int seatPlace = 60;
        int passengers = 100;
        boolean seatsIsEmpty = passengers <= seatPlace;
        boolean standingIsEmpty = passengers > seatPlace && passengers < carriageCapacity;
        if (seatsIsEmpty) {
            System.out.println("В вагоне остались и сидячие, и стоячие места");
        } else if (standingIsEmpty) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("Вагон полностью забит. Мест не осталось");
        }

        System.out.println("Задание 7");
        int one = 162;
        int two = 11;
        int three = 256;
        if (one > two && one > three) {
            System.out.println(one);
        }
        if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}