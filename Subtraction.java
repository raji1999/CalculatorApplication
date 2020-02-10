package BusinessLogic;

import DataLayer.Data;

public class Subtraction {
	
public int subtract(int a,int b) {
	Data d=new Data();
	int c=a-b;
	
	d.data1(a, b, c, "subtraction");
	return c;
}


}