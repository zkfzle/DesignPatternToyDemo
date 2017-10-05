class ActiveState implements State {
    Context mCtx;
    public ActiveState(Context ctx) {
        mCtx = ctx; 
    }
    
    public void startApp(){}
    public void flush(){}
    public void screenOff(){
        mCtx.setCurState(mCtx.NON_ACTIVE_STATE);
        System.out.println("Exit chicken blood mode. Reason : Screen Off");
    }


}
