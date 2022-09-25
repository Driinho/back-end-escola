package ifpr.eic.pgua.escola;

import java.time.LocalDate;

import ifpr.eic.pgua.escola.Dao.AlunoDao;
import ifpr.eic.pgua.escola.Dao.ProfessorDao;
import ifpr.eic.pgua.escola.Dao.Impl.AlunoDaoImpl;
import ifpr.eic.pgua.escola.Dao.Impl.ProfessorDaoImpl;
import ifpr.eic.pgua.escola.models.Aluno;
import ifpr.eic.pgua.escola.models.Professor;

/**
 * Pedro Nascimento <pedro.nascimento.henrique2003@gmail.com>
 *
 */
public class App {
    public static void main(String[] args) {
        LocalDate dataDeNascimento = LocalDate.of(1997, 05, 11);
        LocalDate dataDeNascimento2 = LocalDate.of(2010, 12, 26);
        Professor professor = new Professor("prof1", "prof1", "prof1", dataDeNascimento, 1200);
        Professor professor2 = new Professor("prof2", "prof2", "prof2", dataDeNascimento2, 1200);
        Aluno aluno = new Aluno("aluno1", "aluno1", "aluno1", dataDeNascimento2, "ABC123");

        AlunoDao alunoDao = new AlunoDaoImpl();
        ProfessorDao professorDao = new ProfessorDaoImpl();

        professor2.setId(2);

        professorDao.delete(professor2);
        System.out.println(professorDao.listarProfessores());
        System.out.println(alunoDao.listarAlunos());
    }
}