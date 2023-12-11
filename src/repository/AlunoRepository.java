package repository;
import java.util.List;

import exceptions.AlunoNaoEncontradoException;
import exceptions.MatriculaCadastradaException;
import model.Aluno;

public interface AlunoRepository {

    void adicionar(Aluno aluno) throws MatriculaCadastradaException;

    List<Aluno> listar();

    Aluno buscar(String matricula) throws AlunoNaoEncontradoException;

    void remover(Aluno aluno);


}
