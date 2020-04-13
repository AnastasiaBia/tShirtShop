/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop;

/**
 *
 * @author bia_a
 */
public class Cash implements Payment{

    @Override
    public void wayOfPayment() {
          System.out.println("Paid by cash. \n");
    }
    
}
