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
public class RastriyaBanijyaBank extends Bank {
    
    RastriyaBanijyaBank(){
        interest = 10;
    }
    
     @Override
    String printBank(){
        return "Your interest from Rastriya Banijya Bank is ";
    }
    
}
