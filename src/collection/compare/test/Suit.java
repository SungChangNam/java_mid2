package collection.compare.test;

public enum Suit {
    SPADE("♠"), //스페이트(♠)
    HEART("❤"), //하트(❤)
    DIAMOND("♦"), //다이 몬드(❤)
    CLUB("♣"); //클로버 (♣)
    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
