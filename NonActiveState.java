public class NonActiveState implements State {
    Context mCtx;
    bool isLastAppLaucher = false;
    
    public NonActiveState(Context ctx) {
        mCtx = ctx;
    }
    public void startApp(){
                
    }
    public void flush(){
    }
    public void screenOff(){
    }
}
