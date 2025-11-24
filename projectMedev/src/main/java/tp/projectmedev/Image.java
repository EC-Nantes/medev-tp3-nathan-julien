/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projectmedev;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nathan
 */
public class Image {
    private String nom;
    private int largeur;
    private int hauteur;
    private ArrayList<ArrayList<int>> data;
    
    public Image(String nom, int largeur, int hauteur, List data){
        this.nom=nom;
        this.largeur=largeur;
        this.hauteur=hauteur;
        this.data=data;
    }
}
