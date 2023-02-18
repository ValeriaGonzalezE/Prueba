
public class ManaginPeople {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Arial",37);
		
		Person p2 = new Person("Joseph",37);
		
		if(p1.getEdad()==p2.getEdad()) {
			System.out.println("las edad de: " + p1.getName() + " es igual a la edad de " + p2.getName());
		}else {
			System.out.println("las edad de: " + p1.getName() + " no es igual a la edad de " + p2.getName());
		}
		
	}

}
