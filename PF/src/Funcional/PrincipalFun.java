/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcional;

import Imperativo.PrincipalImp;
import Clases.Aleatorios;
import Clases.SoloPares;
import Super.SuperFunciones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naperez
 */
public class PrincipalFun {
    public static void main(String[] args) {
        new PrincipalImp();
        // ACTIVIDADES BÁSICAS
        // 1. Crear una lista de valores enteros
        //List<Integer> numeros = crearLista();
        List<Integer> lista = SuperFunciones.crearLista(10, new Aleatorios());
        System.out.println(lista);
        // 2. Filtrar los valores pares
       // List<Integer> pares = filtrarPares(numeros);
        // Version funcional
        //List<Integer> pares2 = SuperFunciones.filtrar(numeros, new SoloPares());
       // System.out.println(pares);
       // System.out.println(pares2);
        // 3. De los valores filtrados, elevarlos al cuadrado
       // List<Integer> cuadrado = elevarCuadrado(pares);
       // System.out.println(cuadrado);
        // 4. Mostrar la lista de valores elavados al cuadrado
        // 5. Obtener la suma de los valores elevados al cuadrado
        //int sumaTotal = sumarLista(cuadrado);
        
    }
private static List<Integer> crearLista() {
        return List.of(10,52,6,7,8,2,4,13,11,40);
        
    }

    private static List<Integer> filtrarPares(List<Integer> numeros) {
       List<Integer> pares = new ArrayList<>();
       
       for(Integer n:numeros){
           if (n % 2 == 0) {
               pares.add(n);
           }
       }
       return pares;
    }

    private static List<Integer> elevarCuadrado(List<Integer> pares) {
       List<Integer> resultado = new ArrayList<>();
       
       for(Integer n:pares){
           resultado.add(n*n);
           }
       return resultado;
       }

    private static int sumarLista(List<Integer> cuadrado) {
        int suma = 0;
        for(Integer i:cuadrado){
            suma = suma+i;
        }
        return suma;
        
    }
   

}
