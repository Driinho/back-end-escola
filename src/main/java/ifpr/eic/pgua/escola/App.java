package ifpr.eic.pgua.escola;

import java.time.LocalDate;

import ifpr.eic.pgua.escola.models.Aluno;
import ifpr.eic.pgua.escola.models.Professor;
import ifpr.eic.pgua.escola.models.Usuario;

/**
 * Pedro Nascimento <pedro.nascimento.henrique2003@gmail.com>
 *
 */
public class App {
    public static void main(String[] args) {
        LocalDate dataDeNascimento = LocalDate.of(1997, 05, 11);
        LocalDate dataDeNascimento2 = LocalDate.of(2010, 12, 26);
        Usuario professor = new Professor("prof1", "prof1", "prof1", 25, dataDeNascimento, 1200);
        Usuario aluno = new Aluno("aluno1", "aluno1", "aluno1", 11, dataDeNascimento2, "ABC123");
        System.out.println(professor);
        System.out.println(aluno);
    }
}