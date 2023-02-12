package accounts;

public class CheckingAccount extends Account {
    public CheckingAccount (String name, long balance) {
        super.setName(name);
        super.setBalance(balance);
    }
    @Override
    public boolean pay(long amount) {
        if (getBalance() >= amount) {   //счёт не может быть меньше 0
            super.pay(amount);          //метод определения хватит ли денег на счёте для оплаты покупки
            return true;
        } else {
            System.out.println("Недостаточно средств, платёж отклонён");
            return false;
        }
    }
    @Override
    public String toString() {
        return "Тип : расчётный аккаунт\n" +
                super.toString();
    }
}






