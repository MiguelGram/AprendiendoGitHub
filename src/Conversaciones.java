public class Conversaciones {
    private Saludo saludo;
    private Despedida despedida;
    public Conversaciones(){
        saludo = new Saludo();
        despedida = new Despedida();
    }
    public void inciarConversacion(){
        saludo.saludar();
        despedida.despedir();
    }
}
