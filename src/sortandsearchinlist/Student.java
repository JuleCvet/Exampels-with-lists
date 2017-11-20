
package sortandsearchinlist;

class Student implements Comparable<Student>{
    
    private String name;
    private int age;//ako e Integer(objekt), imame poinakvi set/get, i Compare to go stavame vnatre vo metodot
//return getAge().compareTo(this.age);
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }

    @Override
    public int compareTo(Student t) {
        
        return t.getName().length()-this.getName().length();
        //return -(this.getAge()-t.getAge());
    }  
}
