/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import modelo.ModelInternalFrameCadastro;

/**
 *
 * @author Polo UAB
 */
public class DadosControleDbAngendamento {

    public Vector<ModelInternalFrameCadastro> getAllVector() {
        Vector<ModelInternalFrameCadastro> v = new Vector<ModelInternalFrameCadastro>();
        List<ModelInternalFrameCadastro> list = getAll();
        list.forEach(m -> {
            v.add(m);
        });
        return v;
    }

    public List<ModelInternalFrameCadastro> getAll() {
        List<ModelInternalFrameCadastro> lista = new ArrayList<ModelInternalFrameCadastro>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigosolicitacao, data ,horario ,descricao from AGENDAMENTO";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigosolicitacao = rs.getInt(1);
                Date data = rs.getDate(2);
                String horario = rs.getString(3);
                String descricao = rs.getString(4);
                ModelInternalFrameCadastro p = new ModelInternalFrameCadastro();
                p.setCodigosolicitacao(codigosolicitacao);
                p.setData(data);
                p.setHorario(horario);
                p.setDescricao(descricao);
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

    public void delete(int codigosolicitacao) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from AGENDAMENTO where codigosolicitacao = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigosolicitacao);
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

    public void cadstroestroAgendamento(ModelInternalFrameCadastro modelinternalFrameCadastro, String usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into AGENDAMENTO (codigosolicitacao, numpassaporte, descricao, data, horario, tipofuncao, sexo, email, celular, nomefum) values (?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, modelinternalFrameCadastro.getCodigosolicitacao());
            ps.setString(2, modelinternalFrameCadastro.getNumpassaporte());
            ps.setString(3, modelinternalFrameCadastro.getDescricao());
            ps.setDate(4, modelinternalFrameCadastro.getData());
            ps.setString(5, modelinternalFrameCadastro.getHorario());
            ps.setString(6, modelinternalFrameCadastro.getTipo());
            ps.setString(7, modelinternalFrameCadastro.getSexo());
            ps.setString(8, modelinternalFrameCadastro.getEmail());
            ps.setString(9, modelinternalFrameCadastro.getCelular());
            ps.setString(10, usuario);

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
