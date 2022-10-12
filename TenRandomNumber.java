package Assignment3.TenRandomNumber;

class  TenRandomNumber{
    public static void main(String[] args){
        int arr[]=new int[10];
        System.out.println("The array is:");
        for (int i = 0; i < 10; i++) {
            double num =(Math.random()*100);
            arr[i]=(int)num;
            System.out.println(arr[i]);
        }
        System.out.println("Even index elements:");
        for (int i = 0; i <10; i++) {
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Even elements:");
        for (int i = 0; i < 10; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("The reversed array: ");
        for(int i=9;i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println("The first Element is: "+arr[0]+" and The last ELement is: "+arr[9]);

    }
}