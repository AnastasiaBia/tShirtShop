/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bia_a
 */
public class SyntheticData {
    
      private ArrayList<Tshirt> tshirts = new ArrayList<>();
    
    public  ArrayList<Tshirt> makeManyTShirts (int i){
        for (int j = 0; j < i; j++) {
           tshirts.add(new Tshirt(Color.getRandomColor(), Size.getRandomSize(), Fabric.getRandomFabric()));
        
        }
        return tshirts;
        }
      }
    

