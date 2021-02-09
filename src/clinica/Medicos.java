/*O PROGRAMA TEM COMO OBJETIVO APRESENTAR OS SEGUINTES CONCEITOS: 
ABSTRAÇÃO, DEFINIÇÃO DE VARIÁVEIS, SAÍDA DE DADOS E ENTRADA DE DADOS*/

package clinica;

//IMPORTAÇÃO DA CLASSE SCANNER
import java.util.Scanner;

public class Medicos {
    
    //MÉTODO PRINCIPAL
    public static void main(String[] args) {
        
        //ATRIBUTOS DEFINIDOS
        String nome_medicos;
        String crm_medicos;
        String especialidade_medicos;
        int admissao_medicos;
        double salario_medicos;
        
        //ENTRADA DE DADOS COM A CLASSE SCANNER
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do(a) Médico(a): ");
        nome_medicos = ler.nextLine(); //NEXTLINE PARA STRINGS
        System.out.println("Digite o CRM do(a) Médico(a): ");
        crm_medicos = ler.nextLine();
        System.out.println("Digite a Especialidade do(a) Médico(a): ");
        especialidade_medicos = ler.nextLine();
        System.out.println("Digite o ano de Admissão do(a) Médico(a): ");
        admissao_medicos = ler.nextInt(); //NEXTINT PARA INTEIROS
        System.out.println("Digite o salário do(a) Médico(a): ");
        salario_medicos = ler.nextDouble(); //NEXTDOUBLE PARA DOUBLE
        
        //SAÍDA DE DADOS COM O MÉTODO SYSTEM.OUT.PRINT
        System.out.println("Médico(a): "         + nome_medicos          + "\n" +
                           "CRM: "               + crm_medicos           + "\n" +
                           "Especialidade: "     + especialidade_medicos + "\n" +
                           "Ano de Admissão: "   + admissao_medicos      + "\n" +
                           "Salário :"           + salario_medicos       + "\n");
       
        
    }
    
}