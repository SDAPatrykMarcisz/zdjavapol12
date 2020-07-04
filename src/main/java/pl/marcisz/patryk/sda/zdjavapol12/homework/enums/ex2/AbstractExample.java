package pl.marcisz.patryk.sda.zdjavapol12.homework.enums.ex2;

public enum AbstractExample {

    VALUE1 {
        @Override
        String someMethod() {
            return "impl1";
        }
    },

    VALUE2 {
        String someMethod() {
            return "impl2";
        }
    };

    abstract String someMethod();
}

