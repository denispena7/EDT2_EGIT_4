package es.studium.ejercicio3;

public class Pedido
{
	private int idPedido;
	private String fecha;
	private String referencia;
	
	public Pedido()
	{
		idPedido = 0;
		fecha = "";
		referencia = "";
	}

	public Pedido(int idPedido, String fecha, String referencia)
	{
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.referencia = referencia;
	}

	public int getIdPedido()
	{
		return idPedido;
	}

	public void setIdPedido(int idPedido)
	{
		this.idPedido = idPedido;
	}

	public String getFecha()
	{
		return fecha;
	}

	public void setFecha(String fecha)
	{
		this.fecha = fecha;
	}

	public String getReferencia()
	{
		return referencia;
	}

	public void setReferencia(String referencia)
	{
		this.referencia = referencia;
	}
	
	
}
