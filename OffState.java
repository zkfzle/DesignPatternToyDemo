public class OffState implements State {
    Context mCtx;
    public OffState(Context ctx) {
        mCtx = ctx;
    }
    public void startApp(){};
    public void flush(){};
    public void screenOff(){};
}
