package model;
//该类属于模型层，表示员工类，该类和数据库中的emp表对应
public class Emp {
	//该类中的内容和emp表中的每一列一一对应
	public int id;   //员工号
	public String name;   //员工姓名
	public double salary;  //员工工资

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int age;   //员工的年龄
	
	
	//调出toString方法，在输出Emp员工的对象的时候，按照该toString的格式输出员工对象
	//toString   Alt+/
	public String toString() {
		return id+","+name+","+salary+","+age;
	}
}
