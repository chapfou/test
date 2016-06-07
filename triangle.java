package projet1;

public class triangle {

	public static boolean estIsocele(int a, int b, int c) {
		boolean resultat=false;
		resultat = (a==b)||(b==c)||(c==a);
		return resultat;
	}
	public static boolean estEquilateral(int a, int b, int c) {
		boolean resultat=false;
		resultat = (a==b)&&(b==c);
		return resultat;
	}
	public static boolean estQuelconque(int a, int b, int c) {
		boolean resultat=false;
		resultat = !estIsocele(a,b,c);
		return resultat;
		
		
		
		

	}
	public static void main(String args[]){
		System.out.println("le triangle 2 2 3 est isocèle ?" + estIsocele(2,2,3));
		System.out.println("le triangle 2 2 3 est equilateral ?" + estEquilateral(2,2,3));
		System.out.println("le triangle 2 2 3 est quelconqe ?" + estQuelconque(2,2,3));
		
		
	}
}
