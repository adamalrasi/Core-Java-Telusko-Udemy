package Hello;

 class A {
    public void show(){
        System.out.println("In show");
    }

    private int age;
    private String name;
    public A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "A [age=" + age + ", name=" + name + "]";
    }
}

class B extends A {
    public B(int age, String name){
        super(age, name);
    }

   
}

class Hello {
    public static void main(String[] args) {
        B obj = new B(25, "Adam");
        obj.show();
        System.out.println(obj.toString());
        
    }
}

