package sort;

class Data {

    static int[] getUnsortedArray(int size){
        System.out.print("GENERATING DATA...");
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            array[i] = (int) (Math.random()*size + 1);
        }
        System.out.println("   DONE!");
        return array;
    }

}
