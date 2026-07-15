package exercises.oop.domain;

public class Employee {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);

        for (double salarios : salario){
            System.out.println(salarios);
        }
    }

    public void media(){
        double media = 0;
        for (double salarios : salario){
            media = media + salarios;
        }
        media = media / salario.length;
        System.out.printf("%.1f%n", media);
    }
}
