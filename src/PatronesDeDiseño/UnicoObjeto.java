package PatronesDeDiseño;

public class UnicoObjeto<Singleton> {

    public String nombre;

    private static UnicoObjeto instanciar=null;

    private UnicoObjeto() {
    }


    public static UnicoObjeto crearObj() {

        if (instanciar == null) {
        instanciar = new UnicoObjeto();

    }
        return instanciar;

    }




}
