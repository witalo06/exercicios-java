package Funcionario;

public class Main {
	
	 public static void main(String[] args){
	   Funcionario f1 = new Funcionario();
	   f1.setNome(" Godofredo ");
	   f1.setIdade(44);
	   f1.setCargo(" Analista de Requisitos ");
	   f1.setMatricula(104);

	   Funcionario f2 = new Funcionario(" Estela ", 25);
	   f2.setCargo(" Suporte ");
	   f2.setSalario(2000);
	   f2.setMatricula(105);

	   Funcionario f3 = new Funcionario(106, " Josivaldo ", 3500);
	   f3.setCargo(" Gerente ");
	   f3.setIdade(48);

 System.out.println(f1.getNome() + " - R$" + f1.getSalario());
 System.out.println(f2.getNome() + " - " + f2.getIdade() + " anos");
 System.out.println(f3.getNome() + " - Matricula: " + f3.getMatricula() + " - R$" + f1.getSalario());
	   
	 }
	}


