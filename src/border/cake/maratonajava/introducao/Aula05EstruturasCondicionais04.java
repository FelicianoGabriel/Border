package border.cake.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salaryAnnual = 70000;
        double taxPerSalary1 = 9.70 / 100;
        double taxPerSalary2 = 37.35 / 100;
        double taxPerSalary3 = 49.50 / 100;
        double valueTax;
        if (salaryAnnual <= 34714) {
            valueTax = salaryAnnual *= taxPerSalary1;
        } else if (salaryAnnual >= 34713 && salaryAnnual <= 68507){
            valueTax = salaryAnnual *= taxPerSalary2;
        } else {
            valueTax = salaryAnnual *= taxPerSalary3;
        }
        System.out.println("Valor a pagar em euros "+ valueTax);
    }
}