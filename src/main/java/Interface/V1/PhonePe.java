package Interface.V1;

public class PhonePe {
    BankAPi bankAPi;
    PhonePeLoan phonePeLoan;
    FastStagRecharge fastStagRecharge;
    PhonePe(BankAPi bankAPi){
        this.bankAPi = bankAPi;
        phonePeLoan = new PhonePeLoan();
        fastStagRecharge = new FastStagRecharge();
    }
    boolean rechargeFastTag(int rechargeAmount){
        return fastStagRecharge.recharge(bankAPi, rechargeAmount);
    }
    boolean availLoan(double amount){
        return phonePeLoan.checkEligibility(bankAPi, amount);
    }
}
