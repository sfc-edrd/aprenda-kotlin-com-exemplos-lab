package implementação

/**
 * FUNÇÃO MAIN
 */

fun main()
{
     /**
      * TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
      * DONE
      * TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
      *
      * Novos CONTEUDOS_EDUCACIONAIS
      * conteudo educacional instanciado e alterado pelo metodo 'concluirConteudo'
    */
    val conteudoEducational1 = ConteudoEducacional("React JS Basico", 30, Nivel.BASICO)
    conteudoEducational1.concluirConteudo()

    /** conteudo educacional instanciado e alterado pelo metodo 'iniciarConteudo' */
    val conteudoEducational2 = ConteudoEducacional("React JS Avançado", 40, Nivel.INTERMEDIARIO)
    conteudoEducational2.inicarConteudo()

    /** conteudo educacional instanciado */
    val conteudoEducational3 = ConteudoEducacional("React JS Por trás das cortinas", 20, Nivel.DIFICIL)

    /** Novos USUARIOS */
    val usuario1 = Usuario("Giorgio Armani", 19)
    val usuario2 = Usuario("Carolina Herrera", 21)
    val usuario3 = Usuario("Paco Rabanne", 24)

    // Novas FORMAÇÕES
    val formacao1 = Formacao(
        "Mastering ReactJS",
        listOf(
            conteudoEducational1,
            conteudoEducational2,
            conteudoEducational3))
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.matricular(usuario3)

    println(formacao1)
}

