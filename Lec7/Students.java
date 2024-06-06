package Lec7;

public class Students {
    String name;
    int age;

    Students(String name, int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) throws Exception{
//        if(age<0){
//            throw new Exception("age can not be -ve");
//        }
//        this.age = age;
//    }
public void setAge(int age) {
    try {
        if(age<0){
            throw new Exception("age can not be -ve");
        }
    }
    catch (Exception e){
        System.out.println(e);
        e.printStackTrace();
    }
    finally {
        System.out.println("i m inside finally");
    }
}
    public void setName(String name) {
        this.name = name;
    }
}
