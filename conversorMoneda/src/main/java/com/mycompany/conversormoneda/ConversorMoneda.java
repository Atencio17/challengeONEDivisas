/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversormoneda;

import javax.swing.JOptionPane;
import logica.Dolar;
import logica.Euro;
import logica.Libra;
import logica.Moneda;
import logica.Won;
import logica.Yen;

/**
 *
 * @author gusta
 */
public class ConversorMoneda {
    
     static String miMenu(){
        String[] monedas = { "USD", "EUR", "GBP", "JPY", "KRW"};
        String opcion = (String) JOptionPane.showInputDialog(null, "Seleecione una moneda", "Opciones",JOptionPane.QUESTION_MESSAGE,null, monedas,monedas[0]);    
    return opcion;
}
    
    public static void main(String[] args) {
        int op = 1;
        String moneda = "";
        double valor = 1;
        Moneda monedas = new Moneda(0,0);
        
        try {
            while(op > 0 && op < 3){
         op = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione tipo de conversión \n"
                 + "1. Peso colombiano a otra moneda \n "
                 + "2. Otra moneda a peso colombiano \n "
                 + "0. Salir"));
         
         if(op == 1){
            moneda = miMenu();
            valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el valor a convertir"));
            System.out.println(valor+" "+moneda);
            switch(moneda){
                case "USD":
                    Dolar dolar = new Dolar(0.00026,3912.98);
                    JOptionPane.showMessageDialog(null,valor+" Pesos Colombianos son "+monedas.revertirMoneda(valor, dolar)+" Dólar");
                    break;
                case "EUR":
                    Euro euro = new Euro(0.00023,4315.93);
                    JOptionPane.showMessageDialog(null,valor+" Pesos Colombianos son "+monedas.revertirMoneda(valor, euro)+" Euros");
                    break;
                case "GBP":
                    Libra libra = new Libra(0.00020,5028);
                    JOptionPane.showMessageDialog(null,valor+" Pesos Colombianos son "+monedas.revertirMoneda(valor, libra)+" Libras Esterlinas");
                    break;
                case "JPY":
                    Yen yen = new Yen(0.036,27.75);
                    JOptionPane.showMessageDialog(null,valor+" Pesos Colombianos Japonés son "+monedas.revertirMoneda(valor, yen)+" Yen");
                    break;
                case "KRW":
                    Won won = new Won(0.33,3.07);
                    JOptionPane.showMessageDialog(null,valor+" Pesos Colombianos sul-coreano son "+monedas.revertirMoneda(valor, won)+" Won");
                    break;
            }
         }else if(op == 2){
            moneda = miMenu();
            valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el valor a convertir"));
            System.out.println(valor+" "+moneda);
            switch(moneda){
                case "USD":
                    Dolar dolar = new Dolar(0.00026,3912.98);
                    JOptionPane.showMessageDialog(null,valor+" Dólar son "+monedas.convertirMoneda(valor, dolar)+" Pesos");
                    break;
                case "EUR":
                    Euro euro = new Euro(0.00023,4315.93);
                    JOptionPane.showMessageDialog(null,valor+" Euros son "+monedas.convertirMoneda(valor, euro)+" Pesos");
                    break;
                case "GBP":
                    Libra libra = new Libra(0.00020,5028);
                    JOptionPane.showMessageDialog(null,valor+" Libras Esterlinas son "+monedas.convertirMoneda(valor, libra)+" Pesos");
                    break;
                case "JPY":
                    Yen yen = new Yen(0.036,27.75);
                    JOptionPane.showMessageDialog(null,valor+" Yen Japonés son "+monedas.convertirMoneda(valor, yen)+" Pesos");
                    break;
                case "KRW":
                    Won won = new Won(0.33,3.07);
                    JOptionPane.showMessageDialog(null,valor+" Won sul-coreano son "+monedas.convertirMoneda(valor, won)+" Pesos");
                    break;
            }
         }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Valor invalido");
        }
        
    }
}

