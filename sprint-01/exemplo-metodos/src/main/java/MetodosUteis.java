public class MetodosUteis {
    // Métodoo:
    // Retorno: void não tem retorno
    //nome: exibirUsuario
    //argumentos: nomeUsuario
    // corpo: faz um print do nome

    void exibirUsuario(String nome){
        System.out.println("""
                *--------------*--------------*
                Usuario Logado: %s
                *--------------*--------------*
                """.formatted(nome));
    }

    Double somar(Double num01, Double num02){
        return num01 + num02;
    }
}
