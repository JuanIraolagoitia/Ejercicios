package estudiantes;

public class TestEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiantes[] arrayEstudiantes = new Estudiantes[8];
		
		arrayEstudiantes[0] = new Estudiantes("Jonathan", 10);
		arrayEstudiantes[1] = new Estudiantes("Alejandra", 8);
		arrayEstudiantes[2] = new Estudiantes("Luisina", 7);
		arrayEstudiantes[3] = new Estudiantes("Martin", 4);
		arrayEstudiantes[4] = new Estudiantes("Luis", 3);
		arrayEstudiantes[5] = new Estudiantes("Mirta", 9);
		arrayEstudiantes[6] = new Estudiantes("Ginger", 3);
		arrayEstudiantes[7] = new Estudiantes("Kino", 5);
		
		Estudiantes estudiante = new Estudiantes("", 0);
		
		double promedio = estudiante.promedioCurso(arrayEstudiantes);
		System.out.println("El promedio general del curso es: " + promedio);
		

		String[] nombresDevueltos = estudiante.arregloNombresMejores(arrayEstudiantes);
		
	}

}
