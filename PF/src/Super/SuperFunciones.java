/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Super;

import Interfaces.Listas;
import Interfaces.Predicado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naperez
 */
public class SuperFunciones {
    
    public static List<Integer> filtrar(List<Integer> numeros,Predicado p){
        List<Integer> res = new ArrayList<>();
        for(Integer num:numeros){
            if (p.eval(num)){
                res.add(num);
            }
        }
        return res;
    }

    public static List<Integer> crearLista(int n, Listas l) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numeros.add(l.crearLista());
        }
                
        
        return numeros;
        
    }
    
}
