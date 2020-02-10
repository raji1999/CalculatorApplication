package BusinessLogic;

import DataLayer.Data;

public class Addition {
	
public int add(int a,int b) {
	Data d=new Data();
	int c=a+b;
	
	d.data1(a, b, c, "addition");
	return c;
}


}