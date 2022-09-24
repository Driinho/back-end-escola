package ifpr.eic.pgua.escola.Dao;

import java.util.List;

import ifpr.eic.pgua.escola.models.Professor;

public interface ProfessorDao {

    void insert(Professor professor);

    void delete(Professor professor);

    void update(Professor professor);

    List<Professor> listarProfessores();
}
