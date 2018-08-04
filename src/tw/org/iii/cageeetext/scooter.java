package tw.org.iii.cageeetext;
//宣告繼承Bike extends 延伸 發揚光大 只能繼承一個
//任何一個類別都有父類別 沒寫就是沒寫出來而已
//如果沒有宣稱父類別 就是默認extends object
//只繼承沒有private 的屬性與方法
//改善方法叫做Override
//相同方法名稱 稱作Overload
public class scooter extends Bike{
	private int gear;
	void changeGear(int gear){
		this.gear=gear;
	}
	int getGear() {
		return gear;
	}
	void upSpeed(){
		super.upSpeed();//呼叫父類別用super
		speed*=gear;
	}
	double getSpeed() {
		return speed+2;
	}
}
