package ch14_abstraction.interfaces;

public class VolumeDownButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 내립니다.");
    }

    @Override
    public String onDown() {
        return "음량을 계속" +  super.onDown();
    }
}
