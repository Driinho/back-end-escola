package ifpr.eic.pgua.escola.Dao.Impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ifpr.eic.pgua.escola.Dao.Dao;
import ifpr.eic.pgua.escola.Dao.ProfessorDao;
import ifpr.eic.pgua.escola.models.Professor;

public class ProfessorDaoImpl extends Dao implements ProfessorDao {

    @Override
    public void insert(Professor professor) {
        String sql = "INSERT INTO projeto_escola_professor(nomeDeUsuario,senha,nome,dataDeNascimento,salario) VALUES(?,?,?,?,?);";

        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setString(1, professor.getNomeDeUsuario());
            statement.setString(2, professor.getSenha());
            statement.setString(3, professor.getNome());
            statement.setDate(4, Date.valueOf(professor.getDataDeNascimento()));
            statement.setDouble(5, professor.getSalario());

            statement.execute();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Professor professor) {
        String sql = "DELETE FROM projeto_escola_professor WHERE id=?;";

        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, professor.getId());

            statement.execute();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Professor professor) {
        String sql = "UPDATE projeto_escola_professor SET senha=? WHERE id=?;";

        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setString(1, professor.getSenha());
            statement.setInt(2, professor.getId());

            statement.execute();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Professor> listarProfessores() {
        String sql = "SELECT * FROM projeto_escola_professor;";

        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);

            statement.execute();

            ResultSet resultSet = statement.getResultSet();

            List<Professor> professores = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nomeDeUsuario = resultSet.getString("nomeDeUsuario");
                String senha = resultSet.getString("senha");
                String nome = resultSet.getString("nome");
                LocalDate dataDeNascimento = LocalDate.parse(resultSet.getDate("dataDeNascimento").toString());
                Double salario = resultSet.getDouble("salario");

                professores.add(new Professor(id, nomeDeUsuario, senha, nome, dataDeNascimento, salario));
            }

            statement.close();
            if (professores.size() > 0) {
                return professores;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
