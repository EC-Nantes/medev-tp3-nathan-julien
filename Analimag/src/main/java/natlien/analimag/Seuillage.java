/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natlien.analimag;

import java.util.List;
import java.util.ArrayList;

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
    public int seuillage(GestionFichier img,int D){
        ArrayList<List<Integer>> hache=new ArrayList<List<Integer>>();
        int longueur=img.hauteur;
        int largeur=img.largeur;
        ArrayList<ArrayList<Integer>> HD=img.data;
        for(ArrayList<Integer> Ligne : HD){
            ArrayList<Integer> hacher=new ArrayList<Integer>();
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
    }
}
