package pegion;

import pegion.Pegion;
import quack.Quackable;

public class PegionAdapter implements Quackable {
    Pegion pegion;
    public PegionAdapter(Pegion pegion) {

        this.pegion = pegion;
    }
    public void quack() {
        pegion.cool();
        pegion.cool();
    }
}
