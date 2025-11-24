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
    private List<List<Integer>> data;
    
    public Image(String nom, int largeur, int hauteur, List<List<Integer>> data){
        this.nom=nom;
        this.largeur=largeur;
        this.hauteur=hauteur;
        this.data=data;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public List<List<Integer>> getData() {
        return data;
    }

    public void setData(List<List<Integer>> data) {
        this.data = data;
    }
}
