package implementação

/**
 * CLASSE DE DADOS DE DEFINIÇÃO DE FORMAÇÃO
 */
data class Formacao
    (val nome: String,
     var conteudos: List<ConteudoEducacional>)
{
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario)
    {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        usuario.situacao = SituacaoUsuario.ATIVO
    }
}
