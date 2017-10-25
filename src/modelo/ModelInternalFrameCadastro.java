/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author CarlosFernandes
 */
public class ModelInternalFrameCadastro {

    private Date data;
    private String Descricao, horario;
    private int codigosolicitacao;

    public int getCodigosolicitacao() {
        return codigosolicitacao;
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
