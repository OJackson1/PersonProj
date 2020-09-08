
public class person {
  private String name;
  private int age;
  private String jobtitle;
  
  public person() {
	  this.name = "Default Name";
	  this.age = 1;
	  this.jobtitle = "Default";
  }
  
  public person (String name, int age, String  jobtitle) {
	  this.name = name;
	  this.age = age;
	  this.jobtitle = jobtitle;
  }
 
 public String getName() {
	 return name;
	 
 }
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getJobtitle() {
	return jobtitle;
}
public void setJobtitle(String jobtitle) {
	this.jobtitle = jobtitle;
}

@Override
public String toString() {
	return "person [name=" + name + ", age=" + age + ", jobtitle=" + jobtitle + "]";
}


}
  

