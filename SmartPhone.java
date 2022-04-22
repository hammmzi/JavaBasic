
public class SmartPhone extends HandyPhone4 implements Audio,Remotable {

	public SmartPhone(String no, String mailAddress) {
		super(no, mailAddress);
	}
	
	public void play() {
		System.out.println("スマートフォンで音楽を再生します。");
	}

	public void stop() {
		System.out.println("スマートフォンの音楽を停止します。");
	}
	
	public void update() {
		System.out.println("スマートフォンでデータをアップロードしました。");
	}

	public void download() {
		System.out.println("スマートフォンでデータをダウンロードしました。");
	}

}
