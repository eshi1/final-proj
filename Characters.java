public class Characters {
    public static String[] allchars;

    //method to combine multiple arrays
    public static String[] addArray(String[] items){
        String[] allcharas = new String[328];
        for (int i=0; i<items.length; i++){
            allcharas[i] = items[i];
            //System.out.println(items[i]);
        }
        return allcharas;
    }

    //method of creating all the characters and setting up their arrays
    public static void charas(){
        String[] rank1 = {" 5 star"};
        String[] chara1 = {"Albedo", "Diluc", "Eula", "Jean", "Klee", "Mona", "Venti"};
        //1*7 5-stars (1% chance of occurance)

        String[] rank2 = {" 4 star", " 4 star", " 4 star"}; 
        String[] chara2 = {"Amber", "Barbara", "Bennett", "Diona", "Fischl", "Kaeya", "Lisa", "Mika", "Noelle", "Razor", "Rosaria", "Sucrose"};
        //3*12 4-stars (10% chance of occurance)

        String[] rank3 = {" 3 star", " 3 star", " 3 star"," 3 star", " 3 star", " 3 star", " 3 star", " 3 star", " 3 star", " 3 star", " 3 star", " 3 star", " 3 star", " 3 star", " 3 star"};
        String[] chara3 = {"Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop", "Poop","Poop","Poop"};
        //15*19 3-stars (89% chance of occurance)
        
        String[] stars3 = new String[285];
        for (int i=0; i<stars3.length;i++){
            stars3[i] = chara3[i%19]+rank3[i/19];
           // System.out.println(stars3[i]);
        }
        String[] stars4 = new String[36];
        for (int i=0; i<stars4.length;i++){
            stars4[i] = chara2[i%12]+rank2[i/12];
          //  System.out.println(stars4[i]);
        }
        String[] stars5 = new String[7];
        for (int i=0; i<stars5.length;i++){
            stars5[i] = chara1[i%7]+rank1[i/7];
           // System.out.println(stars5[i]);
        }
        
        //String[] allchars = new String[328];
        int length = stars3.length + stars4.length + stars5.length;

        int aLen = stars3.length;
        int bLen = stars4.length;
        int cLen = stars5.length;
        String[] result = new String[length];

        System.arraycopy(stars3, 0, result, 0, aLen);
        System.arraycopy(stars4, 0, result, aLen, bLen);
        System.arraycopy(stars5, 0, result, aLen+bLen, cLen);
        
        allchars = addArray(result);
    }
    
}