package universo;

public class Satelite extends Astro{
	


    // Atributos
    private double distPlaneta;
    private double orbPlaneta;
    private Planeta planeta;

    // Constructor
    Satelite(String nombre, double radio, double rotEje, double masa, double tempMedia, 
    		double gravedad, double distPlaneta, double orbPlaneta, Planeta planeta) {
       super(nombre, radio, rotEje, masa, tempMedia, gravedad);
        this.distPlaneta = distPlaneta;
        this.orbPlaneta = orbPlaneta;
        this.planeta = planeta;
    }
    
    // Constructor
    Satelite(String nombre, double radio, double rotEje, double masa, double tempMedia, 
    		double gravedad, double distPlaneta, double orbPlaneta) {
       super(nombre, radio, rotEje, masa, tempMedia, gravedad);
        this.distPlaneta = distPlaneta;
        this.orbPlaneta = orbPlaneta;
       // this.planeta = planeta;
    }

    // Mostramos solo parte de su informaciÃ³n
    public void muestra() {
        System.out.println("*** SATÃ‰LITE: "+this.getNombre() +" ***");
        super.muestra();
        System.out.println("Distancia planeta: " + getDistPlaneta());
        System.out.println("Ã“rbita al planeta: " + getOrbPlaneta());
        if (planeta != null) {
        	System.out.println("Pertenece planeta: " + planeta.getNombre());
        }
        
    }

    // GETTERS Y SETTERS
    ;
    
    public double getDistPlaneta() {
        return distPlaneta;
    }

    public void setDistPlaneta(double distPlaneta) {
        this.distPlaneta = distPlaneta;
    }

    public double getOrbPlaneta() {
        return orbPlaneta;
    }

    public void setOrbPlaneta(double orbPlaneta) {
        this.orbPlaneta = orbPlaneta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }


}
