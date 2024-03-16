package state_design_pattern;

public class Context {
    private LampState lampState;

    public Context() {
       setLampState(new LampCloseState()); // LampState lampState = new LampCloseState();
    }

    public void onOpen() {
    /*    List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();*/
        lampState.onOpen();
        if(lampState instanceof LampCloseState) {
            setLampState(new LampOpenState());
            System.out.println("Lambanın içsel durumu şu oldu : " + lampState.getClass().getName());
        }
    }

    public void onClose() {
        lampState.onClose();
        if(lampState instanceof LampOpenState) {
            setLampState(new LampCloseState());
            System.out.println("Lambanın içsel durumu şu oldu : " + lampState.getClass().getName());
        }
    }

    public LampState getLampState() {
        return lampState;
    }

    public void setLampState(LampState lampState) {
        this.lampState = lampState;
    }

}
