class Lesson04 {
    public static void main(String[] args) {
        Body taro = new Body();
        taro.weight = 70.0;
        taro.height = 1.7;
        System.out.println("taroのBMIは"+taro.getBmi()+"です。");

        taro.setHeightAsCm(180);
        System.out.println("taroの身長は"+taro.height+"mです。");

        taro.setWeightAndHeight(60.0, 1.7);
        System.out.println("taroの身長は"+taro.height+"m、体重は"+taro.weight+"です。");

        Body jiro = new Body(80, 1.7);
        System.out.println("jiroのBMIは"+jiro.getBmi()+"です。");

        Body hanako = new Body();
        System.out.println("hanakoのBMIは"+hanako.getBmi()+"です。");
    }
}
