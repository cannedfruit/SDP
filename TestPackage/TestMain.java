package TestPackage;


import com.google.common.collect.Ordering;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.lang.reflect.Array;
import java.util.*;

public class TestMain {
    public static void main(String[] args) {
//        try{
//            B b = new B();
//            System.out.println(b.max(13,29));
//        }catch(RuntimeException rte){
//            System.out.println(rte);
//        }finally{
//            System.out.println("In finally of main");
//        }
        // int d = 1/0;
//        B b1 = new B(2);
//        B b2 = new B(2);
//        C c = new C(5);
//        A a = new A(1);
//        List<A> l = new ArrayList<>();
//        l.add(b1);
//        l.add(b2);
//        l.add(c);
//        l.add(a);
//        l.forEach(System.out::println);
//    }
//    private int n ;
//    private TestMain ( int i ) {
//        this . n = i;
//    }
//     public static void main ( String [ ] args ) {
//         try {
//             TestMain obj = new TestMain ( 0 ) ;
//             obj . bMethod (14 , 0 ) ;
//         } catch ( ArithmeticException ex ) {
//            System . out . println ( " ArithmeticException c l a u se ") ;
//            throw ex ;
//         } catch ( Exception ex ) {
//                System . out . println ( "Caught " + ex . getMessage ( ) ) ;
//         } finally {
//            System.out.println(" Finished " );
//         }
//
//         System . out . println ( "The end . . . " ) ;
//     }
//
//    private void bMethod ( int a , int b) throws Exception {
//        try {
//            int c = a / b ;
//            System . out . println ( "The value of the v a r i a b l e c i s " + c ) ;
//            throw new Exception ( "Oh well ! " ) ;
//        } catch ( RuntimeException ex ) {
//            System . out . println ( "Exception : " + ex . getMessage ( ) ) ;
//            throw ex ;
//        } finally {
//            System . out . println ( "F i n a l l y c l a u se" ) ;
//        }
//
//    }

//    public static void main(String[] args) {
//        PreSchool<Integer> school = new PreSchool<>();
//        school.enroll(70);
//        school.enroll(33);
//        school.enroll(50);
//        school.enroll(60);
//        for(Integer i : school){
//            System.out.println(i);
//        }
//        "Fjdkls".chars()
//        .mapToObj(i -> (char)i)
//                .forEach(System.out::println);
//
//        String a = "hello";
//        String b = "hello";
//        System.out.println(replace("Jeve is fun", 'e', 'a'));
//        pr(a);

//        String str1 = "String 1";
//        String str2 = "String 2";
//        String str3 = "String 3";
//        ArrayList a1 = new ArrayList();
//        ArrayList a1a1 = new ArrayList();
//
//        a1.add(str1);
//        a1a1.add(a1);
//
//        a1.clear();
//        a1.add(str2);
//        a1a1.add(str3);
//        a1.add(str3);
//        a1a1.add(a1);
//        a1.add(str1);
//        a1a1.add(a1);
//
//        for(Object arrays : a1a1){
//            System.out.println(arrays);
//        }

//        Laptop a = new Laptop("Dell", 1213.99);
//        Laptop b = new Laptop("Sony", 1610.99);
//        Laptop c = new Laptop("Asus", 300.45);
//        Laptop d = new Laptop("IBM", 1398.99);
//        Laptop e = new Laptop("Toshiba", 1560.99);

//        ArrayList<Laptop> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//        list.add(c);
//        list.add(d);
//        list.add(e);
        //list.stream().sorted().forEach(System.out::println);
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(0);
//        list.add(2);
//        permSort(list, 3);
//        System.out.println(null instanceof Laptop);
//        Diva diva = new Diva("bey", 32);
//        System.out.println(diva);
//        int[] a = {2,4,5,6,1};
//        System.out.println(Arrays.toString(a));
//        qsort(0,4,a);
//        System.out.println(Arrays.toString(a));
    }

    static String replace(String str, char a, char b) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                newString += b;
            } else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }

    static void pr(String s) {
        System.out.println(s);
        if (s.length() > 1) {
            pr(s.substring(0, s.length() - 1));
        }
        System.out.println(s);
    }

    private static List permSort(List a, int n) {
        if (Ordering.natural().isOrdered(a)) {
            System.out.println("FOUND IT! " + a);
            return a;
        } else if (n == 1) {
            System.out.println(a.toString());
        } else {
            for (int i = 0; i < n; i++) {
                Collections.swap(a, i, n - 1);
                permSort(a, n - 1);
                Collections.swap(a, i, n - 1);
            }
        }
        return a;
    }

    private static void qsort(int low, int upp, int[] arr) {
        if (low >= upp) return;
        int t = arr[low];
        int i = low;
        int j = upp + 1;
        while (true) {
            do {
                i++;
            } while (i <= upp && arr[i] < t);
            do {
                j--;
            } while (arr[j] > t);
            if (i > j) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int temp2 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp2;
        qsort(low, j - 1, arr);
        qsort(j + 1, upp, arr);
    }
}
