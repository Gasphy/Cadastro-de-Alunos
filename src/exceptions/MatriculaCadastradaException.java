package exceptions;

public class MatriculaCadastradaException extends RuntimeException {

    public MatriculaCadastradaException(String matricula) {
        super("Matrícula já cadastrada: " + matricula);
    }

}
