package com.devmaster.lesson02.ioc;
//không sử dụng Ioc
class Service{
    public void serve(){
        System.out.println("Serviceisis serving");
    }
}

class Client{
    private Service service;
    public Client(){
        service=new Service();
    }
    public void doSomething(){
        service.serve();
    }
}
public class NonIoc {
    public static void main(String[] args) {
        Client client=new Client();
        client.doSomething();
    }
}
