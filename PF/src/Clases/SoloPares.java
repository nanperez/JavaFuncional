/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Predicado;

/**
 *
 * @author naperez
 */
public class SoloPares implements Predicado{

    @Override
    public boolean eval(Integer valor) {
        return valor % 2 == 0;
    }
    
}
