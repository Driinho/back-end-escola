package ifpr.eic.pgua.escola.Dao.Impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ifpr.eic.pgua.escola.Dao.AlunoDao;
import ifpr.eic.pgua.escola.Dao.Dao;
import ifpr.eic.pgua.escola.models.Aluno;

public class AlunoDaoImpl extends Dao implements AlunoDao {

    @Override
    public void insert(Aluno aluno) {
        String sql = "INSERT INTO projeto_escola_aluno(nomeDeUsuario,senha,nome,dataDeNascimento,matricula) VALUES(?,?,?,?,?);";
        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setString(1, aluno.getNomeDeUsuario());
            statement.setString(2, aluno.getSenha());
            statement.setString(3, aluno.getNome());
            statement.setDate(4, Date.valueOf(aluno.getDataDeNascimento()));
            statement.setString(5, aluno.getMatricula());

            statement.execute();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Aluno aluno) {
        String sql = "DELETE FROM projeto_escola_aluno WHERE id=?;";
        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, aluno.getId());

            statement.execute();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Aluno aluno) {

        String sql = "UPDATE projeto_escola_aluno SET senha=? WHERE id=?;";
        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setString(1, aluno.getSenha());
            statement.setInt(2, aluno.getId());

            statement.execute();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Aluno> listarAlunos() {

        String sql = "SELECT * FROM projeto_escola_aluno;";
        try {
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.execute();

            ResultSet resultSet = statement.getResultSet();
            List<Aluno> alunos = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nomeDeUsuario = resultSet.getString("nomeDeUsuario");
                String senha = resultSet.getString("senha");
                String nome = resultSet.getString("nome");
                LocalDate dataDeNascimento = LocalDate.parse(resultSet.getDate("dataDeNascimento").toString());
                String matricula = resultSet.getString("matricula");

                alunos.add(new Aluno(id, nomeDeUsuario, senha, nome, dataDeNascimento, matricula));
            }

            statement.close();
            return alunos;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
