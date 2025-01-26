package border.cake.maratonajava.introducao;
/*
Prática

Crie Variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String name = "Biel";
        String address = "R. fim do mundo - n°166";
        float salary = 200.99f;
        String dateReceiptSalary = "15/01/25";
        String relatorio = "Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de R$:"+salary+", na data "+dateReceiptSalary+".";
        System.out.println(relatorio);
    }
}
