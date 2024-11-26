package AbstractClasses;

import Interface.V1.BankAPi;

public class Student extends User implements BankAPi {

    private String batchName;
    private final int x;

    Student(){
        x = 10;
    }
    @Override
    public void addProfile() {
        System.out.println("added profile ");
    }
    @Override
    public int balanceCheck(String accountNo) {
        return 0;
    }
}
