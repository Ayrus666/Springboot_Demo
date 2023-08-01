package myspringbootproject.spring.Demo;

interface Game{
	void right();
	void left ();
	void up();
	void down();
}

class Mario1 implements Game{
	public void right() {
		System.out.println("M-right");
	}
	
	public void left() {
		System.out.println("M-left");
	}
	
	public void up() {
		System.out.println("M-up");
	}
	public void down() {
		System.out.println("M-down");
	}
	
}

class Pacman1 implements Game{
	public void right() {
		System.out.println("p-right");
	}
	
	public void left() {
		System.out.println("p-left");
	}
	
	public void up() {
		System.out.println("p-up");
	}
	public void down() {
		System.out.println("p-down");
	}
}

class Contra1 implements Game{
	public void right() {
		System.out.println("c-right");
	}
	
	public void left() {
		System.out.println("c-left");
	}
	
	public void up() {
		System.out.println("c-up");
	}
	public void down() {
		System.out.println("c-down");
	}
}

class Gamerunner1{
	
	
	
	
	void playgame(Game obj) {
		obj.left();
		obj.right();
		obj.up();
		obj.down();
	}
	
}


public class Iterator2 {

	public static void main(String[] args) {
		
		Mario1 ma = new Mario1();
		Pacman1 pm= new Pacman1();
		Contra1 ca= new Contra1();
		
		Gamerunner1 gr= new Gamerunner1();
		gr.playgame(ma);
		System.out.println();
		gr.playgame(ca);
		
	}

}
