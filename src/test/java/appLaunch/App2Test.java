package appLaunch;


import org.junit.jupiter.api.Test;

class App2Test {

	App a1=new App();
	
	@Test
	void test() {
		App a12 = a1;
		System.out.println(a12);
	}

}
