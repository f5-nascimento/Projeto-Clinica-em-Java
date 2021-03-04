
package clinica;

//IMPORTANDO A CLASSE SCANNER
import java.util.Scanner;

//CLASSE MEDICOS
public class Medicos {
    
    //METODO PRINCIPAL
    public static void main(String[] args) {
        
        //ATRIBUIÇÃO DE VARIAVEIS
        String nome_medicos;
        String crm_medicos;
        String especialidade_medicos;
        int admissao_medicos;
        double salario_medicos;
        double reajuste_medicos = 0;
        int controle;
        String usuario;
        String senha;
        int i;
        
        
        Scanner acesso = new Scanner (System.in);
        System.out.print("Digite o seu login de acesso: ");
        usuario = acesso.nextLine();
        System.out.print("Digite a sua senha de acesso: ");
        senha = acesso.nextLine();
        
        while (!"admin".equals(usuario) && !"admin".equals(senha)){
            
            
            for (i = 3; i>0; i--){
                
                System.out.println("Usuário ou Senha Inválida " + i + 
                           " tentativas");
                System.out.print("Usuário: ");
                usuario = acesso.nextLine();
                System.out.print("Senha: ");
                senha = acesso.nextLine();
                
                if ("admin".equals(usuario) && "admin".equals(senha)){
                    
                    break;
                    
                }
                
           
                
            }
            
             if (i == 0){
                    
                    System.out.println("Acesso Negado");
                    System.exit(0);
                    
                }
            
        }
        
        Scanner a = new Scanner (System.in);
        System.out.print("SEJA BEM VINDO AO SISTEMA DE GESTÃO DE MÉDICOS" + "\n" +
               "Digite 1 para iniciar o sistema: ");
        controle = a.nextInt();
        
        while (controle == 1) {
            
            //ENTRADA DE DADOS
            Scanner ler = new Scanner (System.in);
            System.out.print("Digite o nome do Médico(a): ");
            nome_medicos = ler.nextLine();
            System.out.print("Digite o crm do Médico(a): ");
            crm_medicos = ler.nextLine();
            System.out.print("Digite a especialidade do Médico(a): ");
            especialidade_medicos = ler.nextLine();
            System.out.print("Digite o ano de admissão do Médico(a): ");
            admissao_medicos = ler.nextInt();
            System.out.print("Digite o salário do Médico(a): ");
            salario_medicos = ler.nextDouble();

            while (salario_medicos<0){

               System.out.print("Valor inválido, "
                       + "Digite novamente o salário do Médico(a): ");
               salario_medicos = ler.nextDouble(); 


            }

            //ESTRUTURA DE CONDIÇÃO
            if (salario_medicos>=2000){

                reajuste_medicos = salario_medicos * 1.2;


            }

            else if(salario_medicos>=1000 && salario_medicos<2000){

                 reajuste_medicos = salario_medicos * 1.1;

            }

            else if (salario_medicos>0 && salario_medicos<1000){

                reajuste_medicos = salario_medicos * 1.05;

            }

            else{

               reajuste_medicos = salario_medicos;

            }



            //SAIDA DE DADOS
            System.out.println("Médico(a): " + nome_medicos + "\n" +
                               "CRM: " + crm_medicos + "\n" +
                               "Especialidade: " + especialidade_medicos + "\n" +
                               "Ano de Admissão: " + admissao_medicos +"\n" +
                                "Salário :" + salario_medicos + "\n" +
                                "Reajuste Salarial: " + reajuste_medicos);

            
             System.out.println(" ");
             System.out.print("Digite 1 para cadastrar novo médico: ");
             controle = ler.nextInt();
            
            
        } 
        
       
    }
    
}
