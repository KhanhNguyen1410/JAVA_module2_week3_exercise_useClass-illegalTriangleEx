import java.util.Scanner;

public class UseIllegalTriangleEx {
    static void edgeTriangle(int edge1, int edge2, int edge3) throws Exception{
        boolean isTriangle = edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge3 + edge2 > edge1;
        boolean isEdgeTriangle = edge1 > 0 && edge2 > 0 && edge3 > 0;
        if (isTriangle && isEdgeTriangle){
            System.out.println("this is a triangle");
        } else throw  new Exception();

    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter edge of triangle");
        int edge1 = scanner.nextInt();
        int edge2 = scanner.nextInt();
        int edge3 = scanner.nextInt();
        try {
            edgeTriangle(edge1,edge2,edge3);
        }catch (Exception e){
            System.out.println("this is not a triangle");
        }
    }
}
