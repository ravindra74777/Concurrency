package Interface.V0;

public class PhonePe {
    YesBankAPI yesBankAPI;
    PhonePeLoan phonePeLoan;

    FastStagRecharge fastStagRecharge;
    PhonePe(){
        yesBankAPI = new YesBankAPI();
        phonePeLoan = new PhonePeLoan();
        fastStagRecharge = new FastStagRecharge();
    }
    boolean rechargeFastTag(int rechargeAmount){
        return fastStagRecharge.recharge(yesBankAPI, rechargeAmount);
    }
    boolean availLoan(double amount){
        return phonePeLoan.checkEligibility(yesBankAPI, amount);
    }
}
