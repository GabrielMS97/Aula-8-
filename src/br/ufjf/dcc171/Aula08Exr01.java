package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Aula08Exr01 {

    public static void main(String[] args) {
        JanelaTurma janela = new JanelaTurma(getSampleData());
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static List<Turma> getSampleData() {
        Aluno a1 = new Aluno("201576038", "Muralha");
        Aluno a2 = new Aluno("201576027", "Rômulo");
        Aluno a3 = new Aluno("201576033", "Rafael Vaz");
        
        Turma t1 = new Turma("DCC171");
        Turma t2 = new Turma("DCC090");
        
        t1.getAlunos().add(a1);
        t1.getAlunos().add(a3);
        t2.getAlunos().add(a1);
        t2.getAlunos().add(a2);
        t2.getAlunos().add(a3);
        
        List<Turma> turmas = new ArrayList<>();
        turmas.add(t1);
        turmas.add(t2);
        
        return turmas;
    }

}
