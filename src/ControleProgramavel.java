public class ControleProgramavel {
    private ControleTV tv = new ControleTV();
    private ControleAR ar = new ControleAR();
    private ControleAudio audio = new ControleAudio();
    private ControleIluminacao luz = new ControleIluminacao();
    private ControleCortina cortina = new ControleCortina();

    public void AssistirTV()
    {
        tv.Ligar();
        tv.AjustaVolume(5);
        tv.NetFlix();
        ar.Ligar();
        audio.Ligar();
        cortina.Fechar();
        luz.Escurecer();
    }

    public  void PararDeAssistir()
    {

    }
}
