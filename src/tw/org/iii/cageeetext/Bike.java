package tw.org.iii.cageeetext; //路徑
//import
//只有一個public類別
public class Bike { 
	//Bike has a 屬性 Field 靜態的物件 例如尺寸 速度
	//Bike has a 方法 Method 動態物件 例如吃飯
	//方法不重要 重要的是方法 方法搭配屬性
	//透過方法來改變屬性
	private double speed; //該屬性只能在該類別存取 private 屬性封裝
	//public:全世界 /protected同package可存取/沒有/ private 同class可存取
	//建構式  物件的初始化
	Bike(){
		speed = 4.2;
	}
	Bike(double speed){ //可以指定速度
		this.speed=speed; //this.本類別的物件實體=Bike的speed
	}
	//宣告加速度 方法 不會回傳值
	void upSpeed() {
		speed=speed==0?1:speed*1.5;
	}
	void upSpeed(int gear) {
		speed=speed==0?1:speed*gear*1.5;
	}
	void downSpeed() {
		speed=speed<=1?0:speed*0.8;
	}
	double getSpeed() {
		return speed;
	}
	
}