package OOP.HomeWork.lesson_4.Weapons.Shields;

public  class AllShilds extends Shield{
        private String type;

        public String getType() {
                return type;
        }

        public AllShilds(int endurance,String type) {
                super(endurance);
                this.type = type;
        }

        @Override
        public String toString() {
                return "{" +
                        "Тип = '" + type + '\'' +
                        ", Прочность = " + endurance +
                        '}';
        }
}
