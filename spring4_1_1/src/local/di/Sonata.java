package local.di;

//import org.springframework.context.annotation.Scope;

//@Scope(	

public class Sonata extends Object {
	private String	carColor	= null;
	private int		wheelNum	= 4;
	private int		speed		= 0;
	
	public Sonata() {}

	public Sonata(String carColor, int wheelNum) {
		this.carColor = carColor;
		this.wheelNum = wheelNum;
	}
	public Sonata(String carColor
				, int speed
				, int wheelNum) {
		this.carColor = carColor;
		this.wheelNum = wheelNum;
		this.speed 	  = speed;
		
	}
	public int getSpeed() {
		return speed;
	}

	public String toString() {
		return "자동차 정보 출력하기";
	}
}