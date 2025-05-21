package question06;

public class TelevisionRemoteController extends RemoteController {

	@Override
	public void manageChannel() {
		System.out.println("テレビのチャンネルを管理します。");
	}

	@Override
	public void manageVolume() {
		System.out.println("テレビの音量を管理します。");
	}

	@Override
	void showEffect() {
		System.out.println("赤色の光");
	}

}
