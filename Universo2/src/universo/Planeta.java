package universo;

import java.util.ArrayList;

public class Planeta extends Astro{

    // Atributos
    private double distSol;
    private double orbSol;
    private boolean tieneSat;
    private ArrayList<Satelite> satelites;

    // Constructor
    Planeta(String nombre, double radio, double rotEje, double masa, double tempMedia, double gravedad, double distSol, double orbSol, boolean tieneSat, ArrayList<Satelite> satelites) {
        super(nombre, radio, rotEje, masa, tempMedia, gravedad);
        this.distSol = distSol;
        this.orbSol = orbSol;
        this.tieneSat = tieneSat;
        this.satelites = satelites;
    }

    // Constructor sin satelite (puede aÃ±adirse despuÃ©s con "aÃ±adirSatelite")
    Planeta(String nombre, double radio, double rotEje, double masa, double tempMedia, 
    		double gravedad, double distSol, double orbSol) {
        super(nombre, radio, rotEje, masa, tempMedia, gravedad);
        this.distSol = distSol;
        this.orbSol = orbSol;
        this.tieneSat = false;
        this.satelites = new ArrayList();
    }

    // AÃ±adimos un satÃ©lite
    public void añadirSatelite(Satelite s) {
        satelites.add(s);
        this.tieneSat = true;
    }

    // Mostramos informaciÃ³n del planeta
    public void muestra() {
        System.out.println("*** PLANETA "+this.getNombre() +"***");
        super.muestra();
        System.out.println("Distancia al sol : " + this.getDistSol());
        System.out.println("Ã“rbita al sol    : " + this.getOrbSol());
        System.out.println("Tiene satÃ©lites  : " + this.getTieneSat());
 
        
        if (tieneSat) {
            for (int i = 0; i < getSatelites().size(); i++) {
                System.out.println("  - Satelite " + (i+1) + ": " + this.getSatelites().get(i).getNombre());
            }
        } 
    }

    // GETTERS Y SETTERS
    ;
    
    public double getDistSol() {
        return distSol;
    }

    public void setDistSol(double distSol) {
        this.distSol = distSol;
    }

    public double getOrbSol() {
        return orbSol;
    }

    public void setOrbSol(double orbSol) {
        this.orbSol = orbSol;
    }

    public boolean getTieneSat() {
        return tieneSat;
    }

    public void setTieneSat(boolean tieneSat) {
        this.tieneSat = tieneSat;
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }


	
}
