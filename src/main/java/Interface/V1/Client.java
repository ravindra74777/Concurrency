package Interface.V1;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String bankName =  scanner.nextLine();
        BankAPi bankAPi = null;
        if(bankName.equals("ICICIBankAPI")){
            bankAPi = new ICICIBankAPI();
        }else if(bankName.equals("YesBankAPI")){
            bankAPi = new YesBankAPI();
        }
        PhonePe phonePe = new PhonePe(bankAPi);
        phonePe.rechargeFastTag(100);

    }
}
