import java.util.function.Supplier;

public class MRand implements Supplier<Integer> {
    protected static final long M = 0x1000_0000_0000L;
    protected static final long A = 0x5_DEEC_E66DL;
    protected static final long C = 11L;
    protected static final long MASK = 0x0000_7FFF_FFFF_0000L;
    protected static final int DEC = 16;


    private int borneSuperieure = Integer.MAX_VALUE;
    private long x = 0;

    public MRand(int borneSuperieure) {
        this.borneSuperieure = borneSuperieure;
    }

    @Override
    public Integer get() {
        x = (A * x + C) % M;
        return ( (int)(( x & MASK ) >> DEC ) ) % borneSuperieure;
    }
}
