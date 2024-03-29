package lexico

/**
 * Clase que contiene las categorias a las que pertenece cada Token
 *
 * @author Esthefania Lemus - Diana Ramirez - Cristian Bonilla
 */
enum class Categoria {
    ENTERO, REAL, CADENA_CARACTERES, IDENTIFICADOR, OPERADOR_ARITMETICO, DESCONOCIDO, RESERVADA, OPERADOR_RELACIONAL, OPERADOR_LOGICO_BINARIO, OPERADOR_LOGICO_UNARIO, OPERADOR_ASIGNACION, OPERADOR_INCREMENTO_DECREMENTO, PARENTESIS_APERTURA, PARENTESIS_CIERRE, LLAVE_APERTURA, LLAVE_CIERRE, TERMINAL, SEPARADOR, HEXADECIMAL, ERROR, COMENTARIO, PUNTO, DOS_PUNTOS, COMENTARIO_LINEA, COMENTARIO_BLOQUE, CORCHETE_APERTURA, CORCHETE_CIERRE, CARACTER
}