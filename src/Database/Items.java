package Database;

public class Items {

    /*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli

     */
    public static double ItemName(String itemName){
        double deger=0;
        if (itemName.equalsIgnoreCase("Rose teddy bear"))
            deger= 30;
        else
            if (itemName.equalsIgnoreCase("Iphone max"))
                deger=850.23;
            else
                if (itemName.equalsIgnoreCase("Laptop mouse"))
                    deger= 23.50;
                else
                    if (itemName.equalsIgnoreCase("Monitor"))
                        deger= 90.23;
                    else
                        if (itemName.equalsIgnoreCase("charger"))
                            deger= 43.20;
                        else
                            if (itemName.equalsIgnoreCase("hdmi cable"))
                                deger= 5.90;
                            else
                                if (itemName.equalsIgnoreCase("mug"))
                                    deger= 30;
        return deger;
    }


    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */
    public static double colorPrice(String color){
        double deger=0;
        switch (color){
            case "Red": deger= 10; break;
            case "Blue": deger=6; break;
            case "Black":deger=4; break;
            case "White":deger=2; break;

        }
        return deger;
    }

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */

    public static double customText(String text){
        double deger=0;
        if (text.length()>10)
            deger=5;
        else
            deger=3;

        return deger;
    }



}



