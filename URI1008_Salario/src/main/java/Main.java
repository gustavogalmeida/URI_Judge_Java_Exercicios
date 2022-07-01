/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o
número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o funcionário
recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço
em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço
em branco após o $.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        int nFuncionario = Integer.parseInt(teclado.nextLine());
        double qtdHoras = Double.parseDouble(teclado.nextLine());
        double vHora = Double.parseDouble(teclado.nextLine());
        double salario = vHora*qtdHoras;
        BigDecimal bigSalario = new BigDecimal(salario).setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("NUMBER = "+nFuncionario+"\nSALARY = U$ "+ bigSalario);
    }
}
