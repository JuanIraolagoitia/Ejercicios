package estudiantes;


public class Estudiantes {
	String nombre;
	double nota;
	
	//Constructor 
	public Estudiantes(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
		}
	
	//calculo el promedio general recorriendo el arreglo y sumando el valor del atributo nota para 
	//despues dividirlo por el total de alumnos, osea el tamaño del array
	public double promedioCurso(Estudiantes[] alumnos) {
		double nota = 0;
		for (int i = 0; i < alumnos.length; i++) {
			nota += alumnos[i].nota;
		}
		return nota/alumnos.length;
	}
	
	//Metodo que filtra alumnos con nota mayor al promedio y genera un nuevo array con estos 
	//tambien lo imprime en consola
	public String[] arregloNombresMejores(Estudiantes[] alumnos) {
		double promedio = promedioCurso(alumnos);
		int contador = 0;
		//Cuento alumnos con nota mayor al promedio y aumento contador que va a dar el tamaño del array
		for (int i = 0; i < alumnos.length; i++) {	
			if(alumnos[i].nota > promedio) {
				contador++;
			}
		}
		//Creo el array de los nombres con el tamaño del contador
		String[] nombresAlumnosMejores = new String[contador];
		int indice = 0;
		
		//Agrego los nombres al array y los imprimo
		for (int i = 0; i < alumnos.length; i++) {
	        if (alumnos[i].nota > promedio) {
	            nombresAlumnosMejores[indice] = alumnos[i].nombre;
	            System.out.println(nombresAlumnosMejores[indice]);
	            indice++;
	        }
		}
		return nombresAlumnosMejores;
	}
}
