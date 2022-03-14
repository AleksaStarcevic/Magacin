package artikli;

import java.util.Date;
import java.util.Objects;

public class KucnaHemija extends Artikal{
	Date rokTrajanja;

	public Date getTokTrajanja() {
		return rokTrajanja;
	}

	public void setTokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + rokTrajanja;
	}
	
	

	
	
	
}
