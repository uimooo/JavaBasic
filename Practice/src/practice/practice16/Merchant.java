package practice.practice16;

public class Merchant {

    final int PRICE = 100;  // 商品の値段
    int stock = 100;         // 在庫
    int money = 0;           // 売上

    // 商品を売る
    void sellItem(int count) {
        this.stock -= count;
        this.money += this.PRICE * count;
    }

    // 売上を取得する
    String confirmMoney() {
        return "売上は" + this.money + "円です。";
    }

}
