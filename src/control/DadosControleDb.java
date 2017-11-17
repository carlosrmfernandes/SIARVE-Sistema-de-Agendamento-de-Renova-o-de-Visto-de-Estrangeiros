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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import modelo.ModelCadastroEstrangeiro;

public class DadosControleDb {

    public Vector<ModelCadastroEstrangeiro> getAllVector() {
        Vector<ModelCadastroEstrangeiro> v = new Vector<ModelCadastroEstrangeiro>();
        List<ModelCadastroEstrangeiro> list = getAll();
        list.forEach( m -> {
            v.add(m);
        });
        return v;
    }
    
    public List<ModelCadastroEstrangeiro> getAll() {
        List<ModelCadastroEstrangeiro> lista = new ArrayList<ModelCadastroEstrangeiro>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select nome, numpassaporte ,celular ,endereco from CADASTROESTRANGEIRO";
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
            String sql = "delete from CADASTROESTRANGEIRO where numpassaporte = ?";
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
            String sql = "insert into CADASTROESTRANGEIRO (numpassaporte, celular, nome, endereco, email, data, estadocivil, funcao, cpf, localfuncao, estado, sexo) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, modelcadastroestrangeiro.getNumPassaporte());
            ps.setString(2, modelcadastroestrangeiro.getNumCelular());
            ps.setString(3, modelcadastroestrangeiro.getNome());
            ps.setString(4, modelcadastroestrangeiro.getEndereco());
            ps.setString(5, modelcadastroestrangeiro.getEmail());
            ps.setDate(6, modelcadastroestrangeiro.getData());
            ps.setString(7, modelcadastroestrangeiro.getEstadocivil());
            ps.setString(8, modelcadastroestrangeiro.getFuncao());
            ps.setString(9, modelcadastroestrangeiro.getCpf());
            ps.setString(10, modelcadastroestrangeiro.getLocalfuncao());
            ps.setString(11, modelcadastroestrangeiro.getEstado());
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
