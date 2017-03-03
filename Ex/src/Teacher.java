
public class Teacher {
    private String name,id,tel;
    private char gender;
    private float height,weight;
    public void setTeacher(String name1,String id1){
    	name = name1;
    	id = id1;
     }
    public void setGender(char gender1){
    	if(gender1=='1'){
    		System.out.println("male");
    	}
    	if(gender1=='0'){
    		System.out.println("female");
    	}
    	if(gender1=='2'){
    		System.out.println("none");
    	}
    	gender = gender1;
    }
    public String getName(){
		return name;
    }
    public String getId(){
		return id;
    }
    public char getGender(){
    	return gender;
    }
}
