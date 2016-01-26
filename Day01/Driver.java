package Day01;

/**
 * SDP Day 1
 * @author Sarah on 1/8/2016.
 */
public class Driver {
    public static void main(String[] args) {
        //1. generics are used to introduce two different types into a function
        //2. generics enable programmers to implement generic algorithms
        // programmers can implement generic algorithms that work on collections of
        // different types, that can be customised, and are type-safe and easier to read

        // (by using generics, accessing the objects in the list will allow us to use
        //the class' methods
        //it will also restrict what can be added to the list so that it is only of that class)
        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();

        /*Class baCls = BankAccount.class;*/
        //6. all objects defined correctly with dynamic casts
        // generics is solely a compile-time effect due to type erasure
        Class<BankAccount> baCls = BankAccount.class;
        try {
            //3. because myAccount is cast as an object, it cannot see the D1.Day1.BankAccount methods
            /*Object myAccount = baCls.newInstance();*/

            //if instead it's cast as a D1.Day1.BankAccount, it can access these methods
            //4. However, the compiler does not know that newInstance is returning a D1.Day1.BankAccount
            //and it still is not recognised as a D1.Day1.BankAccount
            /*D1.Day1.BankAccount myAccount =  baCls.newInstance();*/

            //5. Cast operation is performed by JVM which is why it is called a dynamic cast
            // it is not safe to perform the comparison using a static cast due to location where the cast is performed
            BankAccount myAccount = (BankAccount) baCls.newInstance();
            aStorage.setValue(myAccount);
            // Deposit
            myAccount.deposit(15);
        } catch (InstantiationException e) {
            // ...
        } catch (IllegalAccessException e) {
            System.out.println("I vant to svuck your blawd");
        }

        // 7. generics enables addition compile time constraints
        //to be applied to the types but, of course, this does not apply to runtime
        System.out.println( aStorage.getValue().showBalance() );
        if( aStorage.getClass() == sStorage.getClass() ) {
            System.out.println( "EQUAL" );
        } else {
            System.out.println( "NOT EQUAL" );
        }
    }
}