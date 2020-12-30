public class BanhMiChayStore extends BanhMiStore {
    public BanhMiChayStore(String tenCuaHang, String diaChiCuaHang) {
        super(tenCuaHang, diaChiCuaHang);
    }

    @Override
    public BanhMi makeBanhMiXaXiu() {
        return new BanhMiXaXiuChay();
    }
}
