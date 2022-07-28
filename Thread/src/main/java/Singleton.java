public class Singleton {
    //private static Singleton uniqueInstance;
    private static Singleton uniqueInstance = new Singleton();
    private Singleton() {

    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }

        }
        return uniqueInstance;
    }
    //静态内部类实现
    public static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //枚举实现
    public enum Singleton1{
        INSTANCE;

        private String objName;

        public String getObjName() {
            return objName;
        }

        public void setObjName(String objName) {
            this.objName = objName;
        }
        public static void main(String[] args) {
            //单例模式
            Singleton1 firstSingleton = Singleton1.INSTANCE;
            firstSingleton.setObjName("first");
            System.out.println(firstSingleton.getObjName());
            Singleton1 secondSingleton = Singleton1.INSTANCE;
            secondSingleton.setObjName("secondName");
            System.out.println(firstSingleton.getObjName());
            System.out.println(secondSingleton.getObjName());
 
            try {
                Singleton1[] enumConstants = Singleton1.class.getEnumConstants();
                for (Singleton1 enumConstant : enumConstants) {
                    System.out.println(enumConstant.getObjName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
