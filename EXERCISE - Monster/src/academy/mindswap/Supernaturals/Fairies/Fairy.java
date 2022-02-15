package academy.mindswap.Supernaturals.Fairies;

import academy.mindswap.Supernaturals.Supernatural;
import academy.mindswap.Utils.Messages;

public class Fairy extends Supernatural {

    public Fairy() {
        super(30);
    }

    @Override
    public int attack() {
        System.out.printf(Messages.FAIRY_ATTACK, this.getPower());
        return super.attack();
    }
}
