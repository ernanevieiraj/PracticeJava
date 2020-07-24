package Exercicios;

public class ExercicioBancoAula80 {
    private int account;
    private String name;
    private double balance;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double money){
        balance += money;
    }

    public void removeBalance(double money){ balance -= money + 5;}

    public String toString(){
        return "Account "
                + account
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
