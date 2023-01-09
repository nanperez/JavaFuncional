/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Listas;
import java.util.Random;

/**
 *
 * @author naperez
 */
public class Aleatorios implements Listas{
    Random r = new Random();
    @Override
    public int crearLista() {
        return r.nextInt(1000);
    }
    
}
