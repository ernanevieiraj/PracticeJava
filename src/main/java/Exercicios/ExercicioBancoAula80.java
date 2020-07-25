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

    public ExercicioBancoAula80( int account, String name ) {
        this.account = account;
        this.name = name;
    }

    public ExercicioBancoAula80( int account, String name, double initialDeposit ) {
        this.account = account;
        this.name = name;
        addBalance(initialDeposit);
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

//    ExercicioBancoAula80 banco;
//        System.out.println("Enter account number: ");
//    int account = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter account holder: ");
//    String name = scanner.nextLine();
//        System.out.println("Enter initial deposit value (y/n)?");
//    char response = scanner.next().charAt(0);
//        if (response == 'y') {
//        System.out.println("Enter initial deposit value: ");
//        double initalDeposit = scanner.nextDouble();
//        banco = new ExercicioBancoAula80(account,name,initalDeposit);
//    }
//        else {
//        banco = new ExercicioBancoAula80(account,name);
//    }
//        System.out.println("Account data: " + banco);
//        System.out.println("Enter a deposit value: ");
//    double depositValue = scanner.nextDouble();
//        banco.addBalance(depositValue);
//        System.out.println("Updated account data: " + banco);
//        System.out.println("Enter a withdraw value: ");
//    double withdrawValue = scanner.nextDouble();
//        banco.removeBalance(withdrawValue);
//        System.out.println("Updated account data: " + banco);
}
