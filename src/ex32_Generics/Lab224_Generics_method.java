package ex32_Generics;

public class Lab224_Generics_method {
    public static void main(String[] args) {
        GenericClass<Integer> intObjRef = new GenericClass(5);
        GenericClass<Integer> stringObjRef = new GenericClass("SAI");


        // T -> it is placeholder only -> it can be any data type.


    }
}
class GenericClass<T>{
    private T data;
    public GenericClass(T data){
        this.data = data;

    }
    public T getData(){
        return this.data;

    }
}
