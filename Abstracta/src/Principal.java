
public class Principal {

    public static void main(String[] args) {
        Medico m = new Medico("Gregory", "House", "m01", "c01", "Harvard", "No usa", "Diagnosta");
        System.out.println(m);

        //metodo no abstracto de profesionista
        m.cobrar("efectivo", 2000);

        //metodo abstracto
        m.trabajar();

        //metodo propio de la clase
        m.consultar();

        System.out.println("\n");

        IngSistemas is = new IngSistemas("Mark", "Zuckenberg", "i02", "m02", "Harvard", "Back", "PHP", "Face");
        System.out.println(is);

        //metodo no abstracto de profesionista
        is.cobrar("transferencia", 12500);

        //metodo abstracto
        is.trabajar();

        //metodo propio de la clase
        is.codeando();
    }

}
