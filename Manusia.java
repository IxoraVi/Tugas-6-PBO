public class Manusia extends Hewan1{
    public static void main(String[] args){
        Manusia data = new Manusia();
        data.setHidup(true);
        System.out.println("Makanan Saya: "+data.makanan);
        System.out.println("Saya Hidup: "+data.getHidup());
    }
}