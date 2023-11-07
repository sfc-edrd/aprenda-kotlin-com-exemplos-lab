package implementação

/**
 * CLASSE DE DADOS DE DEFINIÇÃO DE CONTEUDO EDUCACIONAL
 */
data class ConteudoEducacional
    (val nome: String,
     val duracao: Int = 60,
     val nivel: Nivel,
     var situacao: SituacaoConteudoEducacional = SituacaoConteudoEducacional.NAO_INICIADO
)
{
        fun inicarConteudo()
        {
            situacao = SituacaoConteudoEducacional.EM_PROGRESSO
        }

        fun concluirConteudo()
        {
            situacao = SituacaoConteudoEducacional.CONCLUIDO
        }
}
