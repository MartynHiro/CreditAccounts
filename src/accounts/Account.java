package accounts;

public class Account {
    protected long balance;
    protected String name;

    public void setName(String name) {
        if (isLetter(name)) {
            this.name = name;
            //    System.out.println("Имя введено");
        } else {
            System.out.println("Не верный ввод");
        }
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public boolean pay(long amount) {
        this.balance -= amount;
        System.out.println("Платёж успешно выполнен");
        return true;
    }

    public boolean add(long amount) {
        this.balance += amount;
        System.out.println("Пополнение успешно зачислено");
        return true;
    }

    private static boolean isLetter(String text) {
        for (int i = 0; i < text.length(); i++) {                //проверка на символы во вводе
            if (Character.isAlphabetic(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Этот аккаунт называется: " + getName() + "\n" +
                "На его счету доступно: " + getBalance();
    }
}