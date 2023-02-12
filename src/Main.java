import accounts.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rate = Switch.setRate(scanner);//выводит на экран меню выбора создания аккаунта и возвращает наш выбор

        Account account = Switch.switchRate(rate);//создает нужный тип аккаунта исходя из нашего выбора
        
        if (account != null) { //если возвращается null, то пользователь прекратил работу, до создания аккаунта
            Switch.switchOperation(account);//меню операций с аккаунтом
            System.out.println(account);//вывод информации по аккаунту, по окончанию всех действий с ним
        } else {
            System.out.println("Работа окончена, до новых встреч");//заканчиваем без созданного аккаунта
        }
    }
}

