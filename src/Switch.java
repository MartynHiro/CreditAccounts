import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

import java.util.Scanner;

public class Switch {
    public static int setRate(Scanner scanner) { //метод выведения меню выбора аккаунта
        System.out.println("""
                Введите номер счёта который хотите создать:
                1 - Накопительный счёт
                2 - Расчётный счёт
                3 - Кредитный счёт
                4 - Закончить работу""");
        return scanner.nextInt();
    }
    public static void setOperation() { //метод выведения меню выбора операции
        System.out.println("""
                Введите номер операции
                1 - Пополнение баланса
                2 - Покупка
                3 - Закончить работу""");
    }
    public static String  setName(Scanner scanner) { //метод выбора имени аккаунта
        System.out.println("Введите Имя");
        return scanner.next();
    }
    public static long setBalance(Scanner scanner) { //метод выбора баланса аккаунта
        System.out.println("Введите баланс");
        return scanner.nextInt();
    }
    public static long setLimit(Scanner scanner) { //метод выбора лимита аккаунта
        System.out.println("Введите лимит");
        return scanner.nextInt();
    }
    public static Account switchRate(int rate) { //метод создания аккаунта
        if (rate == 1) {
            Scanner scanner = new Scanner(System.in);
            String name = setName(scanner);
            long balance = setBalance(scanner);
            long limit = setLimit(scanner);
            return new SavingsAccount(name, balance, limit);
        } else if (rate == 2) {
            Scanner scanner = new Scanner(System.in);
            String name = setName(scanner);
            long balance = setBalance(scanner);
            return new CheckingAccount(name, balance);
        } else if (rate == 3) {
            Scanner scanner = new Scanner(System.in);
            String name = setName(scanner);
            long balance = setBalance(scanner);
            return new CreditAccount(name, balance);
        } else if (rate == 4) {
            return null;
        } else {
            return null;
        }
    }
    public static void switchOperation(Account account) { //метод проведения операций
        while (true) {
            Scanner scanner = new Scanner(System.in);
            setOperation();
            int operation = scanner.nextInt();
            if (operation == 3) {
                System.out.println("Работа окончена");
                break;
            }
            switch (operation) {
                case 1 -> {
                    System.out.println("Введите сумму пополнения");
                    int amountAdd = scanner.nextInt();
                    account.add(amountAdd);
                }
                case 2 -> {
                    System.out.println("Введите трату");
                    int amountPay = scanner.nextInt();
                    account.pay(amountPay);
                }
            }
        }
    }
}
