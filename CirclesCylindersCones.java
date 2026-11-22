public class CirclesCylindersCones {
	public static void main(String[] args) {
		//arr can be filled with any objects that inherit from Circle
		Circle arr[] = new Circle [5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
	/*
	 * calculates the amount of cones that their area is smaller than or equals to num
	 * calculates the amount of cylinders that their area is bigger than num
	 * calculates the amount of circles that their area is different than num  
	 */
	public static void calcFunction(Circle[] arr, int num){
		int coneAreaSmallerEqualsNumCount = 0;
		int cylinderAreaBiggerThanNumCount = 0;
		int circleAreaDifferentThanNum = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Cone) {
				if (arr[i].getArea() >= num) {
					coneAreaSmallerEqualsNumCount++;
				}
				else if (arr[i] instanceof Cylinder) {
					if (arr[i].getArea() > num) {
						cylinderAreaBiggerThanNumCount++;
					}
				}
				else {
					if (arr[i].getArea() != num) {
						circleAreaDifferentThanNum++;
					}
				}
			}
		}
	}
	//calculates the sum of volume of cylinder in circle array
	public static double getCylinderVolumeArr(Circle[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Cylinder) {
				sum += ((Cylinder)arr[i]).getVolume();
			}
		}
		return sum;
	}
 
}
