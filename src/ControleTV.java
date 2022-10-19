public class ControleTV extends  ControleRemoto
{
    private int volume;
    public void NetFlix()
    {
    }

    public void AmazonPrime()
    {
    }

    public  void AjustaVolume(int vol)
    {
        volume = vol;
    }

    @Override
    public void Ligar()
    {
        System.out.println("A TV esta ligada");
    }
}
