package src.repository;
import java.util.List;

import src.exceptions.AlunoNaoEncontradoException;
import src.exceptions.MatriculaCadastradaException;
import src.model.Aluno;

public interface AlunoRepository {

    void adicionar(Aluno aluno) throws MatriculaCadastradaException;

    List<Aluno> listar();

    Aluno buscar(String matricula) throws AlunoNaoEncontradoException;

    void remover(Aluno aluno);


}
