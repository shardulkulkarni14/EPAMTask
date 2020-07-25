package Structural;

abstract class Game{
    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}

class Chess extends Game{
    @Override
    void initialize(){
        System.out.println("Chess Initialized");
    }
    @Override
    void start(){
        System.out.println("Chess Started");
    }
    @Override
    void end(){
        System.out.println("Chess Finished");
    }

}


class BasketBall extends Game{
    @Override
    void initialize(){
        System.out.println("BasketBall Initialized");
    }
    @Override
    void start(){
        System.out.println("BasketBall Started");
    }
    @Override
    void end(){
        System.out.println("BasketBall Finished");
    }

}


public class Template{
	public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException {
		BasketBall b=new BasketBall();
		b.initialize();
		b.start();
		b.end();
		
      

    }
}