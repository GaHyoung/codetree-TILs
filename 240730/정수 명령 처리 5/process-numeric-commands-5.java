import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < count; i++){
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            switch (parts[0]){
                case "push_back":
                    int target = Integer.parseInt(parts[1]);
                    list.add(target);
                    break;
                case "pop_back":
                    list.remove(list.size()-1);
                    break;
                case "get":
                    int index = Integer.parseInt(parts[1]);
                    System.out.println(list.get(index-1)); //k번째 숫자를 출력
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
            }
        }
    }
}