import inatel.cdg.Ajuda;
import inatel.cdg.Fetin;

public class Main {
        public static void main(String[] args) {
            Ajuda ajuda = new Ajuda();
            Fetin projeto1 = new Fetin("Projeto 1", 12.67);
            Fetin projeto2 = new Fetin("Projeto 2", 47.80);
            Fetin projeto3 = new Fetin("", 57.38);
            Fetin projeto4 = new Fetin("Projeto 4", 100);
            projeto4 = null;

            ajuda.adicionarProjeto(projeto1);
            ajuda.adicionarProjeto(projeto4);
            ajuda.adicionarProjeto(projeto2);
            ajuda.adicionarProjeto(projeto3);
            ajuda.exibirProjetos();

            System.out.println("Fim");
        }
    }

