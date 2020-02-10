package BusinessLogic;

import DataLayer.Data;

public class Division {
	
public int div(int a,int b) {
	Data d=new Data();
	int c=(int)a/b;
	
	d.data1(a, b, c, "division");
	return c;
}


}