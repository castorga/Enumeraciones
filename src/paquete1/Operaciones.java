package paquete1;

public enum Operaciones {
	SUMA("+") {
		@Override
		public double resultado(double op1, double op2) {
			return op1 + op2;
		}
	}, 
	RESTA("-"){
		@Override
		public double resultado(double op1, double op2) {
			return op1 - op2;
		}
	}, 
	MULTIPLICACION("*"){
		@Override
		public double resultado(double op1, double op2) {
			return op1 * op2;
		}
	}, 
	DIVISION("/"){
		@Override
		public double resultado(double op1, double op2) {
			return op1 / op2;
		}
	};
	
	private String tipo;
	
	Operaciones(String tipo){ 
		this.tipo = tipo;
	}
	
	public abstract double resultado(double op1, double op2);
}