public class BanhMiManStore extends BanhMiStore {
    public BanhMiManStore(String tenCuaHang, String diaChiCuaHang) {
        super(tenCuaHang, diaChiCuaHang);
    }

    @Override
    public BanhMi makeBanhMiXaXiu() {
        return new BanhMiXaXiuMan();
    }
}
