package org.softwire.training.p3_declaring_variables;

public class L6_VariableScope {

    // ???????????????
    // Will this work?
    // ???????????????
    private static void calculateDiscountOne(int price) { //no as discount is not declared
//
//        if (price > 100) {
//            int discount = 20;
//        }
//        else {
//            int discount = 5;
//        }
//
//        System.out.println(price);
//        System.out.println(discount);
    }


    // ???????????????
    // Will this work?
    // ???????????????
    private static void calculateDiscountTwo(int price) {//yes as discount initialised

//        int discount;
//        if (price > 100) {
//            discount = 20;
//        }
//        else {
//            discount = 5;
//        }
//
//        System.out.println(price);
//        System.out.println(discount);
    }


    // ???????????????
    // Will this work?
    // ???????????????
    private static void calculateDiscountThree(int price) { //discount is declared as int 3 times will error

//        int discount;
//        if (price > 100) {
//            int discount = 20;
//        }
//        else {
//            int discount = 5;
//        }
//
//        System.out.println(price);
//        System.out.println(discount);
    }

}


// ???????????????
// Will this work?
// ???????????????
class AnotherClass {//yes as declared as field outside the mehtid

    int discount;

    void calculateDiscountThree(int price) {
        if (price > 100) {
            discount = 20;
        }
        else {
            discount = 5;
        }

        System.out.println(price);
        System.out.println(discount);
    }

}
