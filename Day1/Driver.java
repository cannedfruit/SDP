package Day1;

/**
 * SDP Day 1
 * @author Sarah on 1/8/2016.
 */
public class Driver {
    public static void main(String[] args) {
        //by using generics, accessing the objects in the list will allow us to use
        //the class' methods
        //it will also restrict what can be added to the list so that it is only of that class
        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();

        Class baCls = BankAccount.class;
        try {
            //because myAccount is cast as an object, it cannot see the D1.Day1.BankAccount methods
            /*Object myAccount = baCls.newInstance();*/
            //if instead it's cast as a D1.Day1.BankAccount, it can access these methods
            //However, the compiler does not know that newInstance is returning a D1.Day1.BankAccount
            //and it still is not recognised as a D1.Day1.BankAccount
            /*D1.Day1.BankAccount myAccount =  baCls.newInstance();*/
            BankAccount myAccount = (BankAccount) baCls.newInstance();
            aStorage.setValue(myAccount);
            // Deposit
            myAccount.deposit(15);
        }
        catch ( InstantiationException e ) {
            // ...
        }
        catch ( IllegalAccessException e ) {
            // ...
        }
    }
}