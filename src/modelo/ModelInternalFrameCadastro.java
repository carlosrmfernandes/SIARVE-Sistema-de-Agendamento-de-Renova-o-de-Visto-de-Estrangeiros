/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author CarlosFernandes
 */
public class ModelInternalFrameCadastro {

    private Date data;
    private String Descricao, horario,tipo,sexo,email,celular,numpassaporte;
    private int codigosolicitacao;

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumpassaporte() {
        return numpassaporte;
    }

    public void setNumpassaporte(String numpassaporte) {
        this.numpassaporte = numpassaporte;
    }

    

    public int getCodigosolicitacao() {
        return codigosolicitacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodigosolicitacao(int codigosolicitacao) {
        this.codigosolicitacao = codigosolicitacao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    
}
