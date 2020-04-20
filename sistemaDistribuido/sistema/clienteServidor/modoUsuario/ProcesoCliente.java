package sistemaDistribuido.sistema.clienteServidor.modoUsuario;

import sistemaDistribuido.sistema.clienteServidor.modoMonitor.Nucleo;
import sistemaDistribuido.sistema.clienteServidor.modoUsuario.Proceso;
import sistemaDistribuido.util.Escribano;
import sistemaDistribuido.MyPacket;
/**
 * 
 */
public class ProcesoCliente extends Proceso{

	/**
	 * 
	 */
	public ProcesoCliente(Escribano esc){
		super(esc);
		start();
	}

	/**
	 * 
	 */
	public void run(){
		imprimeln("Proceso cliente en ejecucion.");
		imprimeln("Esperando datos para continuar.");
		/**
		 Nucleo.suspenderProceso();
		imprimeln("Hola =)");
		byte[] solCliente=new byte[20];
		byte[] respCliente=new byte[20];
		byte dato;
		solCliente[0]=(byte)10;
		Nucleo.send(248,solCliente);
		Nucleo.receive(dameID(),respCliente);
		dato=respCliente[0];
		imprimeln("el servidor me envio un "+dato);
		 */
	}
}
