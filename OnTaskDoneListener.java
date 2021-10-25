package JavaCoreWorker_1_2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
