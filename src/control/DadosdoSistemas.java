/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class DadosdoSistemas {

    public void gravarArquivodadossistema(String nomeArquivo, String textoArquivo) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {

            fileWriter = new FileWriter(nomeArquivo, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textoArquivo);
            bufferedWriter.append("\n");
            bufferedWriter.flush();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
                }

            }
        }
    }

}
