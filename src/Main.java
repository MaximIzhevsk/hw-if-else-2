public class Main {
    public static void main(String[] args) {

        //задача 1

        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неправильно указана операционная система");
        }
        System.out.println();

        //задача 2
        //тут хотел обойтись одним print и без вложенных if-ов, но возникла проблема с областью
        //видимости переменной message, знаний пока не хватило, поэтому получилась абракадабра

        int clientDeviceYear = 2015;
        String messageStart = "Установите ";
        String messageLight = "облегченную ";
        String messageEnd = "версию приложения для ";
        String OS = clientOS == 0? "iOS " : "Android ";
        String messageLink = "по ссылке";

        if (clientOS == 0 && clientDeviceYear < 2015) {
            String message = messageStart + messageLight + messageEnd + OS + messageLink;
            System.out.println(message);
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            String message = messageStart + messageEnd + OS + messageLink;
            System.out.println(message);
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            String message = messageStart + messageLight + messageEnd + OS + messageLink;
            System.out.println(message);
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            String message = messageStart + messageEnd + OS + messageLink;
            System.out.println(message);
        } else {
            System.out.println("Введены неверные данные");
        }
        System.out.println();

        //задача 3

        int year = 2021;

        boolean isLeapYear = (year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year >= 1584 && year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();





    }
}