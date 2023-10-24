import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Podaj numer konta");
//        Scanner scaner = new Scanner(System.in);
//        String accountNumber = loadString(scaner);
//        System.out.println("Podaj balans konta");
//        double accountBalance = scaner.nextDouble();
//        BankAccount bankAccount = new BankAccount(accountNumber, accountBalance);

        BankAccount bankAccount = new BankAccount("11112222333344445555666677", 20000.0);
        System.out.println("Numer konta : "+bankAccount.getAccountNumber());
        System.out.println("Balans konta : "+bankAccount.getAccountBalance());

        bankAccount.deposit(500);
        System.out.println("Cena po wpłacie : "+bankAccount.getAccountBalance());
        bankAccount.withdraw(500);
        System.out.println("Cena po wypłacie : "+bankAccount.getAccountBalance());

        System.out.println("------------------------------------------------");
        double amountDeposit = 1000;
        double locatePercent = 10;
        int locateTime = 3;
        LocalTime timestart = LocalTime.now();
        System.out.println(timestart);
        LocalTime timeend = timestart.plusMinutes(locateTime);
        System.out.println(timeend);
        TermDeposit termDeposit = new TermDeposit(amountDeposit, locatePercent, locateTime);
        if(LocalTime.now().isBefore(timeend)){
            System.out.println("Lokata sie jeszcze nie zakonczyla");
            System.out.println("Wartość konta wynosi: "+bankAccount.getAccountBalance());
        }
        else {
            bankAccount.setAccountBalance(bankAccount.getAccountBalance()+termDeposit.locateResult());
            System.out.println("Stan konta po zakonczeniu lokaty terminowej wynosi: "+bankAccount.getAccountBalance());
        }
        System.out.println(termDeposit.locateResult());
    }
public static String loadString (Scanner scanner){
        String accountNumber = scanner.nextLine();
        boolean isNumber = true;
        for (int i = 0; i < accountNumber.length(); i++){
            if (accountNumber.charAt(i) < 48 || accountNumber.charAt(i) > 57){
                System.out.println("Nr konta nie sklada sie z cyfr");
                isNumber = false;
                break;
            }
        }
        if ( accountNumber.length() == 26 && isNumber){
            return accountNumber;
        }
        else {
            System.out.println("Nr konta nie sklada sie z cyfr lub nie ma 26 znakow");
            return loadString(scanner);
        }
    }
}