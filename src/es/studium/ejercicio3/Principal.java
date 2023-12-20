package es.studium.ejercicio3;

public class Principal
{
	public static void main(String[] args)
	{
		Pedido pedido1 = new Pedido(100, "15/07/2020", "Granada");
		Factura factura1 = new Factura(10, "L110", pedido1);
		System.out.println(factura1.getPedido().getIdPedido() + " " +
							factura1.getPedido().getFecha() + " " + 
								factura1.getPedido().getReferencia());
	}
}