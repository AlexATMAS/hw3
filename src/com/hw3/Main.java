package com.hw3;

import java.util.Objects;

public class Main
{

    public static void main(String[] args)
    {
    ////Задание 1 - 2; вариант 1;
        int clientOS = 1; // 0 — iOS, 1 — Android;
        int clientDeviceYear = 2022;

            if (clientOS==0 && clientDeviceYear >= 2015)
            {
                System.out.println("Установите новую версию приложения для iOS по ссылке:" + "ссылка".toUpperCase());
            }else if (clientOS==0 && clientDeviceYear < 2015)
            {
                System.out.println("Установите старую версию приложения для iOS по ссылке:"+
                        "ссылка".toUpperCase());
            }else if (clientOS==1 && clientDeviceYear >= 2015)
            {
                System.out.println("Установите новую версию приложения для Android по ссылке:" +
                        "ссылка".toUpperCase());
            }else
                System.out.println("Установите старую версию приложения для Android по ссылке:" +
                        "ссылка".toUpperCase());


    ////Задание 1 - 2; вариант 2; (клиент сам выберет =) );
        /*int clientOS2 = 1; // 0 — iOS, 1 — Android;
        int clientDeviceYear2 = 2012;
        String ios = "сслыка ios"; // ссылка на ios
        String andr = "ссылка android"; // ссылка на ios


        if (clientOS2==0 && clientDeviceYear2 >= 2015 || clientOS2==1 && clientDeviceYear2 >= 2015)
        {
            System.out.println("Для скачивания новой версии приложения ios нажмите на " + ios.toUpperCase() +
                    "\nДля скачивания новой версии приложения android нажмите на " + andr.toUpperCase());
        }else
            System.out.println("Для скачивания старой версии приложения ios нажмите на " + ios.toUpperCase() +
                    "\nДля скачивания старой версии приложения android нажмите на " + andr.toUpperCase());*/

    ////Задание 3

        int year = 2022;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println("« " + year + " год является високосным».");
        } else
            System.out.println("« " + year + " год не является високосным».");

    ////Задание 4

        float deliveryDistance = 45.4f;
        int day;

        if (deliveryDistance < 20 && deliveryDistance != 0) //Доставка в пределах 20 км занимает сутки
        {
            day = 1;
            System.out.println("Доставим Вашу карту через " + day + " день!");

        }else if (deliveryDistance >= 20 && deliveryDistance < 60 ) //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        {
            day = 2;
            System.out.println("Доставим Вашу карту через " + day + " дня!");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        {
            day = 3;
            System.out.println("Доставим Вашу карту через " + day + " дня!");
        } else
            System.out.println("Разве карта уже не у Вас ?");

    ////Задание 5

        int monthNumber =  9;
        switch (monthNumber)
        {
            case 1:     //январь
                System.out.println("1 месяц (Январь),принадлежит к сезону \"ЗИМА\".");
                break;
            case 2:     //февраль
                System.out.println("2 месяц (Февраль),принадлежит к сезону \"ЗИМА\".");
                break;
            case 3:     //март
                System.out.println("3 месяц (Март),принадлежит к сезону \"ВЕСНА\".");
                break;
            case 4:     //апрель
                System.out.println("3 месяц (Апрель),принадлежит к сезону \"ВЕСНА\".");
                break;
            case 5:     //май
                System.out.println("4 месяц (Май),принадлежит к сезону \"ВЕСНА\".");
                break;
            case 6:     //июнь
                System.out.println("6 месяц (Июнь),принадлежит к сезону \"ЛЕТО\".");
                break;
            case 7:     //июль
                System.out.println("7 месяц (Июль),принадлежит к сезону \"ЛЕТО\".");
                break;
            case 8:     //август
                System.out.println("8 месяц (Август),принадлежит к сезону \"ЛЕТО\".");
                break;
            case 9:     //сентябрь
                System.out.println("9 месяц (Сентябрь),принадлежит к сезону \"ОСЕНЬ\".");
                break;
            case 10:    //октябрь
                System.out.println("10 месяц (Октябрь),принадлежит к сезону \"ОСЕНЬ\".");
                break;
            case 11:    //ноябрь
                System.out.println("11 месяц (Ноябрь),принадлежит к сезону \"ОСЕНЬ\".");
                break;
            case 12:    //декарь
                System.out.println("12 месяц (Декабрь),принадлежит к сезону \"ЗИМА\".");
                break;
            default:
                System.out.println("Других месяцев нет!!!");
        }

    }
}
