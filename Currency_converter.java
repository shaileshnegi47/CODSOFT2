/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
import java.text.*;

public class Currency_converter {
public static void main(String[]ar){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the amount in INR you want to convert:");
        double payment=sc.nextDouble();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String fPayment = nf.format(payment/90.24);
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        String uPayment = nf.format(payment /86.29);
        nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String iPayment = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String cPayment = nf.format(payment/11.91);
        
        System.out.println("US: " + uPayment);
        System.out.println("India: " + iPayment);
        System.out.println("China: " + cPayment);
        System.out.println("France: " + fPayment);
    }
}    
}
