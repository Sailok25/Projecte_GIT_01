/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte_git_01;

/**
 *
 * @author alba.ayavil.dam_insa
 */
public class Class_Assignatura {
    private final String nom;
    private final String profe;
    private final int aula;
    
    //Constructor
    public Class_Assignatura(String nom, String profe, int aula)
    {
        this.nom = nom;
        this.profe = profe;
        this.aula = aula;
    }
    
    //Mètode per saludar
    public void informacio(){
        System.out.println("Informació: A l'aula" + aula + " es realitzara l'assignatura de  " + nom + " amb el professor " + profe);
    }
}
