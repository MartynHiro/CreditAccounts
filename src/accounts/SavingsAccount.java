package accounts;

public class SavingsAccount extends Account {
    private long limit;

    public SavingsAccount(String name, long balance, long limit) {
        super.setName(name);
        super.setBalance(balance);
        if (limit >= 0) {
            this.limit = limit;
        } else {
            System.out.println("Вы не можете установить минусовой лимит");
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= (getBalance() - limit)) {
            super.pay(amount);
            return true;
        } else {
            System.out.println("Недостаточно средств, платёж отклонён");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Тип : накопительный аккаунт\n" +
                super.toString();
    }
}
