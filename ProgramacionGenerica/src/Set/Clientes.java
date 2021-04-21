package Set;

public class Clientes {

	private String nombre;
	
	private String num_cuenta;
	
	private double saldo;

	public Clientes(String nombre, String num_cuenta, double saldo) {
		
		this.nombre = nombre;
		this.num_cuenta = num_cuenta;
		this.saldo = saldo;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", num_cuenta=" + num_cuenta + ", saldo=" + saldo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num_cuenta == null) ? 0 : num_cuenta.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		if (num_cuenta == null) {
			if (other.num_cuenta != null)
				return false;
		} else if (!num_cuenta.equals(other.num_cuenta))
			return false;
		return true;
	}

    
	
	
}
