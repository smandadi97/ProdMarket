package com.example.walmartAssessment;

/*This class is to define all functions after the attributes are mapped.
Based on the search word, the function returns different arrays.
* */
public class WalmartAssessmentModel {
        //This function is to return different number of products based on the search word
        public int totalrows(String lookup) {
        return 3;
    }
    public int[] findid(String lookup) {
            //This function returns array of Product IDs depending on the seaarch word
        if(lookup.equals("bag")) {
            return new int[]{10000001, 10000002, 10000003};
        }
        if(lookup.equals("perfume")) {
            return new int[]{10000004, 10000005, 10000006};
        }
        if(lookup.equals("lipstick")) {
            return new int[]{10000007, 10000008, 10000009};
        }

        return new int[]{0};
    }

    public String[] finddescription(String lookup) {
        //This function returns array of descriptions depending on the search word
        if(lookup.equals("bag"))
            return new String[]{"Nanushka\n" +
                    "gathered top-handle tote", "Moschino\n" +
                    "logo-lettering patent shoulder bag", "JW Anderson\n" +
                    "Bumper-Moon leather shoulder bag"};

        if(lookup.equals("perfume")) {
            return new String[]{"Yves Saint Laurent Beauty\n" +
                    "Libre Le Parfum", "Prada Fragrance\n" +
                    "Paradoxe eau de parfum", "Tom Ford Beauty\n" +
                    "Black Orchid eau de parfum"};
        }
        if(lookup.equals("lipstick")) {
            return new String[]{"Charlotte Tilbury\n" + "Matte Revolution lipstick", "CHANEL\n" +
                    "LE ROUGE DUO ULTRA TENUE Ultrawear Liquid Lip Colour", "Westman Atelier\n" +
                    "Squeaky Clean liquid lip balm" };
        }
        return new String[]{"null"};
    }

    public String[] findimg(String lookup) {
        //This function returns array of images depending on the search word
        if(lookup.equals("bag"))
            return new String[] {"https://cdn-images.farfetch-contents.com/18/04/08/04/18040804_39910231_480.jpg", "https://cdn-images.farfetch-contents.com/18/63/04/90/18630490_40259947_480.jpg" , "https://cdn-images.farfetch-contents.com/18/38/13/76/18381376_40060687_480.jpg"};
        if(lookup.equals("perfume")) {
            return new String[]{"https://cdn-images.farfetch-contents.com/18/93/55/90/18935590_41653135_1000.jpg", "https://cdn-images.farfetch-contents.com/18/94/80/69/18948069_41163547_1000.jpg", "https://cdn-images.farfetch-contents.com/18/28/57/18/18285718_39212935_1000.jpg"};
        }
        if(lookup.equals("lipstick")) {
            return new String[]{"https://cdn-images.farfetch-contents.com/18/00/19/74/18001974_38666650_1000.jpg", "https://cdn-images.farfetch-contents.com/18/00/71/24/18007124_39260998_1000.jpg", "https://cdn-images.farfetch-contents.com/18/23/12/55/18231255_39281865_1000.jpg"};
        }
        return new String[]{lookup};
    }

    public String[] findimgr(String lookup) {
        //This function returns array of image recommendations depending on the search word
        if(lookup.equals("bag"))
            return new String[] {"https://cdn-images.farfetch-contents.com/18/66/28/89/18662889_40370251_480.jpg", "https://cdn-images.farfetch-contents.com/17/96/07/72/17960772_41024781_480.jpg" , "https://cdn-images.farfetch-contents.com/18/30/26/20/18302620_39269394_480.jpg"};
        if(lookup.equals("perfume"))
            return new String[] {"https://cdn-images.farfetch-contents.com/18/30/26/20/18302620_39269394_480.jpg", "https://cdn-images.farfetch-contents.com/18/28/57/23/18285723_39214305_1000.jpg", "https://cdn-images.farfetch-contents.com/17/97/84/10/17978410_39278498_1000.jpg"};
        if(lookup.equals("lipstick"))
            return new String[] {"https://cdn-images.farfetch-contents.com/18/09/51/21/18095121_39147844_1000.jpg", "https://cdn-images.farfetch-contents.com/18/30/19/95/18301995_39522991_1000.jpg", "https://cdn-images.farfetch-contents.com/18/08/74/19/18087419_38649329_1000.jpg"};
        return new String[]{lookup};
    }

