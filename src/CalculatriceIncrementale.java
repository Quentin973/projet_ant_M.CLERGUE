
public class CalculatriceIncrementale {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
	System.out.println("helloworld");
		
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	//Ajouter
	int ajouter(int a, int b){
	if(b > 0){
	for(int i = 0; i < b; i++){
	
	a++;
	}
	}
	
	if(b<0) {
		for(int i = b; b < 0; i++);
		a--;
	}
	
	return a;
	
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	//Soustraire
	int soustraire(int a, int b){
	for(int i = 0; i < b; i++){
	if(b > 0){
	a--;
	}
	else{
	a++;
	}
	}
	return a;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	//Multiplier
	int multiplier(int a, int b){
	a = Math.abs(a);
	b = Math.abs(b);
	int res = a;
	for(int i = 1; i < b; i++){
	for(int j = 0; j < a; j++){
	res++;
	}
	}
	return res;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	//Diviser
	public int diviser(int a, int b) {
	a = Math.abs(a);
	b = Math.abs(b);
	int res = 0;
	while(a >= b){
	for(int i = 0; i < b; i++){
	a--;
	}
	res = res++;
	}
	return res;
	}	
	
	
	
	
	
	
}
