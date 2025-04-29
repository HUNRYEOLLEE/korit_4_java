package ch14_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private  PowerButton powerButton;
    private  ChannelDownButton channelDownButton;
    private  ChannelUpButton channelUpButton;
    private  VolumeDownButton volumeDownButton;
    private  VolumeUpButton volumeUpButton;

    public TvRemoteController(
            PowerButton powerButton,
            ChannelDownButton channelDownButton,
            ChannelUpButton channelUpButton,
            VolumeDownButton volumeDownButton,
            VolumeUpButton volumeUpButton)
    {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이상의 field 들을 이용한 메서드들을 정의
    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed();        // 메서드 내에서 메서드를 호출
    }

    public void onPressedChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        System.out.print("TV의 ");
        System.out.println(channelDownButton.onDown());
    }

    public void onPressedChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.print("TV의 ");
        System.out.println(channelUpButton.onUp());
    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        System.out.print("TV의 ");
        System.out.println(volumeDownButton.onDown());
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.print("TV의 ");
        System.out.println(volumeUpButton.onUp());
    }
}
