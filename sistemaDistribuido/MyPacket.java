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
    private Boolean es_cliente;

    public MyPacket(Boolean esCliente){

    }

    public static void printbytes(byte[] arg){
        System.out.print("bytes : ");
        for (int i = 0; i < arg.length; i++){
            System.out.print(String.format("%s",arg[i]));
        }
        System.out.println("");
    }

    public static byte[] shortToBytes(Short numero){
        byte[] arreglo;
        String numero_s = String.valueOf(numero);
        arreglo = numero_s.getBytes();
        return arreglo;
    }

    public static short bytesToShort(byte[] arreglo){
        String numero_s = new String(arreglo);
        short numero = -1;
        try{
            numero = Short.parseShort(numero_s);
        }catch(NumberFormatException e){
            numero = -1;
        }
        return numero;
    }

    public static byte[] intToBytes(int numero){
        byte[] arreglo;
        String numero_s = String.valueOf(numero);
        arreglo = numero_s.getBytes();
        return arreglo;
    }

    public static int bytesToInt(byte[] arreglo){
        String numero_s = new String(arreglo);
        int numero = -1;
        try{
            numero = Integer.parseInt(numero_s);
        }catch(NumberFormatException e){
            numero = -1;
        }
        return numero;
    }
}

/**
 *
 * este codigo es el de la practica y se necesitara para decodificar y codificar el msg


 public static void main(String[] args){
 short numero = 9;
 String numero_s = String.valueOf(numero);
 println(String.format("numero original : " + numero));
 println("numero str : " + numero_s);
 byte[] numero_bytes = numero_s.getBytes();
 printbytes(numero_bytes);
 String numero_recuperado = new String(numero_bytes);
 println("numero reuperado str : " + numero_recuperado);
 short numero2 = -1;
 try {
 numero2 = Short.parseShort("10000000");//Short.parseShort(numero_recuperado);
 }catch(NumberFormatException err){
 println("valor fuera de rango o incompatible");
 }catch (Exception err){
 print(err.toString());
 }
 println(String.format("Short Recuperado numero2 : %s", numero2));
 }

 */