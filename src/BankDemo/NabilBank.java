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
public class NabilBank extends Bank {
    
    NabilBank(){
            interest = 5;
    }
    
    @Override
    String printBank(){
        return "Your interest from Nabil Bank is ";
    }
    
}

