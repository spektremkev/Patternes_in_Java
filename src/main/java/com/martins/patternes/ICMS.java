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
public class ICMS implements Imposto
{
    
    public double calcula(Orcamento orcamento)
    {
        return orcamento.getValor() * 0.1;
    }
}
