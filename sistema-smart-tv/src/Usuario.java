public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status: Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(13);{
            System.out.println("O canal atual é " + smartTv.canal);
        }

    }
}
