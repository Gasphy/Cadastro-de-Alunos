package src.service;

import java.util.ArrayList;
import java.util.List;

import src.exceptions.AlunoNaoEncontradoException;
import src.exceptions.MatriculaCadastradaException;
import src.model.Aluno;
import src.repository.AlunoRepository;

public class AlunoService implements AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void adicionar(Aluno aluno) throws MatriculaCadastradaException {

        for (Aluno alu : alunos) {
            if (alu.getMatricula().equals(aluno.getMatricula()))
                throw new MatriculaCadastradaException(aluno.getMatricula());
        }

        this.alunos.add(aluno);
    }

    @Override
    public List<Aluno> listar() {
        return alunos;
    }

    @Override
    public Aluno buscar(String matricula) throws AlunoNaoEncontradoException {

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula))
                return aluno;
        }

        throw new AlunoNaoEncontradoException(matricula);
    }

    @Override
    public void remover(Aluno aluno) {

        for (Aluno alu : alunos) {
            if (alu.getMatricula().equals(aluno.getMatricula())) {
                alunos.remove(alu);
                return;
            }
        }
    }

}
