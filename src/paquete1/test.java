package paquete1;

public class test {
	public static void main(String args[]) {
		System.out.println(Operaciones.SUMA);
		System.out.println(Operaciones.RESTA.name());
		double a = 2;
		double b = 4;
		double res = Operaciones.SUMA.resultado(a, b);
		System.out.println(res);
		System.out.println("bröthër");
	}
}
