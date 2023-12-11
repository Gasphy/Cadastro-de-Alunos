import model.Aluno;
import service.AlunoService;

public class Main {

    public static void main(String[] args) {

        Aluno gabriel = new Aluno("Gabriel", "123");
        Aluno larissa = new Aluno("Larissa", "12345");
        Aluno isadora = new Aluno("Isadora", "12345323");
        Aluno mao = new Aluno("Mao", "123456");
        Aluno maria = new Aluno("Maria", "1234567");

        AlunoService alunoService = new AlunoService();

      
        alunoService.adicionar(gabriel);
        alunoService.adicionar(larissa);
        alunoService.adicionar(isadora);
        alunoService.adicionar(mao);
        alunoService.adicionar(maria);

        System.out.println(alunoService.listar());
        System.out.println(alunoService.buscar("123"));
        alunoService.remover(larissa);
        System.out.println(alunoService.listar());

        
    }
}