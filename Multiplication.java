package BusinessLogic;

import DataLayer.Data;

public class Multiplication {
	
public int multi(int a,int b) {
	Data d=new Data();
	int c=a*b;
	
	d.data1(a, b, c, "multiplication");
	return c;
}


}