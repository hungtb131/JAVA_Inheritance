package JAVA_inheritance.moveablepoint;

public class Move_Test {
    public static void main(String[] args) {

        MoveablePoint moveablePoint = new MoveablePoint(5.0f,5.0f,1.0f,1.0f);

        float[] arr1 = moveablePoint.getSpeed();
        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("arrSpeed");
        for (int j = 0; j<5; j++) {
            float[] arr2 = moveablePoint.move();
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }
        }

        System.out.println(moveablePoint);
    }
}
