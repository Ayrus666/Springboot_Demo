package myspringbootproject.spring.Demo;

class Mario{
	void right() {
		System.out.println("M-right");
	}
	
	void left() {
		System.out.println("M-left");
	}
	
	void up() {
		System.out.println("M-up");
	}
	void down() {
		System.out.println("M-down");
	}
	
}

class Pacman{
	void right() {
		System.out.println("p-right");
	}
	
	void left() {
		System.out.println("p-left");
	}
	
	void up() {
		System.out.println("p-up");
	}
	void down() {
		System.out.println("p-down");
	}
}

class Contra{
	void right() {
		System.out.println("c-right");
	}
	
	void left() {
		System.out.println("c-left");
	}
	
	void up() {
		System.out.println("c-up");
	}
	void down() {
		System.out.println("c-down");
	}
}

class Gamerunner{
	Pacman obj;
	
	public Gamerunner(Pacman obj) {
		this.obj=obj;
	}
	
	void gamerunner() {
		obj.left();
		obj.right();
		obj.up();
		obj.down();
	}
	
}

public class Iterator1 {

	public static void main(String args []) {
		Mario ma = new Mario();
		Pacman pm= new Pacman();
		Contra ca= new Contra();
		
		Gamerunner gr= new Gamerunner(pm);
		gr.gamerunner();
	}
	
}
