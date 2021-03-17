package pacote;
import javax.swing.JOptionPane;

public class cliente {
    String nome;
    int idade;
    String cpf;
    float salario;
    
    //construtor padrão
    cliente(){}
    
    void lerDados(){
       nome = JOptionPane.showInputDialog("Nome: ");
       idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
       cpf = JOptionPane.showInputDialog("Cpf: ");
       salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
    }
    
    void imprimirDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nCpf: " + cpf + "\nSalário: " + salario);
    }
}
