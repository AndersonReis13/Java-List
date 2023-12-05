import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ander
 */
public class ConstructAlunos {
    
    public static void main(String args[]){
        ExemploAluno();
    }
    
   public static void ExemploAluno(){
       List<Alunos> lista = new ArrayList<>();
       
       System.out.println("**Exemplo de construção de aluno**");
       
       Alunos alunos1 = new Alunos("Anderson", "Desenvolvimento de sistema", 10 );
       Alunos alunos2 = new Alunos("Amanda", "Desenvolvimento de sistema", 11 );
       
        lista.add(alunos1);
        lista.add(alunos2);
        
        System.out.println(lista);
        
        Collections.sort(lista);
        
        System.out.println(lista);

       
   }
   
}
