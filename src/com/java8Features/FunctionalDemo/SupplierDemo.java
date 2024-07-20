package com.java8Features.FunctionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// background of Supplier Interface.
//public class SupplierDemo implements Supplier<String> {
//
//    @Override
//    public String get() {
//        return "Hello World";
//    }
//    public static void main(String[] args) {
//        SupplierDemo supplierDemo = new SupplierDemo();
//        System.out.println(supplierDemo.get());
//    }
//}

public class SupplierDemo {
    public static void main(String[] args) {
//        supplier demo using lambda expression same as above but with lambda.
        Supplier<String> supplier = () -> {
            return "Hello World";
        };
        System.out.println(supplier.get());

        List<String> list = Arrays.asList();
//        you can see orElseGet method is taking supplier as arguement.
        list.stream().findAny().orElseGet(supplier);
    }
}
