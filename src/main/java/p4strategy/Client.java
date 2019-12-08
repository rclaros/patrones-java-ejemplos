package p4strategy;

public class Client {
	
	public static void main(String[] args) { 
		
		Fighter fighter = new Paul();
		fighter.display();
		
		KickStrategy kickLightningStrategy = new KickLightningStrategy();
		KickStrategy kickTornadoStrategy = new KickTornadoStrategy();
		KickStrategy kickButterflyStrategy = new KickButterflyStrategy();
		JumpStrategy jumpLongStrategy = new JumpLongStrategy();
		JumpStrategy jumpShortStrategy = new JumpShortStrategy();
		
		
		
		
		System.out.println("Esta es una patada relampago con un salto largo");
		fighter.getKickStrategy(kickLightningStrategy );
		fighter.getJumpStrategy(jumpLongStrategy);
		fighter.kick();
		fighter.jump();
		
		
		System.out.println("Esta es una patada relanpago con un salto corto");
		fighter.getKickStrategy(kickLightningStrategy);
		fighter.getJumpStrategy(jumpShortStrategy);
		fighter.kick();
		fighter.jump();
		
		
		System.out.println("Esto es un patada tornado con un salto largo");
		fighter.getKickStrategy(kickTornadoStrategy );
		fighter.getJumpStrategy(jumpLongStrategy);
		fighter.kick();
		fighter.jump();
		
		
		System.out.println("Esto es una patada tornado con un salto corto");
		fighter.getKickStrategy(kickTornadoStrategy );
		fighter.getJumpStrategy(jumpShortStrategy);
		fighter.kick();
		fighter.jump();
		
		System.out.println("Esto es una patada mariposa con un salto largo");
		fighter.getKickStrategy(kickButterflyStrategy );
		fighter.getJumpStrategy(jumpLongStrategy);
		fighter.kick();
		fighter.jump();
		
		System.out.println("Esta es una patada mariposa con un salto corto");
		fighter.getKickStrategy(kickButterflyStrategy );
		fighter.getJumpStrategy(jumpShortStrategy);
		fighter.kick();
		fighter.jump();

		
		
	}

}
