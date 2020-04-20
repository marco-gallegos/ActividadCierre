package sistemaDistribuido;

/**
 * Clase para abtraer el proceso de ensamblado y desensamblado de los paquetes
 *
 * Cliente Emisor
 * string bytes
 * [ 4 + 4 + 2 + 1014 ]
 * [ id emisor + idreceptor + CODOP + MSG ]
 *
 * Servidor Emisor
 * string bytes
 * [ 4 + 4 + 1016 ]
 * [ id emisor + id receptor +  ]
 * de momento los 8 de aqui son omitidos se envian 00
 */

public class MyPacket {
    public Integer id_emisor, id_receptor;
    public String msg;

}