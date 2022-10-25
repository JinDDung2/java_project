package week6.algorithm;

public class HashTable {
    private int size = 10000;
    private int[] table = new int[size];

    public HashTable() {}

    public HashTable(int size) {
        this.size = size;
    }

    public int hash(String key) {
        int asciiNum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiNum += key.charAt(i);
        }
        return asciiNum % size;
    }

    public void insert(String key, Integer value) {
        int hashCode = hash(key);
        table[hashCode] = value;
        System.out.printf("%s님은 %s방에 들어가시면 됩니다.\n", key, hashCode);
    }

    public int search(String key) {
        return table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown",
                "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim",
                "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim",
                "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim",
                "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae"
                , "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo",
                "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim",
                "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom", "HyeongsangOh", "SuinWoo",
                "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee",
                "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang",
                "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung",
                "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi",
                "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang",
                "SieunHwang", "JunhaHwang"};

        HashTable ht = new HashTable(200);

        for (String name : names) {
            ht.insert(name, ht.hash(name));
        }
        System.out.println(ht.search("JinhyuckHeo"));
    }
}
