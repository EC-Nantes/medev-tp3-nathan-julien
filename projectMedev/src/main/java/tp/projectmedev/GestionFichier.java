/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projectmedev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author nathan
 */
public class GestionFichier {
    private String source;
    private Image image;
    private int largeur;
    private int hauteur;
    
    public GestionFichier(String nom){
        this.source=nom;
        ArrayList<List> data = new ArrayList<List>();
        BufferedReader fichier;
        String ligne;
        ArrayList<Integer> liste =new ArrayList<>();
        String delimiteurs=" ,.;";
        try {
            fichier = new BufferedReader(new FileReader(this.source));
            ligne=fichier.readLine();//skip le format ASCII
            ligne=fichier.readLine();//skip le commentaire
            ligne=fichier.readLine();
            StringTokenizer tokenizer=new StringTokenizer(ligne, delimiteurs);
            if (tokenizer.hasMoreTokens()){
                largeur=Integer.parseInt(tokenizer.nextToken());
            }
            if (tokenizer.hasMoreTokens()){
                hauteur=Integer.parseInt(tokenizer.nextToken());
            }
            ligne=fichier.readLine();//skip la valeur max (qui est toujours 255)
            int i=0;
            liste = new ArrayList<Integer>();
            while (ligne!=null){
                ligne=fichier.readLine();
                tokenizer=new StringTokenizer(ligne, delimiteurs);
                while(tokenizer.hasMoreTokens()){
                    liste.add(Integer.parseInt(tokenizer.nextToken()));
                    i++;
                    if (i==largeur){
                        data.add(liste);
                        liste = new ArrayList<Integer>();
                        i=0;                        
                    }
                }
            }
            fichier.close();
    }catch (IOException ex) {
            System.getLogger("problème lors du chargement du fichier").log(System.Logger.Level.ERROR, (String) null, ex);
        }
        finally {
        this.image= new Image(this.source, this.largeur, this.hauteur, data);
        }
        
}}
