
package BankDemo;

import java.util.Scanner;

public abstract class BankDemo extends Bank{
    
    public static void main(String[] args) {
        int bank;
        double principle;
        double time;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the principle: ");
        principle = in.nextDouble();
        
        System.out.println("Enter the time: ");
        time = in.nextDouble();
        
        System.out.println("============================");
        System.out.println("| 1. Prabhu Bank            |");
        System.out.println("| 2. Rastriya Banijya Bank  |");
        System.out.println("| 3. Nabil Bank             |");
        System.out.println("============================");
        bank = in.nextInt();
        
        Bank obj;
        if (bank == 1){
            obj = new PrabhuBank();
            System.out.println(obj.printBank() + (principle*time*obj.interest)/100);
        } else if (bank == 2){
            obj = new RastriyaBanijyaBank();
             System.out.println(obj.printBank() + (principle*time*obj.interest)/100);
        } else if (bank == 3){
            obj = new NabilBank();
             System.out.println(obj.printBank() + (principle*time*obj.interest)/100);
        } else {
            System.out.println("Invalid option!");
        }
    }
    
    
}
