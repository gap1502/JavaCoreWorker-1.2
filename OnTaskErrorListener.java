package JavaCoreWorker_1_2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
