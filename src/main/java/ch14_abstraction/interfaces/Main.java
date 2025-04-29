package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), new VolumeDownButton(), new VolumeUpButton()
        );
        // 별개의 PowerButton 객체를 생성해서 메서드 호출이 가능한가?
//        PowerButton powerButton = new PowerButton();

        tvRemoteController.onPressedPowerButton();  // 결과 : 전원을 켭니다.
//        powerButton.onPressed(); // 물론 가능하다     // 결과 : 전원을 켭니다. -> 별개로 굴러간다
        tvRemoteController.onPressedPowerButton();  // 결과 : 전원을 끕니다.
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();
    }
}
