package homework.author;

public class M  {

    public static void main(String[] args) {
        int [] arr = {343,5,3,4,5,6,3,2};

        System.out.println(arr[4]);

        int index = 9;
        System.out.println(arr[3]);
        System.out.println(arr[index]);
    }

    Author[] list = new Author[10];


    Author getByIndex(int a){
        return list[a];
    }

}
