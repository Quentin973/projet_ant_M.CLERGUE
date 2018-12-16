import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceIncrementaleTest {

public void additionTest() {
//cas simple
int a=2;
int b=1;
CalculatriceIncrementale c = new CalculatriceIncrementale();
int attendu = 3;
assertTrue(attendu==c.ajouter(a,b));

//cas nul1
CalculatriceIncrementale cnull = new CalculatriceIncrementale();
assertTrue(3==cnull.ajouter(0,3));

 //casnul2
CalculatriceIncrementale cnull2 = new CalculatriceIncrementale();
assertTrue(3==cnull2.ajouter(3,0));

//casnegatif1
CalculatriceIncrementale cneg1 = new CalculatriceIncrementale();
assertTrue(-2==cneg1.ajouter(-3,1));

//casnegatif2
CalculatriceIncrementale cneg2 = new CalculatriceIncrementale();
 assertTrue(-3==cneg2.ajouter(0,-3));

//casnegatifTotal
CalculatriceIncrementale cneg3 = new CalculatriceIncrementale();
assertTrue(-2==cneg3.ajouter(-1,-1));

}


public void SoustractionTest() {

	//cas simple
	CalculatriceIncrementale c = new CalculatriceIncrementale();
	assertTrue(0==c.soustraire(-1,-1));
	
	//cas Null - pos
	CalculatriceIncrementale c1 = new CalculatriceIncrementale();
	assertTrue(-2==c1.soustraire(0,2));
	
	//cas pos-Null 
		CalculatriceIncrementale c2 = new CalculatriceIncrementale();
		assertTrue(2==c2.soustraire(2,0));
	
	//cas neg - neg 
		CalculatriceIncrementale c3 = new CalculatriceIncrementale();
		assertTrue(0==c3.soustraire(-2,-2));
		
			
}


public void MultiplierTest() {
	//cas simple
	CalculatriceIncrementale c = new CalculatriceIncrementale();
	assertTrue(4==c.multiplier(2,2));
	
	//cas nul * pos
	CalculatriceIncrementale c1 = new CalculatriceIncrementale();
	assertTrue(0==c1.multiplier(0,2));
	
	//cas pos * nul 
	CalculatriceIncrementale c2 = new CalculatriceIncrementale();
	assertTrue(0==c2.multiplier(2,0));
	
	//cas neg * pos
	CalculatriceIncrementale c3 = new CalculatriceIncrementale();
	assertTrue(-2==c3.multiplier(-2,1));
	
	//cas pos * neg 
	CalculatriceIncrementale c4 = new CalculatriceIncrementale();
	assertTrue(-4==c4.multiplier(2,-2));
	
	//cas neg *neg
	CalculatriceIncrementale c5 = new CalculatriceIncrementale();
	assertTrue(4==c5.multiplier(-2,-2));
		
}


public void divisierTest() {
	
	//cas de base 
	CalculatriceIncrementale c = new CalculatriceIncrementale();
	assertTrue(5==c.diviser(10,2));
	
	//cas neg/pos
	CalculatriceIncrementale c1 = new CalculatriceIncrementale();
	assertTrue(-5==c1.diviser(-10,2));
	
	//cas pos/neg
	CalculatriceIncrementale c2 = new CalculatriceIncrementale();
	assertTrue(-5==c2.diviser(10,-2));
	
	//cas null/pos
	CalculatriceIncrementale c3 = new CalculatriceIncrementale();
	assertTrue(0==c3.diviser(0,2));
	
	//cas null/neg
	CalculatriceIncrementale c4 = new CalculatriceIncrementale();
	assertTrue(0==c4.diviser(0,-2));

	//cas neg/neg
	CalculatriceIncrementale c5 = new CalculatriceIncrementale();
	assertTrue(5==c5.diviser(-10,-2));
	
	//meme nombre pos
	CalculatriceIncrementale c6 = new CalculatriceIncrementale();
	assertTrue(1==c.diviser(10,10));
	
	//meme nombre negatif 
	CalculatriceIncrementale c7 = new CalculatriceIncrementale();
	assertTrue(5==c.diviser(-10,-10));

}

}
