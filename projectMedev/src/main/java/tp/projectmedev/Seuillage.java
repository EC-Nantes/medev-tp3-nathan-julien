/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projectmedev;

import java.util.List;
import java.util.ArrayList;
import tp.projectmedev.GestionFichier;

/**
 *
 * @author julda
 */
public class Seuillage {

    /**
     *
     * @param img
     * @param D
     * @return
     */
    public List<List<Integer>> seuillage(Image img,int D){
        List<List<Integer>> hache=new List<List<Integer>>();
        int longueur=img.getHauteur();
        int largeur=img.getLargeur();
        List<List<Integer>> HD=img.getData();
        for(List<Integer> Ligne : HD){
            List<Integer> hacher=new ArrayList<Integer>();
            for(int pixel : Ligne){
                if(pixel>D){
                    hacher.add(1);
                }
                else{
                    hacher.add(0);
                }
            }
            hache.add(hacher);
        }
        return hache;
    }
}
