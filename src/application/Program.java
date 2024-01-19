package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number os tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Enter the #" + i + " data");
            System.out.print("Individual or company (i/c)? ");
            char x = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            Double rendaAnual = sc.nextDouble();

            if(x == 'i') {
                System.out.print("Health expenditure: ");
                Double gastoSaude = sc.nextDouble();

                list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
            } else {
                System.out.print("Number of employees: ");
                Integer qntdFuncionarios = sc.nextInt();

                list.add(new PessoaJuridica(name, rendaAnual, qntdFuncionarios));
            }
        }

        System.out.println();
        System.out.println("TAXES PAYED:");
        for(Pessoa pessoa : list) {
            System.out.printf(pessoa.getNome() + ": $%.2f\n", pessoa.valorImposto());
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TOTAL TAXES:");
        for(Pessoa pessoa : list) {
            sum += pessoa.valorImposto();
        }
        System.out.printf("%.2f", sum);

    }
}
