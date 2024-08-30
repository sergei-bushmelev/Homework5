public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задание 2
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();

        //Задание 3
        int year = 2300;
        if (year % 4 == 0 && year > 1584 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        //Задание 4
        int deliveryDistance = 100;
        int oneDay = 1;
        int twoDay = 2;
        int threeDay = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + oneDay);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + twoDay);
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + threeDay);
        } else {
            System.out.println("Доставки нет ");
        }
        System.out.println();

        //Задание 5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
        }


    }
}