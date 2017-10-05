public class NonActiveState implements State {
    Context mCtx;
    boolean mIsLastFlushed = false;
    int mFlushStartCount = 0;
    
    public NonActiveState(Context ctx) {
        mCtx = ctx;
    }
    public void startApp(){
        if (mIsLastFlushed) {
            mFlushStartCount ++;
        }
        if (mFlushStartCount >2) {
            System.out.println("Enter chicken blood mode. Reason : flush start num >=3");
            mCtx.setCurState(mCtx.ACTIVE_STATE);
        }
        mIsLastFlushed = false;
    }
    public void flush(){
        mIsLastFlushed = true;
    }
    public void screenOff(){
        mFlushStartCount = 0;
        mIsLastFlushed = false;
        mCtx.setCurState(mCtx.NON_ACTIVE_STATE);
    }
}
