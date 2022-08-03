class Time{
		int hour;
		int minute;
		int second;

		public Time (int hour, int minute, int second)
		{ 
			this.second = second;
			this.minute = minute;
			this.hour = hour;
		}

			void add (Time t) {
			
			this.second += t.second;
			if(this.second >=60)
			{
			this.minute++;
			this.second-=60;
			}
			
			this.minute += t.minute;
			if(this.minute>=60)
			{
			this.hour++;
			this.minute -=60;
			}

			this.hour += t.hour;
		}
	}

			public class TimeDemo {
			public static void main(String[] args) { 
			Time t1 = new Time (7,35,55);
			Time t2 = new Time (6,45,5);

			t1.add(t2);

			System.out.println("Hours:"+t1.hour);
			System.out.println("minute:"+ t1.minute);
			System.out.println("second:"+t1.second);
		}
	}