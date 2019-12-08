package p4strategy;

public abstract class Fighter {
	
	JumpStrategy jumpStrategy;
	KickStrategy kickStrategy;
	
	public void getJumpStrategy(JumpStrategy jumpStrategy) {
		this.jumpStrategy = jumpStrategy;
	}
	
	public void getKickStrategy(KickStrategy kickStrategy) {
		this.kickStrategy = kickStrategy;
	}
	
	public void kick(){
		kickStrategy.kick();
	}
	
	public void jump(){
		jumpStrategy.jump();
	}

	public abstract void display();

}
