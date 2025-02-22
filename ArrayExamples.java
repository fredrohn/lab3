

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }

  static void reverseInPlaceFixed(int[] arr) {
    int[] reversedArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      reversedArray[i] = arr[arr.length - 1 - i];
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = reversedArray[i];
    }
  }



  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
      //doesn't fill the new array, it's always 0
    }
    return arr;
    //doens't return the new array
  }

  static int[] reversedFixed(int[] arr){
    int[] reversedArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      reversedArray[i] = arr[arr.length - 1 - i];
    }
    return reversedArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }

  static double averageWithoutLowestFixed(double[] arr){
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] < lowest){lowest = arr[i]; index = i;} 
    }

    double sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if(i != index){
        sum+=arr[i];
      }
    }
    
    return sum/(arr.length-1);
  }


}

