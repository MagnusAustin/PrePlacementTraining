final class Demo{
    final void change(){
        System.out.print("Hello");
    }
}

class Demo1 extends Demo{ //error
    void change1(){ //error
        System.out.print("Hi");
    }
}
