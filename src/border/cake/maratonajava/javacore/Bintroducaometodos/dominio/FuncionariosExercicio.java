package border.cake.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionariosExercicio {
    public String name;
    public int age;
    /*
    pra verificar se o codigo vai ir msm vc pode fazer isso
    if(salaries != null) {
    return;
    }
     */
    // o codigo tem que ser sustentavel, ele tem qoe funcionar mesmo se n fornecer valor
    public double[] salaries = new double[]{3544, 6645, 5878};
    /*
    Pra evitar erros de falta de informacao vc pode adicionar valores pra caso não ocorra nada

    public String name = null;
    public int age = 0;
    public double[] salaries = null;
    ---------------------------------
    public String name;
    public int age;
    public double[] salaries
     */
    /* atributo acima simplesmente poderia imprimir os valores da array
        for (double salary: salaries){
        sout(salario + " ")
        }
     */
    public double obterMedia;
    /* Poderia ter colocado o metodo imprime aqui
        public void imprime() apesar de eu ter feito isso eu apaguei

        E dentro do metodo imŕime usar this para fazer referencia aos atributos

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salaries);

        o metodo que obtem a media deveria estar aqui
        public void imprimeMediaSalariao(){
        double media = 0;
        for (double salario: salaries){
            media += salario;

            }
            media /= salarioa.length
            sout("\nMedia salarial "+ media)
        }
    */
}
