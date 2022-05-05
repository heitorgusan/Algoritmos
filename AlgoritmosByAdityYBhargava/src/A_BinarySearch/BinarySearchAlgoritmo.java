package A_BinarySearch;

public class BinarySearchAlgoritmo {

	public static int binarySearch(int[] arrayInt, int item) {
		int baixo = 0; //Posicionamento /Index Array
		int alto = arrayInt.length - 1;//Posicionamento /Index Array

		while (baixo <= alto) {
			int meio = (baixo + alto) / 2; //Posicionamento Array/Index Array
			int chute = arrayInt[meio]; //Valor
			
			if(chute == item) {
				return meio;
			}else if(chute > item){
				alto = meio -1; //Posicionamento / Index Array
			}else {
				baixo = meio + 1; //Posicionamento / Index Array
			}
		}
		return 0;
	}
	
	
	public static void main(String[]args) {
		int[] arrayInt = {1,3,5,7,9,11,13,17,22};
		System.out.println(binarySearch(arrayInt, 22));
		
	}
}
