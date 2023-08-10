package org.tnsif.singledimensionalarray;
//Program to demonstarte on array of objrcts driver class
public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Employees arr[]=new Employees[3];
		arr[0]=new Employees(101,"Hrishi",69000.23);
		arr[1]=new Employees(102,"MrWick",45000.69);
		arr[2]=new Employees(103,"Bruce",15000.00);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
		
	}

}
