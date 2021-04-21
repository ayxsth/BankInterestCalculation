/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankDemo;

/**
 *
 * @author ayxst
 */
public class PrabhuBank extends Bank {
    
    PrabhuBank(){
        interest = 15;
    }
    
    @Override
    String printBank(){
        return "Your interest from Prabhu Bank is ";
    }
    
}