    public String[] finddescriptionr(String lookup) {
        //This function returns array of descriptions for recommendations depending on the search word
        if(lookup.equals("bag"))
            return new String[]{"Moschino teddy bear-print branded backpack", "AMI Paris logo-plaque zip-fastening backpack", "VALENTINO BEAUTY\n" +
                    "Uomo Born In Roma eau de toilette"};
        if(lookup.equals("perfume"))
            return new String[]{"VALENTINO BEAUTY\n" +
                    "Uomo Born In Roma eau de toilette", "Tom Ford Beauty\n" +
                    "Rose Prick eau de parfum", "CHANEL N°5 Eau de Parfum Spray"};
        if(lookup.equals("lipstick"))
            return new String[]{"Gucci Beauty\n" +
                    "Rouge à Lèvres Liquide Mat Liquid Lipstick", "Yves Saint Laurent Beauty\n" +
                    "Rouge Pur Couture lipstick", "Gucci Beauty\n" +
                    "Rouge à Lèvres Satin Lipstick"};
        return new String[]{"jg"};
    }

    public int[] findidr(String lookup) {
        //This function returns array of Product IDs for recommendations depending on the search word
        if(lookup.equals("bag")) {
            return new int[]{20000001, 20000002, 20000003};
        }
        if(lookup.equals("perfume")) {
            return new int[]{20000004, 20000005, 20000006};
        }
        if(lookup.equals("lipstick")) {
            return new int[]{20000007, 20000008, 20000009};
        }
        return new int[]{0};
    }

    public String[] findbrandr(String lookup) {
        //This function returns array of brands for recommendations depending on the search word
        if(lookup.equals("bag"))
            return new String[]{"Moschino", "AMI Paris", "VALENTINO BEAUTY"};
        if(lookup.equals("perfume"))
            return new String[]{"VALENTINO BEAUTY", "Tom Ford Beauty", "Chanel"};
        if(lookup.equals("lipstick"))
            return new String[]{"Gucci", "Yves Saint Laurent Beauty", "Gucci Beauty"};
        return new String[]{"jg"};
    }


    public String[] findbrand(String lookup) {
        //This function returns array of brands depending on the search word
        if(lookup.equals("bag"))
            return new String[]{"Nanushka", "Moschino", "JW Anderson"};
        if(lookup.equals("perfume"))
            return new String[]{"Yves Saint Laurent Beauty","Prada Fragrance", "Tom Ford Beauty"};
        if(lookup.equals("lipstick"))
            return new String[]{"Charlotte Tilbury","Chanel", "Westman Atelier"};
        return new String[]{"jg"};
    }

    public String[] findprice(String lookup) {
        //This function returns array of prices depending on the search word
        if(lookup.equals("bag"))
            return new String[]{"$1,000", "$4,500", "$5,300"};
        if(lookup.equals("perfume"))
            return new String[]{"$100", "$500", "$89"};
        if(lookup.equals("lipstick"))
            return new String[]{"$32", "$54", "$84"};
        return new String[]{"jg"};
    }

    public String[] findpricer(String lookup) {
        //This function returns array of prices for recommendations depending on the search word
        if(lookup.equals("bag"))
            return new String[]{"$3,000", "$2,500", "$5,900"};
        if(lookup.equals("perfume"))
            return new String[]{"$200", "$531", "$43"};
        if(lookup.equals("lipstick"))
            return new String[]{"$13", "$42", "$34"};
        return new String[]{"jg"};
    }
}


