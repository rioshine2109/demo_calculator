package main;
import calculator.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		int result = a.Add(20, 10);
		System.out.println(result);
		
		Mutil m = new Mutil();
		int result2 = m.mutil(2, 5);
		System.out.println(result2);
		
		int result3 = Sub.subc(2, 5);
		System.out.println(result3);
	}
	

}
