/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author FAIZ
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = Matematika.perkalian(8, 7);
        System.out.println("Hasil perkalian dari X dan Y adalah "+a);
        double b = Matematika.perkalian(8, 10.2);
        System.out.println("Hasil Perkalian dari X dan Y adalah "+b);
    }
    
}
