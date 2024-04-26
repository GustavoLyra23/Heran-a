import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> lista = new ArrayList<>();

        System.out.println("Numero de contribuentes");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da #"+i+" Pessoa");
            System.out.print("Pessoa Fisica ou Juridica (pf/pj) ?");
            String pessoa = sc.next();
            sc.nextLine();
            System.out.print("Nome");
            String nome = sc.nextLine();
            System.out.print("Renda anual");
            double renda_anual = sc.nextDouble();
            if (pessoa.equals("pf")) {
                System.out.print("Gastos com saude");
                double gastosSaude = sc.nextDouble();
                Contribuinte contribuinte = new PessoaFisica(nome, renda_anual, gastosSaude);
                lista.add(contribuinte);
            } else {
                System.out.print("Numero de funcionarios");
                int numeroFuncionarios = sc.nextInt();
                Contribuinte contribuinte = new PessoaJuridica(nome, renda_anual, numeroFuncionarios);
                lista.add(contribuinte);
            }
        }


        System.out.println("IMPOSTO PAGO");
        double sum = 0;
        for (Contribuinte c : lista) {
            System.out.printf("%s - $%.2f %n",c.getNome(),c.calcImposto());
           sum += c.calcImposto();
        }
        System.out.printf("Imposto total: $%.2f",sum);
        sc.close();
    }
}