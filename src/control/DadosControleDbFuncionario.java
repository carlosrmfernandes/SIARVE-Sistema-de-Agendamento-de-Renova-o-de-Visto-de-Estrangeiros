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
import modelo.ModelCadastroFuncionario;


/**
 *
 * @author Polo UAB
 */
public class DadosControleDbFuncionario {

    public Vector<ModelCadastroFuncionario> getAllVector() {
        Vector<ModelCadastroFuncionario> v = new Vector<ModelCadastroFuncionario>();
        List<ModelCadastroFuncionario> list = getAll();
        list.forEach(m -> {
            v.add(m);
        });
        return v;
    }

    public List<ModelCadastroFuncionario> getAll() {
        List<ModelCadastroFuncionario> lista = new ArrayList<ModelCadastroFuncionario>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select email from CADASTROFUNCIONARIO";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String email = rs.getString(1);

                ModelCadastroFuncionario p = new ModelCadastroFuncionario();
                p.setEmail(email);
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

    public void delete(String email) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from CADASTROFUNCIONARIO where email = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.execute();

            conn.commit();
            deleteLogin(email);
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

    public void deleteLogin(String email) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from LOGIN where email = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
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

    public void cadstroestroFuncionario(ModelCadastroFuncionario modelcadastrofuncionario, String email, String senha) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into CADASTROFUNCIONARIO (email, endereco, cpf, data, tipopessoa, estado, celular, sexo, nome, estadocivil) values (?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, modelcadastrofuncionario.getEmail());
            ps.setString(2, modelcadastrofuncionario.getEndereco());
            ps.setString(3, modelcadastrofuncionario.getCpf());
            ps.setDate(4, modelcadastrofuncionario.getData());
            ps.setString(5, modelcadastrofuncionario.getTipopessoa());
            ps.setString(6, modelcadastrofuncionario.getEstado());
            ps.setString(7, modelcadastrofuncionario.getCelular());
            ps.setString(8, modelcadastrofuncionario.getSexo());
            ps.setString(9, modelcadastrofuncionario.getNome());
            ps.setString(10, modelcadastrofuncionario.getEstado());

            ps.execute();

            conn.commit();
            cadstroLogin(email, senha);

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

    public void cadstroLogin(String email, String senha) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into LOGIN (email, senha) values (?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, senha);
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
