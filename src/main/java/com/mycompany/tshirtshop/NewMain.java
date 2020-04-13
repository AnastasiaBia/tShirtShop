/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package com.mycompany.tshirtshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author bia_a
 */



public class NewMain {
    

    public static void main(String[] args) {
        // TODO code application logic here
        
   
        SyntheticData s1 = new SyntheticData();
        
        
        ArrayList <Tshirt> ar = s1.makeManyTShirts(5);
        for (Tshirt tshirt : ar) {
            System.out.println(tshirt);
            
        }

        System.out.println("--------------------");
        Collections.sort(ar, new SortBySize());
        for (Tshirt tshirt : ar) {
            System.out.println(tshirt);
            
        }
        System.out.println("--------------------");
        Collections.sort(ar, new SortBySize().reversed());
        for (Tshirt tshirt : ar) {
            System.out.println(tshirt);
            
        }
       
        
        System.out.println("--------------------");
        Collections.sort(ar, new SortByFabric());
        for (Tshirt tshirt : ar) {
            System.out.println(tshirt);
            
        }
        System.out.println("--------------------");
        Collections.sort(ar, new SortByFabric().reversed());
        for (Tshirt tshirt : ar) {
            System.out.println(tshirt);
            
      
        }
        
        
        System.out.println("--------------------");
        Collections.sort(ar, new SortByColor());
        for (Tshirt tshirt : ar) {
            System.out.println(tshirt);
            
        }
        System.out.println("--------------------");
        Collections.sort(ar, new SortByColor().reversed());
        for (Tshirt tshirt : ar) {
            System.out.println(tshirt);
            
        }
    }
    
}
