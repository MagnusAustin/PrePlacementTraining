class Demo{
    final void change(){
        System.out.print("Hello");
    }
}

class Demo1 extends Demo{
    void change(){ //error
        System.out.print("Hi");
    }
}
