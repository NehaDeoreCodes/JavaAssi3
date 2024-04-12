////5.Write a class Time with three data members to store hr, min and
//seconds.Create two constructors and apply checks to set valid time.
//(hr<24, min<60,sec<60). Also create display function 
//which displays all data members.


package assignments3;

public class Time {
int hr;
int min;
int sec;


	public Time(int hr, int min, int sec) {
		set(hr, min, sec);
	}
	public Time() {
		this(0, 0, 0);
}

	public void set(int hr, int min, int sec) {
		if(hr >= 0 && hr < 24 && min >= 0 && min < 60 && sec >= 0 && sec < 60) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		}
		else
			System.out.println("invalid");
	}
public void display()
{
	System.out.println("hr="+hr);
	System.out.println("min="+min);
	System.out.println("sec="+sec);
}


	public static void main(String[] args) {
		Time t = new Time(10, 2, 30);
		t.display();

	}

}
