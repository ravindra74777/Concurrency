package Interface.V0;

public class FastStagRecharge {
    boolean recharge(YesBankAPI yesBankAPI, double amount){
        if (amount <= yesBankAPI.checkBalance("")) {
            System.out.println("FastTag Recharge has done successfully");
            return true;
            }
         return false;
    }
}
