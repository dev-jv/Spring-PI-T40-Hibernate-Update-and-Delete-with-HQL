package connectionhibernate;

//import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="clients")
public class Client {
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Client(String nombre, String apellidos, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	public Client() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellidos")
	private String apellidos;
	
	@Column(name="Direccion")
	private String direccion;
	
}

/*

	@GeneratedValue(strategy = GenerationType.IDENTITY)

Como par�metro tiene 4 formas de crear un campo clave.
	
Permite crear un campo clave en Hibernate, ya que configuramos un auto-increment uitlizaremos IDENTITY .

Ahora habr� sincronizaci�n entre el nro asignado de Id en Hibernate y MySQL.
*/

/*
	@Id
	
Is necessary!
	
Since each row in a sql database should have a unique identifier, hibernate forces you to define one.

*/

/*
	@Entity

Hibernate transforma las clases en entidades, para poder realizar el mapeo.

*/