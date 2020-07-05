package pl.marcisz.patryk.sda.zdjavapol12.inner;

public class Cringe {
    private int x = 5;

    class InnerCringe {
        private int x = 10;

        class InnerInnerCringe {
            private int x = 15;

            public void allX(){
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(InnerCringe.this.x);
                System.out.println(Cringe.this.x);
            }
        }

    }

    public static void main(String[] args) {
        new Cringe().new InnerCringe().new InnerInnerCringe().allX();
    }

}