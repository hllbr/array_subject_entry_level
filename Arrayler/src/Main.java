
import java.util.Scanner;


public class Main {
    public static void arrayi_bastır(int [] array){//arrayleri methoda göndermek
        //biz burada int array ile işlemler yapacağımız parametrelerimiz ile ifade ettik
        for(int i = 0;i<array.length;i++){
            System.out.println("Element "+(i+1)+":"+array[i]);
            
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
    }
    public static double arraylerin_ortalaması(int [] array){
        int toplam = 0;
        for(int i = 0;i<array.length;i++){
            toplam += array[i];
        }
        
        return (double)(toplam/array.length);
    }
    public static void main(String[] args) {
        /*
        Türkçe olarak diziler
        diziler bizim belirli bir veri tipinden değerleri depoladığımız bir liste.
        */
        int [] a ;
        //int array cinsinden bir referans oluşturduk
        double [] b ;
        //buraya kadar kaç adet değer tanımlamak istediğimizi ifade etmedik  bunun için 
        int [] c = new int[10];//10 adet değere sahip bir array oluşturmak istiyorum dedik..11.değeri ekleyemessin bu şekildeki bir ifadeye
        //bu yapının içindeki değerlere direkt olarak erişmek istersek indexleri kullanıyoruz bu python daki listeler ve demetler gibi yada C dilindeki arraylerimize ulaştığımız gibi
        //indexler 0'dan başlar.
        //arraylere değer eklemek için a[5) = -35; yazmak yeterli.
        int [] d = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("ifademizin 4. indexi : "+d[4]);
        int [] f = new int[5];
       /* for(int i =0;i<5;i++){
            f[i] =i*58 - 85;
        }  */
        /*Scanner scn = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            System.out.println("Lütfen"+i+". index için bir ifade girişi yapınız.");
            f[i] = scn.nextInt();
        }
        System.out.println("--------------------------------------------------------");
       for(int i =0;i<5;i++){
           System.out.println("f arrayin " +i+".indexi için atadığınız değer "+f[i]+" dir.");
        }*/
    //arrayin boyunu almak istersek
    int [] k ={10,20,30,40,50};
    System.out.println("Arrayin uzunluğu : "+k.length);
        arrayi_bastır(k);
        arrayi_bastır(d);
        System.out.println("ortalama : "+arraylerin_ortalaması(k));
        System.out.println("-*-*-*-*-*-*-*-*-*--*-*-*-*-*--*");
        System.out.println("ortalama : "+arraylerin_ortalaması(d));
        System.out.println("bu yapı clear kod örneği değildir.\n"
                + "çok fazla açıklama barındırdığı için karışıklıklara sebebiyet vermektedir.\n"
                + "anlayışınız için teşekkür ederim\n"
                + "bu ve diğer projeler girhup üzerinde yaptığım tüm projeler için hakimiyetimi ortaya koymek üzere buna benzer açıklamalar içermektedir.\n"
                + "Herşey Tecrübe için....!!!\n"
                + "tekrar anlayışınız için Teşekkür ederim");
    
    
    }
    
}
