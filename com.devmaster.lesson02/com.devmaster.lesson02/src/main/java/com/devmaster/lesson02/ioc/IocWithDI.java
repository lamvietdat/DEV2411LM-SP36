package com.devmaster.lesson02.ioc;
// sử dụng ioc với dependency injection

class IocService{
    public void serve(){
        System.out.println("Service is serving");
    }
}

class  IocClient{
    private IocService iocService;
    public IocClient(IocService iocService){
        this.iocService=iocService;
    }
    public void doSomething(){
        iocService.serve();
    }
}

public class IocWithDI {
    public static void main(String[] args) {
        IocService service=new IocService();
        IocClient client=new IocClient(service);
        client.doSomething();
    }
}
