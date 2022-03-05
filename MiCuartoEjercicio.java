public class MiCuartoEjercicio{
	public static void main(String[] arg){
		CalculadoraV2 casio= new CalculadoraV2();
		casio.factorialUtilizandoMientras(5);
		casio.factorialUtilizandoFor(5);
		System.out.println(casio.factorialUtilizandoRecursividad(5));
	}
}