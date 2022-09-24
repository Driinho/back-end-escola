package ifpr.eic.pgua.escola.Dao;

import java.util.List;

import ifpr.eic.pgua.escola.models.Aluno;

public interface AlunoDao {

    void insert(Aluno aluno);

    void delete(Aluno Aluno);

    void update(Aluno Aluno);

    List<Aluno> listarAlunos();
}
