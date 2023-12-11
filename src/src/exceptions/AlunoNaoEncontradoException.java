package src.exceptions;
public class AlunoNaoEncontradoException extends RuntimeException {

    public AlunoNaoEncontradoException(String matricula) {
        super("Aluno não encontrado com a matrícula " + matricula);
    }
    
}
