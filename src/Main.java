public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Jorge");
        cliente.setEdad(35);
        cliente.setTelefono(642255887);
        cliente.setCredito(500);
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
    }
}

class Persona{
    public int edad;
    public String nombre;
    public int telefono;
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}

class Cliente extends  Persona{
    private int credito;
    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }


}

class Trabajador extends Persona {

    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}