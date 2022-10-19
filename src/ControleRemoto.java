public class ControleRemoto {
    private boolean estaligado;
    public boolean isEstaligado() {
        return estaligado;
    }
    public void setEstaligado(boolean estaligado) {
        this.estaligado = estaligado;
    }

    public void Ligar()
    {
        estaligado = true;
    }
    public  void Desligar()
    {
        estaligado = false;
    }

    @Override
    public  String toString()
    {
        return estaligado? " Esta ligado": "Não esta Ligado!";
    }
}
