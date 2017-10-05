class Context {
    private State mNonActiveState;
    private State mActiveState;
    private State mOffState;
    private State mCurState;
    public static final int NON_ACTIVE_STATE = 0;
    public static final int OFF_STATE = 1;
    public static final int ACTIVE_STATE = 2;

    public Context() {
        mNonActiveState = new NonActiveState(this);
        mOffState = new OffState(this);
        mActiveState = new ActiveState(this);
        mCurState = mNonActiveState;
    }
    
    public void setCurState(int stateID) {
        switch(stateID) {
            case NON_ACTIVE_STATE:
                mCurState = mNonActiveState;
                break;
            case ACTIVE_STATE:
                mCurState = mActiveState;
                break;
            case OFF_STATE:
                mCurState = mOffState;
                break;
            default:
                mCurState = mNonActiveState;
        } 
    }
    void testFlushStartPattern() { 
        // flush, start, flush, start, flush, start ->bingo
        mCurState.flush();
        mCurState.startApp();
        mCurState.flush();
        mCurState.startApp();
        mCurState.flush();
        mCurState.startApp();
        mCurState.screenOff();
    }
}
