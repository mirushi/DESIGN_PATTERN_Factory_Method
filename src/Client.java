public class Client {
    public static void main(String[] args) {
        //Store 1 là store bánh mì chay.
        BanhMiStore store01 = new BanhMiChayStore("Banh mi ong gia", "Khu pho 6 Phuong Linh Trung, Thu Duc");

        //Store 2 là store bánh mì mặn.
        BanhMiStore store02 = new BanhMiManStore("Banh mi ba gia", "Khu pho 6 Phuong Linh Trung, Thu Duc");

        //Tạo ra 2 ổ bánh mì từ 2 store khác nhau.
        BanhMi banhMiXaXiu1 = store01.makeBanhMiXaXiu();
        BanhMi banhMiXaXiu2 = store02.makeBanhMiXaXiu();
    }
}
