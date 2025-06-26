public class coderecap {


private static int numInstances = 0;

private static void addInstance() {
    numInstances++;
}

public static int getCount() {
    return numInstances;
}

public InstanceCounter() {
    InstanceCounter.addInstance();
}


}
