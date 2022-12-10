public class Operations implements Interface{
    ATM atm = new ATM();
    @Override
    public void viewBalance() {

        System.out.println("Available Balance : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount<=atm.getBalance()){
            System.out.println(withdrawAmount+" Collect the Cash\n");
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();
        }
        else{
            System.out.println("Insufficient Balance !!\n");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount+" Deposited Successfully !!!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }
}
