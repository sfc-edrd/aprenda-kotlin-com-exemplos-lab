package implementação

/**
 * CLASSE DE DADOS DO MODELO DO USUARIO
 */
data class Usuario
    (val nome: String,
     var idade: Int,
     var situacao: SituacaoUsuario = SituacaoUsuario.INATIVO
)
