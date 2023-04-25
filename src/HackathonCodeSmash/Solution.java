package HackathonCodeSmash;

import java.util.Scanner;
import java.util.ArrayList;


public class Solution
{
    public static void main(String[] args)
    {
    	Scanner console = new Scanner(System.in);
        int codeListCount = Integer.parseInt(console.nextLine().trim());


       
        ArrayList<String> codeList = new ArrayList<String>();

        for (int i = 0; i < codeListCount; i++)
        {
            String codeListItem = console.nextLine();
            codeList.add(codeListItem);
        }
         


        int shoppingCartCount = Integer.parseInt(console.nextLine().trim());

        ArrayList<String> shoppingCart = new ArrayList<String>();

        for (int i = 0; i < shoppingCartCount; i++)
        {
            String shoppingCartItem = console.nextLine();
            shoppingCart.add(shoppingCartItem);
        }
        console.close();
        int foo = Foo.IsBuyerWinner(codeList, shoppingCart);

        System.out.println(foo);
        
    }
}
