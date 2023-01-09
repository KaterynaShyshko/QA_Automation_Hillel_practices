package lesson7;

public class ClassWorkEnum {
        public static void main(String[] args) {
            DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;

            switch (dayOfWeek) {
                case SATURDAY:
                case SUNDAY: {
                    System.out.println("This is weekend");
                    break;
                }
                case TUESDAY: {
                    System.out.println("This is fish day");
                    break;
                }
                case WEDNESDAY: {
                    System.out.println("This is the middle of week!!!");
                    break;
                }
                case THURSDAY: {
                    System.out.println("This is week day");
                }
                default: {
                    System.out.println("I want to go home!");
                }
            }

            DayOfWeek[] values = DayOfWeek.values();

            for (DayOfWeek day : values) {
                System.out.println(day.name() + " ==> " + day.ordinal() + " ==> " + day.getValue() + " ==> " + day.toString());
            }

            DayOfWeek dayOfWeek1 = DayOfWeek.valueOf("THURSDAY");
            System.out.println(dayOfWeek1);

//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        dayOfWeek1 = DayOfWeek.valueOf(s.toUpperCase());

            dayOfWeek1 = DayOfWeek.valueOf(5);

            System.out.println(dayOfWeek1);

        }

        enum DayOfWeek {
            MONDAY("Понеділок"),
            TUESDAY("Вівторок"),

            WEDNESDAY("Середа"),
            THURSDAY("Четвер"),
            FRIDAY("Пятниця"),
            SATURDAY("Субота"),
            SUNDAY("Неділя");

            private String value;

            DayOfWeek(String value) {
                this.value = value;
            }

            public String getValue() {
                return value;
            }

            public static DayOfWeek valueOf(int ordinal){
                for (DayOfWeek day : DayOfWeek.values()){
                    if (day.ordinal() == ordinal){
                        return day;
                    }
                }
                return MONDAY;
            }

//        @Override
//        public String toString() {
//            return value;
//        }
        }
}
