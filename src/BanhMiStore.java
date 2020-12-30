public abstract class BanhMiStore {
    //Tên cửa hàng.
    protected String tenCuaHang;

    //Địa chỉ cửa hàng.
    protected String diaChiCuaHang;

    //Tạo ra một bánh mì xá xíu.
    abstract public BanhMi makeBanhMiXaXiu();

    public BanhMiStore(String tenCuaHang, String diaChiCuaHang) {
        this.tenCuaHang = tenCuaHang;
        this.diaChiCuaHang = diaChiCuaHang;
    }
    //Getter, setter cho các phương thức của BanhMiStore.
}
