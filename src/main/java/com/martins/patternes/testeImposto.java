package com.martins.patternes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class testeImposto {
     public static void main(String[] args) {
              Imposto iss = new ISS();
              Imposto icms = new ICMS();

              Orcamento orcamento = new Orcamento(500.0);

          CalculaImposto calcula = new CalculaImposto();

          // Calculando o ISS
          calcula.realizaCalculo(orcamento, iss);

          // Calculando o ICMS        
          calcula.realizaCalculo(orcamento, icms);
          }

 
}
