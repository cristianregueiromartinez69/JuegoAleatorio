public class Datos {

    /**
     * numero generado para adivinar
     */
    private int num_aleatorio;
    /**
     * numero introducido por el usuario
     */
    private int num_adivinado;
    /**
     * intentos para acertar el numero
     */
    private final int intentos_max=2;
    /**
     * numero de aciertos en una partida
     */
    private int num_aciertos;
    /**
     * alias del jugador
     */
    private String alias;
    /**
     * los intentos que el usuario lleva
     */
    private int contadorIntentos;
    /**
     * rondas en cada partida
     */
    private int rondas_partida;
    /**
     * la ronda en la que estamos actualmente
     */
    private int ronda_actual;
    /**
     * numero de fallos del jugador
     */
    private int num_fallos;


    /**
     * nuestra unica instancia
     */
    private static Datos instance=null;

    /**
     * constructor privado sin parametros
     */
    private Datos(){

    }

    /**
     * constructor privado con parámetros
     * @param num_aleatorio el numero aleatorio
     * @param num_adivinado el numero propuesto
     * @param num_aciertos el numero de aciertos
     * @param alias el alias del jugador
     * @param contadorIntentos el numero de intentos
     * @param rondas_partida las rondas de la partida
     * @param ronda_actual la ronda en la que estamos actualmente
     * @param num_fallos el numero de fallos que llevamos
     */
    private Datos(int num_aleatorio, int num_adivinado, int num_aciertos, String alias, int contadorIntentos, int rondas_partida, int ronda_actual, int num_fallos) {
        this.num_aleatorio = num_aleatorio;
        this.num_adivinado = num_adivinado;
        this.num_aciertos = num_aciertos;
        this.alias = alias;
        this.contadorIntentos = contadorIntentos;
        this.rondas_partida = rondas_partida;
        this.ronda_actual = ronda_actual;
        this.num_fallos = num_fallos;
    }

    /**
     * los getters y los setters
     * @return sus respectivos atributos
     */
    public int getNum_aleatorio() {
        return num_aleatorio;
    }

    public void setNum_aleatorio(int num_aleatorio) {
        this.num_aleatorio = num_aleatorio;
    }

    public int getNum_adivinado() {
        return num_adivinado;
    }

    public void setNum_adivinado(int num_adivinado) {
        this.num_adivinado = num_adivinado;
    }

    public int getIntentos_max() {
        return intentos_max;
    }

    public int getNum_aciertos() {
        return num_aciertos;
    }

    public void setNum_aciertos(int num_aciertos) {
        this.num_aciertos = num_aciertos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getContadorIntentos() {
        return contadorIntentos;
    }

    public void setContadorIntentos(int contadorIntentos) {
        this.contadorIntentos = contadorIntentos;
    }

    public int getRondas_partida() {
        return rondas_partida;
    }

    public void setRondas_partida(int rondas_partida) {
        this.rondas_partida = rondas_partida;
    }

    public int getRonda_actual() {
        return ronda_actual;
    }

    public void setRonda_actual(int ronda_actual) {
        this.ronda_actual = ronda_actual;
    }

    public int getNum_fallos() {
        return num_fallos;
    }

    public void setNum_fallos(int num_fallos) {
        this.num_fallos = num_fallos;
    }

    /**
     * Segun exista o no ya el objeto lo instanciamos o cambiamos los datos
     * @return la instancia. Si no existe la crea primero
     */
    public static Datos getInstance(){

        if(instance==null){


            instance=new Datos();
        }
        return instance;
    }


}
