/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Polo UAB
 */
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.ModelCadastroEstrangeiro;
import modelo.ModelCadastroFuncionario;

public class DadosControleDb {

    public List<ModelCadastroEstrangeiro> getAll() {
        List<ModelCadastroEstrangeiro> lista = new ArrayList<ModelCadastroEstrangeiro>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select nome, NumPassaporte,NumCelular,Endereco from CADASTROESNTRANGEIRO";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1);
                String NumPassaporte = rs.getString(2);
                String NumCelular = rs.getString(3);
                String Endereco = rs.getString(4);
                ModelCadastroEstrangeiro p = new ModelCadastroEstrangeiro();
                p.setNome(nome);
                p.setNumPassaporte(NumPassaporte);
                p.setNumCelular(NumCelular);
                p.setEndereco(Endereco);
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public void delete(String numpassaporte) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from CADASTROESNTRANGEIRO where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, numpassaporte);
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void cadstroestrangeiro(ModelCadastroEstrangeiro modelcadastroestrangeiro) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into CADASTROESNTRANGEIRO (NumPassaporte, nome, numCelular, endereco, cpf, data, email, estado, estadocivil, funcao, localfuncao, sexo) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, modelcadastroestrangeiro.getNumPassaporte());
            ps.setString(2, modelcadastroestrangeiro.getNome());
            ps.setString(3, modelcadastroestrangeiro.getNumCelular());
            ps.setString(4, modelcadastroestrangeiro.getEndereco());
            ps.setString(5, modelcadastroestrangeiro.getCpf());
            ps.setDate(6, (Date) modelcadastroestrangeiro.getData());
            ps.setString(7, modelcadastroestrangeiro.getEmail());
            ps.setString(8, modelcadastroestrangeiro.getEstado());
            ps.setString(9, modelcadastroestrangeiro.getEstadocivil());
            ps.setString(10, modelcadastroestrangeiro.getFuncao());
            ps.setString(11, modelcadastroestrangeiro.getLocalfuncao());
            ps.setString(12, modelcadastroestrangeiro.getSexo());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

}
