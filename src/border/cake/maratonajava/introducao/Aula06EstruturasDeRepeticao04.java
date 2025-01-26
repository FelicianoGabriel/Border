package border.cake.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
     // Condição o valor da parcela tem que ser > que 1000
    public static void main(String[] args) {
//        int valorCarro = 99999;
//        int valorParcela = valorCarro / 1000;
//        System.out.println("Você pode parcelar em: "+valorParcela);
        double valorTotal = 30000;
        for (int parcela = 0; parcela <= valorTotal ; parcela++) {
           double valorParcela = valorTotal / parcela;
           if (valorParcela < 1000){
               continue;
           }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}