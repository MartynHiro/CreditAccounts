package accounts;

public class CreditAccount extends Account {
    public CreditAccount(String name, long balance) {
        super.setName(name);
        if (balance <= 0) {
            super.setBalance(balance);
        } else {
            System.out.println("Баланс не может быть положительным");
        }
    }

    @Override
    public boolean add(long amount) {
        if (getBalance() <= 0 && (getBalance() + amount) <= 0) {
            super.add(amount);
            return true;
        } else {
            System.out.println("Невозможно пополнить так как кредитный счёт превысит 0 значение");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Тип : кредитный аккаунт\n" +
                super.toString();
    }
}
