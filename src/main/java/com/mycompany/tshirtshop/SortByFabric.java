/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop;

import java.util.Comparator;

/**
 *
 * @author bia_a
 */
public class SortByFabric implements Comparator<Tshirt>{
    
       @Override
    public int compare(Tshirt o1, Tshirt o2) {
         return o1.getF().value - o2.getF().value; 

    }
}
