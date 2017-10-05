class Entry {
    private static State mNonActiveState;
    private static State mOffState;
    private Context mCtx = new Context(); 
    private State mCurState = mNonActveState;

    public Entry() {
        mNonActiveState = new NonActiveState(mCtx);
        mOffState = new OffState(mCtx);
    }
    public static void main(String args[]) {
	    System.out.println("Hello world!");
        // flush, start, flush, start, flush, start ->bingo
        

    }
}
