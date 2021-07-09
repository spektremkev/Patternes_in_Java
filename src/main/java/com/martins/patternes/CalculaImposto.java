/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martins.patternes;

/**
 *
 * @author gabri
 */
public class CalculaImposto 
{ 
    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer)
    {       
            double icms = impostoQualquer.calcula(orcamento);
            System.out.println(icms); 
    }
}
    
