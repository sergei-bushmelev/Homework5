public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание 1
        int clientOS = 2;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введите 1 или 2");
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
        int deliveryDistance = 80;
        int oneDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + oneDay);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (oneDay + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (oneDay + 2));
        } else {
            System.out.println("Доставки нет ");
        }
        System.out.println();

        //Задание 5
        int monthNumber = 5;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("нет такого месяца");
        }


    }
}