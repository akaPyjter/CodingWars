package Varqina;

public class WriteNumberinExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(9000000));
    }

    public static String expandedForm(int num) {
        System.out.println(num);
        StringBuilder stringBuilder = new StringBuilder();
        char[] tab = String.valueOf(num).toCharArray();
        for ( int i=0 ; i < tab.length;i++)
        {
            if (tab[i]!= '0')
            {
                stringBuilder.append(tab[i]);
                for ( int j=i;j<tab.length-1;j++)
                {
                    stringBuilder.append("0");
                }
                if (i<tab.length-1 && tab[tab.length-1]!='0')
                {

                    stringBuilder.append(" + ");
                }
            }
        }
        return stringBuilder.toString();
    }
}
