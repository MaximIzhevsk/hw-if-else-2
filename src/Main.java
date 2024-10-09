public class Main {
    public static void main(String[] args) {

        //задача 1

        int clientOS = 1;
//        switch (clientOS) {
//            case 0:
//                System.out.println("Установите версию приложения для iOS по ссылке");
//                break;
//            case 1:
//                System.out.println("Установите версию приложения для Android по ссылке");
//                break;
//            default:
//                System.out.println("Неправильно указана операционная система");
//        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
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
        String OS = clientOS == 0 ? "iOS " : "Android ";
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

        //задача 4

        int deliveryDistance = 101;
        int numbersOfDays = 1;
        String messageDays = "Потребуется дней: ";

//        if (deliveryDistance <= 20) {
//            System.out.println(messageDays + numbersOfDays);
//        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
//            System.out.println(messageDays + (numbersOfDays + 1));
//        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
//            System.out.println(messageDays + (numbersOfDays + 2));
//        } else {
//            System.out.println("Доставки нет");
//        }

        if (deliveryDistance <= 100) {
            if (deliveryDistance <= 20) {
            System.out.println(messageDays + numbersOfDays);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println(messageDays + (numbersOfDays + 1));
            } else {
                System.out.println(messageDays + (numbersOfDays + 2));
            }
        } else {
            System.out.println("Доставки нет");
        }


        System.out.println();

        //задача 5

        int monthNumber = 12;
        String messageSeason = " принадлежит к сезону ";
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц (он же январь)" + messageSeason + "зима");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц (он же февраль)" + messageSeason + "зима");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц (он же март)" + messageSeason + "весна");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц (он же апрель)" + messageSeason + "весна");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц (он же май)" + messageSeason + "весна");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц (он же июнь)" + messageSeason + "лето");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц (он же июль)" + messageSeason + "лето");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц (он же август)" + messageSeason + "лето");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц (он же сентябрь)" + messageSeason + "осень");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц (он же октябрь)" + messageSeason + "осень");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц (он же ноябрь)" + messageSeason + "осень");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц (он же декабрь)" + messageSeason + "зима");
                break;
            default:
                System.out.println("Номер месяца больше 12");
        }


    }
}